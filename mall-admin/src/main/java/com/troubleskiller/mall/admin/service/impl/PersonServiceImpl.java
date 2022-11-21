package com.troubleskiller.mall.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.common.utils.Query;

import com.troubleskiller.mall.admin.dao.PersonDao;
import com.troubleskiller.mall.admin.entity.PersonEntity;
import com.troubleskiller.mall.admin.service.PersonService;


@Service("personService")
public class PersonServiceImpl extends ServiceImpl<PersonDao, PersonEntity> implements PersonService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PersonEntity> page = this.page(
                new Query<PersonEntity>().getPage(params),
                new QueryWrapper<PersonEntity>()
        );

        return new PageUtils(page);
    }

}