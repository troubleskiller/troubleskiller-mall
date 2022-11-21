package com.troubleskiller.mall.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.mall.admin.entity.MenuEntity;

import java.util.Map;

/**
 * 
 *
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-21 16:05:00
 */
public interface MenuService extends IService<MenuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

