#!/bin/bash

APP="gmall"

yesterday=`date -d "-1 day" +%F`
echo $yesterday

if [ -n "$1" ];then
    do_date=$1
else
    do_date=$yesterday
fi

sql="use $APP; load data inpath '/origin_data/gmall/log/topic_log/$do_date' into table ods_log partition(dt='$do_date');"
echo $sql
hive -e "$sql"
hadoop jar /mnt/gv0/brick/modules/hadoop/hadoop-3.1.3/share/hadoop/common/hadoop-lzo-0.4.20.jar \
       com.hadoop.compression.lzo.DistributedLzoIndexer \
       /mnt/gv0/brick/modules/hive/warehouse/gmall.db/ods/ods_log/dt=$do_date

