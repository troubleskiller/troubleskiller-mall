package com.troubleskiller.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-11 13:32:46
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

