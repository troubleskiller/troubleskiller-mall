package com.troubleskiller.mall.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.common.utils.Query;

import com.troubleskiller.mall.admin.dao.DictDao;
import com.troubleskiller.mall.admin.entity.DictEntity;
import com.troubleskiller.mall.admin.service.DictService;


@Service("dictService")
public class DictServiceImpl extends ServiceImpl<DictDao, DictEntity> implements DictService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DictEntity> page = this.page(
                new Query<DictEntity>().getPage(params),
                new QueryWrapper<DictEntity>()
        );

        return new PageUtils(page);
    }

}