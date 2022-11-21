package com.troubleskiller.mall.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.common.utils.Query;

import com.troubleskiller.mall.admin.dao.SettingDefaultTabDao;
import com.troubleskiller.mall.admin.entity.SettingDefaultTabEntity;
import com.troubleskiller.mall.admin.service.SettingDefaultTabService;


@Service("settingDefaultTabService")
public class SettingDefaultTabServiceImpl extends ServiceImpl<SettingDefaultTabDao, SettingDefaultTabEntity> implements SettingDefaultTabService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SettingDefaultTabEntity> page = this.page(
                new Query<SettingDefaultTabEntity>().getPage(params),
                new QueryWrapper<SettingDefaultTabEntity>()
        );

        return new PageUtils(page);
    }

}