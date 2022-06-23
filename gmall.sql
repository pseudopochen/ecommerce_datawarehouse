-- ods_log
/*drop table if exists ods_log;
create external table ods_log (`line` string) partitioned by (`dt` string) 
stored as 
INPUTFORMAT 'com.hadoop.mapred.DeprecatedLzoTextInputFormat' 
OUTPUTFORMAT 'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat' 
location '/mnt/gv0/brick/modules/hive/warehouse/gmall.db/ods/ods_log';
*/
-- load data inpath '/origin_data/gmall/log/topic_log/2020-06-14' into table ods_log partition(dt='2020-06-14');

-- create index for the lzo file just created, execute in shell,
-- hadoop jar /mnt/gv0/brick/modules/hadoop/hadoop-3.1.3/share/hadoop/common/hadoop-lzo-0.4.20.jar com.hadoop.compression.lzo.DistributedLzoIndexer /mnt/gv0/brick/modules/hive/warehouse/gmall.db/ods/ods_log/dt=2020-06-14
