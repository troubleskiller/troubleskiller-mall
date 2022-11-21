package com.troubleskiller.mall.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.common.utils.Query;

import com.troubleskiller.mall.admin.dao.VideoDao;
import com.troubleskiller.mall.admin.entity.VideoEntity;
import com.troubleskiller.mall.admin.service.VideoService;


@Service("videoService")
public class VideoServiceImpl extends ServiceImpl<VideoDao, VideoEntity> implements VideoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<VideoEntity> page = this.page(
                new Query<VideoEntity>().getPage(params),
                new QueryWrapper<VideoEntity>()
        );

        return new PageUtils(page);
    }

}