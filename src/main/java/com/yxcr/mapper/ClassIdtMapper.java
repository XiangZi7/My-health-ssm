package com.yxcr.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.yxcr.pojo.ClassIdt;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 79392
* @description 针对表【class_idt】的数据库操作Mapper
* @createDate 2022-06-05 15:23:55
* @Entity com.yxcr.pojo.ClassIdt
*/
public interface ClassIdtMapper extends BaseMapper<ClassIdt> {

    List<ClassIdt> selectByCdId(@Param("cdId") String cdId);
}




