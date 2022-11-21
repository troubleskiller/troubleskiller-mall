package com.troubleskiller.mall.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.common.utils.Query;

import com.troubleskiller.mall.admin.dao.SAreaAgeGenderDao;
import com.troubleskiller.mall.admin.entity.SAreaAgeGenderEntity;
import com.troubleskiller.mall.admin.service.SAreaAgeGenderService;


@Service("sAreaAgeGenderService")
public class SAreaAgeGenderServiceImpl extends ServiceImpl<SAreaAgeGenderDao, SAreaAgeGenderEntity> implements SAreaAgeGenderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SAreaAgeGenderEntity> page = this.page(
                new Query<SAreaAgeGenderEntity>().getPage(params),
                new QueryWrapper<SAreaAgeGenderEntity>()
        );

        return new PageUtils(page);
    }

}