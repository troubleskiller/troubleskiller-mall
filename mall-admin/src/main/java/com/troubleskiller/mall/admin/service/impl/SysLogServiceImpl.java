package com.troubleskiller.mall.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.common.utils.Query;

import com.troubleskiller.mall.admin.dao.SysLogDao;
import com.troubleskiller.mall.admin.entity.SysLogEntity;
import com.troubleskiller.mall.admin.service.SysLogService;


@Service("sysLogService")
public class SysLogServiceImpl extends ServiceImpl<SysLogDao, SysLogEntity> implements SysLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SysLogEntity> page = this.page(
                new Query<SysLogEntity>().getPage(params),
                new QueryWrapper<SysLogEntity>()
        );

        return new PageUtils(page);
    }

}