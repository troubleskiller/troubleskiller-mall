package com.troubleskiller.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.mall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-17 21:11:52
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

