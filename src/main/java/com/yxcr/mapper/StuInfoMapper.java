package com.yxcr.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yxcr.pojo.StuInfo;
import org.apache.ibatis.annotations.Param;

/**
* @author 79392
* @description 针对表【stu_info】的数据库操作Mapper
* @createDate 2022-06-05 15:23:55
* @Entity com.yxcr.pojo.StuInfo
*/
public interface StuInfoMapper extends BaseMapper<StuInfo> {
   StuInfo selectBySid(@Param("sid") String sid);

}




