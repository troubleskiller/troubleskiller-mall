package com.troubleskiller.mall.coupon.dao;

import com.troubleskiller.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-11 16:35:31
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
