package com.yxcr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yxcr.mapper.UserRootMapper;
import com.yxcr.pojo.UserRoot;
import com.yxcr.service.UserRootService;
import com.yxcr.util.JwtUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;

/**
* @author 79392
* @description 针对表【user_root】的数据库操作Service实现
* @createDate 2022-05-28 23:04:29
*/
@Service
public class UserRootServiceImpl extends ServiceImpl<UserRootMapper, UserRoot>
    implements UserRootService{

    @Resource
    private UserRootMapper userRootMapper;




    @Override
    public Object login(String aid, String pwd) {
        LambdaQueryWrapper<UserRoot> lqw = new LambdaQueryWrapper<>();
        lqw.eq(UserRoot::getAid, aid).eq(UserRoot::getPassword, pwd);

        UserRoot userRoot = userRootMapper.selectOne(lqw);
        if (userRoot != null) {
//            添加token
            userRoot.setToken(JwtUtils.createToken(userRoot.getAid(),userRoot.getName()));
            return userRoot;
        } else {
            return 0;
        }
    }

    @Override
    public Page<UserRoot> AdminAll(Long current, Long size) {
        if (current == null) {
            current = 1L;
        }
        if (size == null) {
            size = 10L;
        }
        Page<UserRoot> page = new Page<>(current, size);
        return userRootMapper.selectPage(page, null);
    }

    @Override
    public int addAdmin(UserRoot userRoot) {
        return userRootMapper.insert(userRoot);
    }

    @Override
    public UserRoot selectById(String aid) {
        return userRootMapper.selectById(aid);
    }

    @Override
    public Page<UserRoot> FuQuery(String aid, String name, Long current, Long size) {
        LambdaQueryWrapper<UserRoot> lqw = new LambdaQueryWrapper<>();
//        判断
        if (aid != null && aid != "") {
            lqw.like(UserRoot::getAid, aid);
        }
        if (name != null && name != "") {
            lqw.like(UserRoot::getName, name);
        }
//        分页 默认页面大小为10
        if (current == null) {
            current = 1L;
        }
        if (size == null) {
            size = 10L;
        }
        Page<UserRoot> page = new Page<>(current, size);
        return userRootMapper.selectPage(page, lqw);
    }

    @Override
    public UserRoot AdminShowUpdate(String aid) {
        return userRootMapper.selectById(aid);
    }

    @Override
    public int UserUpdate(UserRoot userRoot) {
        return userRootMapper.updateById(userRoot);
    }

    @Override
    public int DeleteById(String aid) {
        return userRootMapper.deleteById(aid);
    }

    @Override
    public int DeleteByIds(String[] aid) {
        return userRootMapper.deleteBatchIds(Arrays.asList(aid));
    }
}




