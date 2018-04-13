#!/usr/bin/env bash
echo "starting hadoop"
# /home/leiline/Documents/hadoop/start-hadoop.sh
Jps=`jps | grep -P  'NameNode|SecondaryNameNode|ResourceManager|JobHistoryServer'`
if ["$Jps" != ""]; then
    echo "hadoop is not running"
    LOCAL_FOLDER=$(dirname $(readlink -f "$0"))
    sh ${LOCAL_FOLDER}/start-hadoop.sh
fi
echo "starting spark"
# /usr/local/spark/spark-2.1.1-bin-hadoop2.7/sbin/start-all.sh
${SPARK_HOME}/sbin/start-all.sh
