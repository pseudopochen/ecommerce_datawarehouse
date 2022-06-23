# Datawarehouse for e-commerce

## Description
This project is a datawarehouse for storing, processing and visualizing two types of data generated 
at an e-commerce website:

- log data of user behavior stored in files, 
- business process data stored in MySQL.

The datawarehouse has 5 layers from bottom to top: ODS, DWD, DWS, DWT, ADS and also the DIM layer for all dimension tables.
Data in the lower layer are the input to its upper layer. The input to the ODS layer comes from the log files and the tables in MySQL.

### ODS
The business process data stored in the tables in MySQL are imported into HDFS using Sqoop (mysql_to_hdfs_init.sh for first day, mysql_to_hdfs.sh for following days).
The storage format is lzop (i.e., splittable LZO compression). And the LZO index file is created for each table.

The log data are imported using Flume and Kafka. The pipeline is like: file -> Flume -> Kafka -> Flume -> HDFS.
For the first Flume conf has TAILDIR source and Kafka sink. The second Flume conf has Kafka source and HDFS sink.
An interceptor (TimeStampInterceptor.java) is added in the second Flume conf to change the time stamp to the one in the log data.

All Hive tables are partitioned on date and stored in compressed lzop format.

### DWD
The fact tables are stored in the DWD layer.

### DIM
The dimension tables are stored in the DIM layer.

### DWS
Daily summaries of fact tables from the DWD layer are stored in the DWS layer.

### DWT
Topic (theme) summaries 

### ADS

### Workflow


### Ad-hoc Queries



## Built-With
- Hadoop
- Hive
- HBase
- Flume
- Kafka
- Sqoop
- Kylin
- Presto
- Superset
- Zeppelin
- Azkaban
- Zookeeper



