package com.troubleskiller.mall.order.dao;

import com.troubleskiller.mall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-11 13:17:18
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
