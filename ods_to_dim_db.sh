#!/bin/bash

first_day="2020-06-14"
do_date=`date -d "-1 day" +%F`
if [ -n "$2" ] ;then
    do_date=$2
fi
echo $do_date


case $1 in
    "dim_user_info"){
        sed s/$first_day/$do_date/g dim_user_info.sql > tmp_dim_user_info.sql
        hive -f tmp_dim_user_info.sql
    };;
    "dim_sku_info") {
	sed s/$first_day/$do_date/g dim_sku_info.sql > tmp_dim_sku_info.sql
	hive -f tmp_dim_sku_info.sql
    };;
    "dim_coupon_info") {
	sed s/$first_day/$do_date/g dim_coupon_info.sql > tmp_dim_coupon_info.sql
	hive -f tmp_dim_coupon_info.sql
    };;
    "dim_activity_rule_info") {
	sed s/$first_day/$do_date/g dim_activity_rule_info.sql > tmp_dim_activity_rule_info.sql
	hive -f tmp_dim_activity_rule_info.sql
    };;
    "all") {
	sed s/$first_day/$do_date/g dim_user_info.sql > tmp_dim_user_info.sql
	hive -f tmp_dim_user_info.sql
	
	sed s/$first_day/$do_date/g dim_sku_info.sql > tmp_dim_sku_info.sql
	hive -f tmp_dim_sku_info.sql
	
	sed s/$first_day/$do_date/g dim_coupon_info.sql > tmp_dim_coupon_info.sql
	hive -f tmp_dim_coupon_info.sql
	
	sed s/$first_day/$do_date/g dim_activity_rule_info.sql > tmp_dim_activity_rule_info.sql
	hive -f tmp_dim_activity_rule_info.sql
    };;
esac
