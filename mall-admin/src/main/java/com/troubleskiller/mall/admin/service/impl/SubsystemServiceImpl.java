package com.troubleskiller.mall.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.common.utils.Query;

import com.troubleskiller.mall.admin.dao.SubsystemDao;
import com.troubleskiller.mall.admin.entity.SubsystemEntity;
import com.troubleskiller.mall.admin.service.SubsystemService;


@Service("subsystemService")
public class SubsystemServiceImpl extends ServiceImpl<SubsystemDao, SubsystemEntity> implements SubsystemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SubsystemEntity> page = this.page(
                new Query<SubsystemEntity>().getPage(params),
                new QueryWrapper<SubsystemEntity>()
        );

        return new PageUtils(page);
    }

}