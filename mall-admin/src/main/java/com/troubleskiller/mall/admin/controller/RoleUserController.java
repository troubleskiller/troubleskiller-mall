package com.troubleskiller.mall.admin.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.troubleskiller.mall.admin.entity.RoleUserEntity;
import com.troubleskiller.mall.admin.service.RoleUserService;
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
@RequestMapping("admin/roleuser")
public class RoleUserController {
    @Autowired
    private RoleUserService roleUserService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = roleUserService.queryPage(params);

        return R.ok().put("data", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
    public R info(@PathVariable("userId") String userId){
		RoleUserEntity roleUser = roleUserService.getById(userId);

        return R.ok().put("roleUser", roleUser);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RoleUserEntity roleUser){
		roleUserService.save(roleUser);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RoleUserEntity roleUser){
		roleUserService.updateById(roleUser);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] userIds){
		roleUserService.removeByIds(Arrays.asList(userIds));

        return R.ok();
    }

}
