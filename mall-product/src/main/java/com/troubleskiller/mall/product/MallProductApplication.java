package com.troubleskiller.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 导入依赖
 *
 * 配置数据源
 *
 * 配置mybatis——plus
 *
 *
 *
 *
 * 逻辑删除：
 * 1)配置逻辑删除的规则（可省略）
 * 2)配置逻辑删除组件Bean（可省略）
 * 3)Bean加上逻辑删除注解
 */

@EnableDiscoveryClient
@SpringBootApplication
public class mallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(mallProductApplication.class, args);
    }
}
