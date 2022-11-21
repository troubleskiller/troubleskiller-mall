package com.troubleskiller.mall.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.common.utils.Query;

import com.troubleskiller.mall.admin.dao.ImageDao;
import com.troubleskiller.mall.admin.entity.ImageEntity;
import com.troubleskiller.mall.admin.service.ImageService;


@Service("imageService")
public class ImageServiceImpl extends ServiceImpl<ImageDao, ImageEntity> implements ImageService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ImageEntity> page = this.page(
                new Query<ImageEntity>().getPage(params),
                new QueryWrapper<ImageEntity>()
        );

        return new PageUtils(page);
    }

}