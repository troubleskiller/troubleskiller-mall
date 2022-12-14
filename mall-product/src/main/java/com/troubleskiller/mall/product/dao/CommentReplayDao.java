package com.troubleskiller.mall.product.dao;

import com.troubleskiller.mall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-17 21:11:57
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
