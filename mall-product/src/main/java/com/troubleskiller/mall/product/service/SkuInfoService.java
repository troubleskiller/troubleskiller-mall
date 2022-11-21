package com.troubleskiller.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.mall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-17 21:11:55
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

