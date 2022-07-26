package com.yxcr.controller;


import com.yxcr.pojo.ManagementInfo;
import com.yxcr.service.ManagementInfoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController  //采用这个注解可以返回json格式
@RequestMapping("/mang")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true") //解决跨域
public class ManagementInfocontroller {
    @Resource
    private ManagementInfoService managementInfoService;

    @GetMapping("/selectByid")
    public List<ManagementInfo> selectById(Integer zwid){
        return managementInfoService.selectByZwid(zwid);
    }
}
