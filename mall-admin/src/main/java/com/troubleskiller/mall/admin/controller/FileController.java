package com.troubleskiller.mall.admin.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.troubleskiller.mall.admin.entity.FileEntity;
import com.troubleskiller.mall.admin.service.FileService;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.common.utils.R;



/**
 * 
 *
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-21 16:05:01
 */
@RestController
@RequestMapping("admin/file")
public class FileController {
    @Autowired
    private FileService fileService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = fileService.queryPage(params);

        return R.ok().put("data", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		FileEntity file = fileService.getById(id);

        return R.ok().put("file", file);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FileEntity file){
		fileService.save(file);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FileEntity file){
		fileService.updateById(file);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		fileService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
