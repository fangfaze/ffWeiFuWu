package com.fangfaze.java.ffweifuwu.ffFeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(HttpServletRequest request, @RequestParam String name) {
        Enumeration<String> names = request.getHeaderNames();

        while (names.hasMoreElements()) {
            String headName = names.nextElement();
            System.out.println(headName + "=" + request.getHeader(headName));
        }

        return helloService.hiService(name);
    }

    @RequestMapping(value = "/hii")
    public String hii(@RequestParam String name) {
        return "hii" + name;
    }

}