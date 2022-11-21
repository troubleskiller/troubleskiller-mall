package com.troubleskiller.mall.admin.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.troubleskiller.mall.admin.entity.SAreaAgeGenderEntity;
import com.troubleskiller.mall.admin.service.SAreaAgeGenderService;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.common.utils.R;



/**
 * 
 *
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-21 16:04:58
 */
@RestController
@RequestMapping("admin/sareaagegender")
public class SAreaAgeGenderController {
    @Autowired
    private SAreaAgeGenderService sAreaAgeGenderService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = sAreaAgeGenderService.queryPage(params);

        return R.ok().put("data", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		SAreaAgeGenderEntity sAreaAgeGender = sAreaAgeGenderService.getById(id);

        return R.ok().put("sAreaAgeGender", sAreaAgeGender);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SAreaAgeGenderEntity sAreaAgeGender){
		sAreaAgeGenderService.save(sAreaAgeGender);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SAreaAgeGenderEntity sAreaAgeGender){
		sAreaAgeGenderService.updateById(sAreaAgeGender);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		sAreaAgeGenderService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
