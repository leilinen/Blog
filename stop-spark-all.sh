#!/usr/bin/env bash

echo "stopping spark cluster"
${SPARK_HOME}/sbin/stop-all.sh

echo "stopping hadoop cluster"
LOCAL_FOLDER=$(dirname $(readlink -f "$0"))
${LOCAL_FOLDER}/stop-hadoop.sh
