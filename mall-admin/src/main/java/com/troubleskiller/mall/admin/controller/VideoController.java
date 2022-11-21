package com.troubleskiller.mall.admin.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.troubleskiller.mall.admin.entity.VideoEntity;
import com.troubleskiller.mall.admin.service.VideoService;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.common.utils.R;



/**
 * 
 *
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-21 16:04:59
 */
@RestController
@RequestMapping("admin/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = videoService.queryPage(params);

        return R.ok().put("data", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		VideoEntity video = videoService.getById(id);

        return R.ok().put("video", video);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody VideoEntity video){
		videoService.save(video);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody VideoEntity video){
		videoService.updateById(video);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		videoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
