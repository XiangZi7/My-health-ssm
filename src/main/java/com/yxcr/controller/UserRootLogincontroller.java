package com.yxcr.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yxcr.pojo.UserRoot;
import com.yxcr.service.UserRootService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController  //采用这个注解可以返回json格式
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true") //解决跨域
public class UserRootLogincontroller {
    @Resource
    private UserRootService userRootService;


    /**
     * 登陆验证
     */
    @GetMapping("/login")
    public Object AdminAll(String aid, String pwd) {
        return  userRootService.login(aid, pwd);
    }
    /**
     * 查询用户信息
     *
     * @param current
     * @param size
     * @return
     */
    @GetMapping("/adminAll")
    public Page<UserRoot> UserAll(Long current, Long size) {
        return userRootService.AdminAll(current, size);
    }

    /**
     * 添加用户
     *
     * @param userRoot
     * @return
     */
    @GetMapping("/addAdmin")
    public int addUser(UserRoot userRoot) {
        return userRootService.addAdmin(userRoot);

    }

    /**
     * 根据ID来查询用户信息
     *
     * @param aid
     * @return
     */
    @GetMapping("/selectById")
    public UserRoot selectById(String aid) {
        return userRootService.selectById(aid);
    }

    /**
     * 根据用户编号或用户名称动态模糊查询
     *
     * @param aid
     * @param name
     * @param current
     * @param size
     * @return
     */
    @GetMapping("/fuQuery")
    public Page<UserRoot> FuQuery(String aid, String name, Long current, Long size) {
        return userRootService.FuQuery(aid, name, current, size);
    }

    /**
     * 根据ID来查询用户信息
     *
     * @param aid
     * @return
     */
    @GetMapping("/DisplayData")
    public UserRoot UserShowUpdate(String aid) {
        return userRootService.AdminShowUpdate(aid);
    }

    /**
     * 根据ID修改用户信息
     *
     * @param userLogin
     * @return
     */
    @GetMapping("/AdminUpdate")
    public int UserUpdate(UserRoot userLogin) {
        return userRootService.UserUpdate(userLogin);
    }

    /**
     * 根据Id删除
     *
     * @param aid
     * @return
     */
    @GetMapping("/deleteById")
    public int DeleteById(String aid) {
        return userRootService.DeleteById(aid);
    }
//
    @GetMapping("/deleteByIds")
    public int DeleteByIds(String[] aid) {
        return userRootService.DeleteByIds(aid);
    }
}
