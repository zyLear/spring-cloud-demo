//package com.zylear.spring.cloud.client.manager;
//
//import com.zylear.spring.cloud.client.feign.SimpleFeign;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.Resource;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//import javax.annotation.PostConstruct;
//import java.io.InputStream;
//
///**
// * @author xiezongyu
// * @date 2020/8/20
// */
//@Component
//@Slf4j
//public class FeignManager {
//
//    private RestTemplate restTemplate = new RestTemplate();
//
//    @Autowired
//    private SimpleFeign simpleFeign;
//
//    @PostConstruct
//    private void init() throws Exception {
//        ResponseEntity<Resource> entity = restTemplate.getForEntity("http://www.baidu.com", Resource.class);
//        ResponseEntity<String> exchange = restTemplate.exchange("http://localhost:8761/server/hello", HttpMethod.GET, null, String.class);
//        InputStream inputStream = entity.getBody().getInputStream();
//
//        String hello = simpleFeign.hello();
//        System.out.println(hello);
//        log.info("get succ : {}",exchange.getBody());
//    }
//
//}
