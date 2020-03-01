# -*- coding:utf-8 -*-
import commands
import datetime
import requests

parent_path_file="/Users/lilin/PycharmProjects/CheckDataMissing/check_data"
days_limit = 6
bdp_monitor_host_port_prod="http://bdp-falcon-proxy.sf-express.com/falcon/notice/send"
bdp_monitor_host_port_sit="http://bdp.sit.sf-express.com/falcon/notice/send"
alarm_members="01377582"

# read running hdfs parent path from file
def readParentPath():
    f = open(parent_path_file, 'r')
    task_id = []
    abstract_parent_path = []
    for line in f:
        data = line.split(" ")
        task_id.append(data[0])
        abstract_parent_path.append(data[1].replace("\n", "").replace("\r", ""))
    return task_id, abstract_parent_path

def parseChildPath():
    today = datetime.date.today()
    task_id, abstract_parent_paths = readParentPath()
    abstract_child_paths = []
    task_abstract_child_paths = []
    search_days = []
    for befor_day in range(days_limit, 0, -1):
        search_days.append(today - datetime.timedelta(days=befor_day))
    search_days.append(today)

    for abstract_parent_path in abstract_parent_paths:
        child_paths = []
        for index in range(len(search_days)):
            child_paths.append(abstract_parent_path + "/" + str(search_days[index].strftime("%Y%m%d")))
        abstract_child_paths.append(child_paths)

    return task_id, abstract_child_paths

def searchPathSize():
    task_ids, abstract_child_paths = parseChildPath()
    for index in range(len(abstract_child_paths)):
        abstract_child_path = abstract_child_paths[index]
        task_id = task_ids[index]
        values = []
        dates = []
        for child_path in abstract_child_path:
            hdfs_command = "hdfs dfs -du -h -s {}".format(child_path)
            command_result_status, command_result_text = commands.getstatusoutput(hdfs_command)
            file_size_value, file_create_date = parseFileSize(command_result_text)
            values.append(file_size_value)
            dates.append(file_create_date)
        status, result = abnormal_detection(values, dates)
        if (status):
            alarm(task_id, result)


def abnormal_detection(values, dates):
    values_length = len(values)
    status = False
    result = []
    for i in range(values_length):
        if (0 == values[i]):
            print "日期 " + str(dates[i]) + " 的数据异常，值为:" + str(values[i])
            status = True
            result.append(str(dates[i]) + "," + str(values[i]))
    return status, result

def alarm(task_id, result):
    dates = []
    values = []
    for index in range(len(result)):
        result_value = result[index]
        result_value_arr = result_value.split(",")
        dates.append(result_value_arr[0])
        values.append(result_value_arr[1])
    alarm_text = "任务{}hive分区{}数据量异常，值为{}，请及时检查！".format(task_id, str(dates), str(values))
    request_report(alarm_text)

def request_report(content):
    # generate report request object
    request_object = dict()
    request_object["userId"] = alarm_members
    request_object["alertMode"] = "1,2,3"
    request_object["subject"] = "实时计算平台告警"
    request_object["content"] = content

    header  = dict()
    header["Content-Type"] = "application/json"
    header["Cache-Control"] = "no-cache"

    response = requests.post(url=bdp_monitor_host_port_sit, data=request_object, header=header)
    current_time = datetime.date.today()
    print ("发送告警成功！当前时间:{}, 发送内容：{}, \n返回结果：{}", current_time, request_object, response)

def parseFileSize(text):
    file_size_value = []
    return file_size_value

def run():
    searchPathSize()

if __name__ == "__main__":
    try:
        run()
    except Exception as e:
        print e

    print '\nBye!\n'