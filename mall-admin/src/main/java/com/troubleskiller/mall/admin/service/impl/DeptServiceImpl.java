package com.troubleskiller.mall.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.common.utils.Query;

import com.troubleskiller.mall.admin.dao.DeptDao;
import com.troubleskiller.mall.admin.entity.DeptEntity;
import com.troubleskiller.mall.admin.service.DeptService;


@Service("deptService")
public class DeptServiceImpl extends ServiceImpl<DeptDao, DeptEntity> implements DeptService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DeptEntity> page = this.page(
                new Query<DeptEntity>().getPage(params),
                new QueryWrapper<DeptEntity>()
        );

        return new PageUtils(page);
    }

}