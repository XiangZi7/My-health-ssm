package com.yxcr.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yxcr.pojo.ClassIdt;
import com.yxcr.pojo.SchIdt;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yxcr.util.JsonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
* @author 79392
* @description 针对表【sch_idt】的数据库操作Service
* @createDate 2022-05-31 00:07:13
*/
public interface SchIdtService extends IService<SchIdt> {
    /**
     * 查询学校信息
     *
     * @param current
     * @param size
     * @return
     */
    public Page<SchIdt> schAll(Long current, Long size);
    /**
     * 添加学校
     *
     * @param schIdt
     * @return
     */
    public int addSch(SchIdt schIdt);
    /**
     * 根据ID来查询班级信息
     *
     * @param id
     * @return
     */
    public SchIdt selectById(int id);
    /**
     * 根据班级编号或班级名称动态模糊查询
     *
     * @param sdid
     * @param sdname
     * @param current
     * @param size
     * @return
     */
    public Page<SchIdt> schLikesearch(String sdid, String sdname, Long current, Long size);
    /**
     * 根据ID来查询班级信息
     *
     * @param bh
     * @return
     */
    public SchIdt schshowupte(Long bh);

    /**
     * 根据ID修改班级信息
     * @param schIdt
     * @return
     */
    public int schUpdate(SchIdt schIdt);
    /**
     * 根据Id删除
     *
     * @param bh
     * @return
     */
    public int DeleteById(Long bh);
    /**
     * 根据Ids删除
     *
     * @param bh
     * @return
     */
    public int DeleteByIds(Long[] bh);
    /**
     * 根据id查询
     */
    List<SchIdt> selectBySdId(String sdId);
}
