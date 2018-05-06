package com.fangfaze.java.ffweifuwu.ffFeign;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceFallback implements HelloService {

    public String hiService(String name) {
        return "sorry ," + name;
    }

}
