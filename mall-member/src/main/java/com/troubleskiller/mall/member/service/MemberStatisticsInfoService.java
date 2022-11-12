package com.troubleskiller.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.mall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-11 13:32:43
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

