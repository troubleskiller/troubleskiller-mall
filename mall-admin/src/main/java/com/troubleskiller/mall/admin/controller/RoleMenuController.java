package com.troubleskiller.mall.admin.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.troubleskiller.mall.admin.entity.RoleMenuEntity;
import com.troubleskiller.mall.admin.service.RoleMenuService;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.common.utils.R;



/**
 * 
 *
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-21 16:05:02
 */
@RestController
@RequestMapping("admin/rolemenu")
public class RoleMenuController {
    @Autowired
    private RoleMenuService roleMenuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = roleMenuService.queryPage(params);

        return R.ok().put("data", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{menuId}")
    public R info(@PathVariable("menuId") String menuId){
		RoleMenuEntity roleMenu = roleMenuService.getById(menuId);

        return R.ok().put("roleMenu", roleMenu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RoleMenuEntity roleMenu){
		roleMenuService.save(roleMenu);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RoleMenuEntity roleMenu){
		roleMenuService.updateById(roleMenu);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] menuIds){
		roleMenuService.removeByIds(Arrays.asList(menuIds));

        return R.ok();
    }

}
