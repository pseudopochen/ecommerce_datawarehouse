use gmall;

alter view dim_sku_info_view
as
select
    id,
    price,
    sku_name,
    sku_desc,
    weight,
    is_sale,
    spu_id,
    spu_name,
    category3_id,
    category3_name,
    category2_id,
    category2_name,
    category1_id,
    category1_name,
    tm_id,
    tm_name,
    create_time
from dim_sku_info
where dt='2020-06-15';

--拉链维度表视图
create view dim_user_info_view as select * from dim_user_info where dt='9999-99-99';

--全量维度表视图（注意排除复杂数据类型字段）
--create view dim_sku_info_view
--as
--select
--    id,
--    price,
--    sku_name,
--    sku_desc,
--    weight,
--    is_sale,
--    spu_id,
--    spu_name,
--    category3_id,
--    category3_name,
--    category2_id,
--    category2_name,
--    category1_id,
--    category1_name,
--    tm_id,
--    tm_name,
--    create_time
--from dim_sku_info
--where dt=date_add(current_date,-1);
