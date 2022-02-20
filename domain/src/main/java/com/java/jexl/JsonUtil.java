package com.java.jexl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.jexl3.*;

import java.util.Iterator;

/**
 * @Author: zhangmingkun3
 * @Description:
 * @Date: 2020/12/2 14:56
 */
public class JsonUtil {

    public static void main(String[] args) {
        String str = "{\"businessTimeColumn\":\"timestamp\",\"businessTimeFormat\":\"TIMES\"," +
                "\"combinationMode\":\"SUM\",\"dataDelay\":5,\"dimensionType\":\"FIELD\"," +
                "\"dimensionValue\":\"province\",\"fieldValue\":\"orderAmount\",\"fieldValueType\":\"FIELD\"," +
                "\"indexId\":236,\"indexTaskName\":\"指标系统测试\",\"kafkaSourceParam\":{\"bootStrap\":\"127.0.0.1:9092\"," +
                "\"topic\":\"index_topic\"},\"sourceType\":\"Kafka\",\"timeType\":\"BUSINESS\"," +
                "\"tumblingWindowSize\":60,\"windowType\":\"Tumbling\"}";

//        getAllKey(JSON.parseObject(str));

        String json = "{\"businessNumber\":\"212221\",\"userId\":\"142\",\"systemId\":\"2421\",\"mobile\":\"13444444446\",\"payerAccountNo\":\"323232323\",\"payerCertType\":\"1\",\"payerCertNo\":\"343242342342\",\"payerPhone\":\"432423423\",\"payerOpenBankName\":\"付款人开户行名称\",\"payerOpenBankCode\":\"w232\",\"payeeAcctType\":\"1\",\"payeeCertType\":\"1\",\"payeeCertNo\":\"212\",\"payeePhone\":\"1212\",\"payeeOpenBankCode\":\"111\",\"payeeOpenBankName\":\"收款方开户行名称\",\"payeeAccountNo\":\"222\",\"payeeName\":\"收款人姓名\",\"transType\":\"1\",\"receivedDate\":\"2020-01-21\",\"transOrderNo\":\"111\",\"IfAppListAuth\":\"1\",\"IfLocationAuth\":\"1\",\"IfDeviceAuth\":\"1\",\"ip\":\"122.122\",\"amount\":\"28\",\"ifPrincipalCard\":\"1\",\"payOrderNo\":\"111\",\"payAmount\":\"114\",\"envData\":{\"deviceToken\":{\"a\":{\"n\":\"211.111\",\"s\":\"221\"}},\"deviceAppVersion\":\"1\",\"deviceSysVersion\":\"1\",\"deviceMobileVersion\":\"d1\",\"terminal\":\"1\",\"browerName\":\"浏览器名称(小程序)\",\"browerVersion\":\"31\",\"appName\":\"app应用名称\",\"envIp\":\"ip\",\"envWifiMac\":\"1312\",\"envWifiSsid\":\"wifi ssid\",\"longitude\":\"2323\",\"latitude\":\"32323\"}}";
        JSONObject jsonObject = JSONObject.parseObject(json);
        JexlEngine jexl = new JexlBuilder().create();
        JexlContext jc = new MapContext();
        JsonUtil.registerJexl(jsonObject,jc);
        //加
//        String express = "metric['count']+ metric['rate']";
        //数值类型的不能直接进行字符串的拼接。
//        String express = "metric['count'].concat(jobId)";
        //数值类型的toString()之后进行字符串的拼接。
//        String express = "metric['count'].toString().concat(jobId)";
        String express = "envData['deviceToken']['a']['n'].toString().substring(0,3)";
//        String express = "payAmount";
        //字符串拼接
//        String express = "(metric['name']).concat(jobId)";
//        String express = "metric['count']";
//        String express = "s";
        JexlScript expr = jexl.createScript(express);
        try{
            Integer a = 111;
            System.out.println(JSONObject.toJSONString(a));
//            System.out.println( new BigDecimal(String.valueOf("1")));
            Object flag = expr.execute(jc);
//            System.out.println(flag == null ? "111":flag);
            System.out.println(JsonUtil.isNumeric((String)flag));
            System.out.println((String) flag);
            System.out.println(flag);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }


    }

    public static void registerJexl(JSONObject jsonObject,JexlContext jc) {

        Iterator<String> keys = jsonObject.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            Object value = jsonObject.get(key);
//            if (isJsonObject(jsonObject.get(key).toString())) {
//                JSONObject innerObject = JSONObject.parseObject(jsonObject.get(key).toString());
//                registerJexl(innerObject,jc);
//            }else{
            jc.set(key,value);
//                System.out.println("key=" + key + ",value=" + value);
//            }
        }
    }

    public static boolean isNumeric(String str){
        for (int i = str.length();--i>=0;){
            if (!Character.isDigit(str.charAt(i)) && str.charAt(i) != ".".charAt(0)){
                return false;
            }
        }
        return true;
    }
    /**
     * 判断某个Json字符串是否为一个标准的Json字符串
     *
     * @param jsonString
     * @return
     */
    public static Boolean isJsonObject(String jsonString) {
        try {
            JSONObject.parseObject(jsonString);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}