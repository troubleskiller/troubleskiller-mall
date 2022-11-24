package com.troubleskiller.mall.admin.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.nacos.client.naming.utils.CollectionUtils;
import com.azul.crs.client.Response;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.troubleskiller.mall.admin.entity.UserEntity;
import com.troubleskiller.mall.admin.service.UserService;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.common.utils.R;


/**
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-21 16:04:57
 */
@RestController
@RequestMapping("admin/user")
public class UserController {
    @Autowired
    private UserService userService;


    /**
     * 登陆
     */
    @RequestMapping("/login")
    public R List(@RequestBody UserEntity user) {
        List<UserEntity> list = userService.list(new QueryWrapper<UserEntity>().lambda().eq(UserEntity::getUserName, user.getUserName()).eq(UserEntity::getPassword, user.getPassword()));
        if (CollectionUtils.isEmpty(list)) {
             return R.ok().put("code",401).put("data","用户名或密码错误");
        } else {
            return R.ok().put("code",200).put("token",123123123);
        }
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = userService.queryPage(params);

        return R.ok().put("data", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id) {
        UserEntity user = userService.getById(id);

        return R.ok().put("user", user);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UserEntity user) {
        userService.save(user);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UserEntity user) {
        userService.updateById(user);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids) {
        userService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
