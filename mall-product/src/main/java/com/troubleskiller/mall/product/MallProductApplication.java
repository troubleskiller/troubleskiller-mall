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
 */

@EnableDiscoveryClient
@SpringBootApplication
public class mallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(mallProductApplication.class, args);
    }
}
