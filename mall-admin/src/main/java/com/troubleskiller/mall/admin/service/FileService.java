package com.troubleskiller.mall.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.mall.admin.entity.FileEntity;

import java.util.Map;

/**
 * 
 *
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-21 16:05:01
 */
public interface FileService extends IService<FileEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

