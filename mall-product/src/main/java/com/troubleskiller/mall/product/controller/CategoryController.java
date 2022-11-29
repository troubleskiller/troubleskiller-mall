package com.troubleskiller.mall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.troubleskiller.mall.product.entity.CategoryEntity;
import com.troubleskiller.mall.product.service.CategoryService;
import com.troubleskiller.common.utils.PageUtils;
import com.troubleskiller.common.utils.R;



/**
 * 商品三级分类
 *
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-17 21:11:51
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = categoryService.queryPage(params);

        return R.ok().put("data", page);
    }


    /**
     * 获取父子结构
     * */
    @RequestMapping("/list/tree")
    public R highCategories(@RequestParam Map<String, Object> params){
        List<CategoryEntity> entities  = categoryService.listWithTree();

        return R.ok().put("data", entities);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok().put("code",200);
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")

    public R delete(@RequestBody Long[] catIds){
        //检查当前删除的菜单是否被别的地方引用，
		categoryService.removeByIds(Arrays.asList(catIds));

        categoryService.removeMenu(Arrays.asList(catIds));
        return R.ok().put("code",200);
    }

}
