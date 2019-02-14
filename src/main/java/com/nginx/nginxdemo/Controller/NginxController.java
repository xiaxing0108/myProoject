package com.nginx.nginxdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NginxController {

    @GetMapping("/test")
    public String test(){
        return "test2";
    }

}
