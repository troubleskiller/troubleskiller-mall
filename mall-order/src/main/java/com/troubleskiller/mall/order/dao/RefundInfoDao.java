package com.troubleskiller.mall.order.dao;

import com.troubleskiller.mall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-11 13:17:16
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
