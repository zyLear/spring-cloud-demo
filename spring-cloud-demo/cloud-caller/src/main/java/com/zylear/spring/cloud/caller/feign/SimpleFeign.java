package com.zylear.spring.cloud.caller.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client")
@Component
public interface SimpleFeign {

    @GetMapping(value = "/client/hello")
    String hello();

}
