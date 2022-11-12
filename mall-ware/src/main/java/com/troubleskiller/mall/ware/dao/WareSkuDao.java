package com.troubleskiller.mall.ware.dao;

import com.troubleskiller.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-11 13:11:39
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
