package com.troubleskiller.mall.product.dao;

import com.troubleskiller.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-10 23:55:22
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
