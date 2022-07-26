package com.yxcr.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yxcr.pojo.UserLogin;
import com.yxcr.service.UserLoginService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController  //采用这个注解可以返回json格式
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true") //解决跨域
public class UserLogincontroller {
    @Resource
    private UserLoginService userLoginService;


/**
 * 验证Token
 */
@GetMapping("/checkToken")
public Boolean checkToken(HttpServletRequest request){
    System.out.println(request);
    return userLoginService.checkToken(request);
}
    /**
     * 登陆验证
     */
    @GetMapping("/login")
    public Object UserAll(String sid, String pwd) {
        return  userLoginService.login(sid, pwd);
    }
    /**
     * 查询用户信息
     *
     * @param current
     * @param size
     * @return
     */
    @GetMapping("/userAll")
    public Page<UserLogin> UserAll(Long current, Long size) {
        return userLoginService.UserAll(current, size);
    }

    /**
     * 添加用户
     *
     * @param userLogin
     * @return
     */
    @GetMapping("/addUser")
    public int addUser(UserLogin userLogin) {
        return userLoginService.addUser(userLogin);

    }

    /**
     * 根据ID来查询用户信息
     *
     * @param sid
     * @return
     */
    @GetMapping("/selectById")
    public UserLogin selectById(String sid) {
        return userLoginService.selectById(sid);
    }

    /**
     * 根据用户编号或用户名称动态模糊查询
     *
     * @param sid
     * @param name
     * @param current
     * @param size
     * @return
     */
    @GetMapping("/fuQuery")
    public Page<UserLogin> StuFuQuery(String sid, String name, Long current, Long size) {
        return userLoginService.UserFuQuery(sid, name, current, size);
    }

    /**
     * 根据ID来查询用户信息
     *
     * @param sid
     * @return
     */
    @GetMapping("/DisplayData")
    public UserLogin UserShowUpdate(String sid) {
        return userLoginService.UserShowUpdate(sid);
    }

    /**
     * 根据ID修改用户信息
     *
     * @param userLogin
     * @return
     */
    @GetMapping("/UserUpdate")
    public int UserUpdate(UserLogin userLogin) {
        return userLoginService.UserUpdate(userLogin);
    }

    /**
     * 根据Id删除
     *
     * @param sid
     * @return
     */
    @GetMapping("/deleteById")
    public int DeleteById(String sid) {
        return userLoginService.DeleteById(sid);
    }

    @GetMapping("/deleteByIds")
    public int DeleteByIds(String[] sid) {
        return userLoginService.DeleteByIds(sid);
    }

}
