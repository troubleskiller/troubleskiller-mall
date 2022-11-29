package com.troubleskiller.mall.product.service.impl;

import com.troubleskiller.mall.product.entity.CategoryEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.common.utils.Query;

import com.troubleskiller.mall.product.dao.BrandDao;
import com.troubleskiller.mall.product.entity.BrandEntity;
import com.troubleskiller.mall.product.service.BrandService;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>()
        );
        page.setTotal(baseMapper.selectCount( new QueryWrapper<BrandEntity>()));
        System.out.println(baseMapper.selectCount( new QueryWrapper<BrandEntity>()));
        return new PageUtils(page);
    }

}