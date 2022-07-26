package com.yxcr.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.yxcr.pojo.StuPedit;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 79392
* @description 针对表【stu_pedit】的数据库操作Mapper
* @createDate 2022-06-05 15:23:55
* @Entity com.yxcr.pojo.StuPedit
*/
public interface StuPeditMapper extends BaseMapper<StuPedit> {
    List<StuPedit> selectBySid(@Param("sid") String sid);


}




