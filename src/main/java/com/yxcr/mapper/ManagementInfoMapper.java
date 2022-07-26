package com.yxcr.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yxcr.pojo.ManagementInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 79392
* @description 针对表【management_info】的数据库操作Mapper
* @createDate 2022-06-05 15:23:55
* @Entity com.yxcr.pojo.ManagementInfo
*/
public interface ManagementInfoMapper extends BaseMapper<ManagementInfo> {


    List<ManagementInfo> selectByZwid(@Param("zwid") Integer zwid);

}




