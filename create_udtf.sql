use gmall;
create function explode_json_array as 'com.luban.hive.udtf.ExplodeJSONArray' using jar 'hdfs://localhost:8020/mnt/gv0/brick/modules/hive/jars/udtf-1.0-SNAPSHOT.jar'
