package com.fangfaze.java.ffweifuwu.ffFeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(value = "config-client", fallback = HelloServiceFallback.class)
public interface HelloService {

    @RequestMapping(value = "/hi", method = GET)
    String hiService(@RequestParam(value = "name") String name);

}
