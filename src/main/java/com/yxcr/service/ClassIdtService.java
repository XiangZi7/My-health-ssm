package com.yxcr.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yxcr.pojo.ClassIdt;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yxcr.pojo.SchIdt;

import java.util.List;

/**
 * @author yxcr
 * @description 针对表【class_idt】的数据库操作Service
 * @createDate 2022-05-31 00:07:13
 */
public interface ClassIdtService extends IService<ClassIdt> {
    /**
     * 查询班级信息
     *
     * @param current
     * @param size
     * @return
     */
    public Page<ClassIdt> clsAll(Long current, Long size);

    /**
     * 添加班级
     *
     * @param classIdt
     * @return
     */
    public int clsAdd(ClassIdt classIdt);

    public ClassIdt selectById(int id);

    /**
     * 根据班级编号或班级名称动态模糊查询
     *
     * @param cdid
     * @param cdname
     * @param current
     * @param size
     * @return
     */
    public Page<ClassIdt> ClassLikesearch(String cdid, String cdname, Long current, Long size);

    /**
     * 根据ID来查询班级信息
     *
     * @param bh
     * @return
     */
    public ClassIdt Classshowupte(Long bh);

    /**
     * 根据ID修改班级信息
     *
     * @param classIdt
     * @return
     */
    public int ClassUpdate(ClassIdt classIdt);

    /**
     * 根据Id删除
     *
     * @param bh
     * @return
     */
    public int DeleteById(Long bh);

    /**
     * 根据Ids批量删除
     *
     * @param bh
     * @return
     */
    public int DeleteByIds(Long[] bh);

    List<ClassIdt> selectByCdId(String cdId);
}
