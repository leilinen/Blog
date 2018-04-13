#!/usr/bin/env bash
echo "start hadoop cluster."

# /usr/local/hadoop/hadoop-2.7.3/sbin/start-dfs.sh
"${HADOOP_HOME}"/sbin/start-dfs.sh

# /usr/local/hadoop/hadoop-2.7.3/sbin/start-yarn.sh
"${HADOOP_HOME}"/sbin/start-yarn.sh

# /usr/local/hadoop/hadoop-2.7.3/sbin/mr-jobhistory-daemon.sh start historyserver
"${HADOOP_HOME}"/sbin/mr-jobhistory-daemon.sh start historyserver


