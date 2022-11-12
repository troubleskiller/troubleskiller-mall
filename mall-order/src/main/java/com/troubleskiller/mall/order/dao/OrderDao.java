package com.troubleskiller.mall.order.dao;

import com.troubleskiller.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-11 13:17:19
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
