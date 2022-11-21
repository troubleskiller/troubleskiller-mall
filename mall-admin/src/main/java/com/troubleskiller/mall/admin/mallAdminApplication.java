package com.troubleskiller.mall.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.troubleskiller.mall.admin.dao")
public class mallAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(mallAdminApplication.class, args);
    }
}
