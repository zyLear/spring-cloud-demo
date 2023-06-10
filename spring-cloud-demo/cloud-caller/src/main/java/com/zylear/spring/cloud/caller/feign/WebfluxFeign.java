package com.zylear.spring.cloud.caller.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "cloud-webflux-provider")
@Component
public interface WebfluxFeign {

    @GetMapping(value = "/webflux/hello")
    String hello();

}
