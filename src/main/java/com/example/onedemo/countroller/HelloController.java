package com.example.onedemo.countroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

    @RequestMapping("/helloJson")
    public Map<String, String> helloJson() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("code", "1");
        map.put("msg", "hello world");
        return map;
    }
}
