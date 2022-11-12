package com.troubleskiller.mall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.troubleskiller.mall.coupon.dao")
public class mallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(mallCouponApplication.class, args);
    }
}
