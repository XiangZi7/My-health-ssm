package com.yxcr.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yxcr.pojo.ManagementInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 79392
* @description 针对表【management_info】的数据库操作Service
* @createDate 2022-05-28 23:04:29
*/
public interface ManagementInfoService extends IService<ManagementInfo> {

    List<ManagementInfo> selectByZwid(Integer zwid);
}
