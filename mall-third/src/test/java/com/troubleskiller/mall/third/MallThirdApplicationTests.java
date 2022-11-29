package com.troubleskiller.mall.third;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

@EnableDiscoveryClient
@SpringBootTest
class MallThirdApplicationTests {
	@Autowired
	OSSClient ossClient;

	@Test
	void contextLoads() throws IOException {
		InputStream inputStream = Files.newInputStream(Paths.get("/Users/xuhui/troubleskiller_tech/troubleskiller_blog/build/web/assets/assets/image/avatar.jpeg"));
		ossClient.putObject("troubleskiller-mall","b.jpeg",inputStream);
		ossClient.shutdown();
	}

}
