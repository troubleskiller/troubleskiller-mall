package com.troubleskiller.mall.admin.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.troubleskiller.mall.admin.entity.DictItemEntity;
import com.troubleskiller.mall.admin.service.DictItemService;
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
@RequestMapping("admin/dictitem")
public class DictItemController {
    @Autowired
    private DictItemService dictItemService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = dictItemService.queryPage(params);

        return R.ok().put("data", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		DictItemEntity dictItem = dictItemService.getById(id);

        return R.ok().put("dictItem", dictItem);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DictItemEntity dictItem){
		dictItemService.save(dictItem);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DictItemEntity dictItem){
		dictItemService.updateById(dictItem);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		dictItemService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
