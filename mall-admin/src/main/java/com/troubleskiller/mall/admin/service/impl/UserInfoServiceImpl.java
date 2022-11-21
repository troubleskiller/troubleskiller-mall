package com.troubleskiller.mall.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.common.utils.Query;

import com.troubleskiller.mall.admin.dao.UserInfoDao;
import com.troubleskiller.mall.admin.entity.UserInfoEntity;
import com.troubleskiller.mall.admin.service.UserInfoService;


@Service("userInfoService")
public class UserInfoServiceImpl extends ServiceImpl<UserInfoDao, UserInfoEntity> implements UserInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserInfoEntity> page = this.page(
                new Query<UserInfoEntity>().getPage(params),
                new QueryWrapper<UserInfoEntity>()
        );

        return new PageUtils(page);
    }

}