package com.troubleskiller.mall.admin.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.troubleskiller.mall.admin.entity.SettingDefaultTabEntity;
import com.troubleskiller.mall.admin.service.SettingDefaultTabService;
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
@RequestMapping("admin/settingdefaulttab")
public class SettingDefaultTabController {
    @Autowired
    private SettingDefaultTabService settingDefaultTabService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = settingDefaultTabService.queryPage(params);

        return R.ok().put("data", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		SettingDefaultTabEntity settingDefaultTab = settingDefaultTabService.getById(id);

        return R.ok().put("settingDefaultTab", settingDefaultTab);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SettingDefaultTabEntity settingDefaultTab){
		settingDefaultTabService.save(settingDefaultTab);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SettingDefaultTabEntity settingDefaultTab){
		settingDefaultTabService.updateById(settingDefaultTab);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		settingDefaultTabService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
