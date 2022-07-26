package com.yxcr.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yxcr.mapper.ManagementInfoMapper;
import com.yxcr.pojo.ManagementInfo;
import com.yxcr.service.ManagementInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 79392
* @description 针对表【management_info】的数据库操作Service实现
* @createDate 2022-05-28 23:04:29
*/
@Service
public class ManagementInfoServiceImpl extends ServiceImpl<ManagementInfoMapper, ManagementInfo>
    implements ManagementInfoService{
    @Resource
    private ManagementInfoMapper managementInfoMapper;


    @Override
    public List<ManagementInfo> selectByZwid(Integer zwid) {
        return  managementInfoMapper.selectByZwid(zwid);
    }
}




