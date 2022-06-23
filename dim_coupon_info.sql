-- prevent the lzo index file being included into the insert
set hive.input.format=org.apache.hadoop.hive.ql.io.HiveInputFormat;

use gmall;

insert overwrite table dim_coupon_info partition(dt='2020-06-14')
select
    id,
    coupon_name,
    coupon_type,
    condition_amount,
    condition_num,
    activity_id,
    benefit_amount,
    benefit_discount,
    create_time,
    range_type,
    limit_num,
    taken_count,
    start_time,
    end_time,
    operate_time,
    expire_time
from ods_coupon_info
where dt='2020-06-14';
