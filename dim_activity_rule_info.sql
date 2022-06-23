-- prevent the lzo index file being included into the insert
set hive.input.format=org.apache.hadoop.hive.ql.io.HiveInputFormat;

use gmall;

insert overwrite table dim_activity_rule_info partition(dt='2020-06-14')
select
    ar.id,
    ar.activity_id,
    ai.activity_name,
    ar.activity_type,
    ai.start_time,
    ai.end_time,
    ai.create_time,
    ar.condition_amount,
    ar.condition_num,
    ar.benefit_amount,
    ar.benefit_discount,
    ar.benefit_level
from
(
    select
        id,
        activity_id,
        activity_type,
        condition_amount,
        condition_num,
        benefit_amount,
        benefit_discount,
        benefit_level
    from ods_activity_rule
    where dt='2020-06-14'
)ar
left join
(
    select
        id,
        activity_name,
        start_time,
        end_time,
        create_time
    from ods_activity_info
    where dt='2020-06-14'
)ai
on ar.activity_id=ai.id;
