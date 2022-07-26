package com.yxcr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yxcr.pojo.UserLogin;
import com.yxcr.service.UserLoginService;
import com.yxcr.mapper.UserLoginMapper;
import com.yxcr.util.JwtUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @author 79392
 * @description 针对表【user_login】的数据库操作Service实现
 * @createDate 2022-05-28 23:04:29
 */
@Service
public class UserLoginServiceImpl extends ServiceImpl<UserLoginMapper, UserLogin>
        implements UserLoginService {

    @Resource
    private UserLoginMapper userLoginMapper;

    @Override
    public Object login(String sid, String pwd) {
        LambdaQueryWrapper<UserLogin> lqw = new LambdaQueryWrapper<>();
        lqw.eq(UserLogin::getSid, sid).eq(UserLogin::getPassword, pwd);

        UserLogin user = userLoginMapper.selectOne(lqw);
        if (user != null) {
//            添加token
            user.setToken(JwtUtils.createToken(user.getSid(),user.getName()));
            return user;
        } else {
            return 0;
        }

    }
    public Boolean checkToken(HttpServletRequest request){
        String token = request.getHeader("token");
//        System.out.println(token);
        return JwtUtils.checkToken(token);
    }

    @Override
    public Page<UserLogin> UserAll(Long current, Long size) {
        if (current == null) {
            current = 1L;
        }
        if (size == null) {
            size = 10L;
        }
        Page<UserLogin> page = new Page<>(current, size);
        return userLoginMapper.selectPage(page, null);
    }

    @Override
    public int addUser(UserLogin userLogin) {
        return userLoginMapper.insert(userLogin);
    }

    @Override
    public UserLogin selectById(String sid) {
        return userLoginMapper.selectById(sid);
    }

    @Override
    public Page<UserLogin> UserFuQuery(String sid, String name, Long current, Long size) {
        LambdaQueryWrapper<UserLogin> lqw = new LambdaQueryWrapper<>();
//        判断
        if (sid != null && sid != "") {
            lqw.like(UserLogin::getSid, sid);
        }
        if (name != null && name != "") {
            lqw.like(UserLogin::getName, name);
        }
//        分页 默认页面大小为10
        if (current == null) {
            current = 1L;
        }
        if (size == null) {
            size = 10L;
        }
        Page<UserLogin> page = new Page<>(current, size);
        return userLoginMapper.selectPage(page, lqw);
    }

    @Override
    public UserLogin UserShowUpdate(String sid) {
        return userLoginMapper.selectById(sid);
    }

    @Override
    public int UserUpdate(UserLogin userLogin) {
        return userLoginMapper.updateById(userLogin);
    }

    @Override
    public int DeleteById(String sid) {
        return userLoginMapper.deleteById(sid);
    }

    @Override
    public int DeleteByIds(String[] sid) {
        return userLoginMapper.deleteBatchIds(Arrays.asList(sid));
    }
}




