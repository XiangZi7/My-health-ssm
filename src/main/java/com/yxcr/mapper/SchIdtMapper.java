package com.yxcr.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.yxcr.pojo.SchIdt;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 79392
* @description 针对表【sch_idt】的数据库操作Mapper
* @createDate 2022-06-05 15:23:55
* @Entity com.yxcr.pojo.SchIdt
*/
public interface SchIdtMapper extends BaseMapper<SchIdt> {

    List<SchIdt> selectBySdId(@Param("sdId") String sdId);

}




