package com.zylear.spring.cloud.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "1", url = "http://localhost:8761")
@Component
public interface SimpleFeign {

    @GetMapping(value = "/server/hello")
    String hello();

}
