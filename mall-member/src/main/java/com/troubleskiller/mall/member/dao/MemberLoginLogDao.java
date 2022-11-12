package com.troubleskiller.mall.member.dao;

import com.troubleskiller.mall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-11 13:32:44
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
