package com.troubleskiller.mall.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.common.utils.Query;

import com.troubleskiller.mall.admin.dao.MessageReplayDao;
import com.troubleskiller.mall.admin.entity.MessageReplayEntity;
import com.troubleskiller.mall.admin.service.MessageReplayService;


@Service("messageReplayService")
public class MessageReplayServiceImpl extends ServiceImpl<MessageReplayDao, MessageReplayEntity> implements MessageReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MessageReplayEntity> page = this.page(
                new Query<MessageReplayEntity>().getPage(params),
                new QueryWrapper<MessageReplayEntity>()
        );

        return new PageUtils(page);
    }

}