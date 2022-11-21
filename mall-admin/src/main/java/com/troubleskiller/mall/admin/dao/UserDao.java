package com.troubleskiller.mall.admin.dao;

import com.troubleskiller.mall.admin.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-21 16:04:57
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}
