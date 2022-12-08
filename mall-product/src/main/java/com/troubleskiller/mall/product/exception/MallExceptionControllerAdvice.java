package com.troubleskiller.mall.product.exception;

import com.troubleskiller.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Slf4j
@ResponseBody
//集中处理所有异常
@ControllerAdvice(basePackages = "com.troubleskiller.mall.product.controller")
public class MallExceptionControllerAdvice {
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e) {
        log.error("数据出现问题{},异常类型{}", e.getMessage(), e.getClass());
        BindingResult result = e.getBindingResult();
            Map<String,String> map = new HashMap<String,String>();
            result.getFieldErrors().forEach((error)-> {
                String defaultMessage = error.getDefaultMessage();
                String field = error.getField();
                map.put(field, defaultMessage);
            });
        return R.error(400,"数据校验出现问题").put("data",map );
    }
}
