package com.troubleskiller.mall.coupon;

import com.troubleskiller.mall.coupon.service.SmsMemberPriceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallCouponApplicationTests {
    @Autowired
    SmsMemberPriceService smsMemberPriceService;
    @Test
    void contextLoads() {
        smsMemberPriceService.query();
        System.out.println("成功");
    }

}
