package com.troubleskiller.mall.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.common.utils.Query;

import com.troubleskiller.mall.admin.dao.DictItemDao;
import com.troubleskiller.mall.admin.entity.DictItemEntity;
import com.troubleskiller.mall.admin.service.DictItemService;


@Service("dictItemService")
public class DictItemServiceImpl extends ServiceImpl<DictItemDao, DictItemEntity> implements DictItemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DictItemEntity> page = this.page(
                new Query<DictItemEntity>().getPage(params),
                new QueryWrapper<DictItemEntity>()
        );

        return new PageUtils(page);
    }

}