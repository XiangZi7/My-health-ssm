package com.yxcr.controller;


import com.yxcr.service.UserLoginService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController  //采用这个注解可以返回json格式
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true") //解决跨域
public class TestUser {
    @Resource
    UserLoginService userLoginService;

    @PostMapping("/login1")
    public Object UserAll(String sid, String pwd) {
        return  userLoginService.login(sid, pwd);
    }
}
