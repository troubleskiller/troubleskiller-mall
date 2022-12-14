package com.troubleskiller.mall.third;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MallThirdApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallThirdApplication.class, args);
	}

}
