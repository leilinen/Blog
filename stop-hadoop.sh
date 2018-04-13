#!/usr/bin/env bash
echo "stopping hadoop cluster"
# /usr/local/hadoop/hadoop-2.7.3/sbin/stop-yarn.sh
${HADOOP_HOME}/sbin/stop-yarn.sh
# /usr/local/hadoop/hadoop-2.7.3/sbin/stop-dfs.sh
${HADOOP_HOME}/sbin/stop-dfs.sh
# /usr/local/hadoop/hadoop-2.7.3/sbin/mr-jobhistory-daemon.sh stop historyserver
${HADOOP_HOME}/sbin/mr-jobhistory-daemon.sh stop historyserver
