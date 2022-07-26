package com.yxcr.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yxcr.pojo.StuInfo;

import java.util.List;
import java.util.Map;

/**
* @author 79392
* @description 针对表【stu_info】的数据库操作Service
* @createDate 2022-05-31 18:46:43
*/
public interface StuInfoService extends IService<StuInfo> {

//    获取男女人数

    /**
     * 查询学校信息
     *
     * @param current
     * @param size
     * @return
     */
    public Page<StuInfo> StuAll(Long current, Long size);
    /**
     * 添加学校
     *
     * @param stuInfo
     * @return
     */
    public int addStu(StuInfo stuInfo);
    /**
     * 根据ID来查询班级信息
     *
     * @param id
     * @return
     */
    public StuInfo selectById(int id);
    /**
     * 根据班级编号或班级名称动态模糊查询
     *
     * @param sid
     * @param name
     * @param current
     * @param size
     * @return
     */
    public Page<StuInfo> StuFuQuery(String sid, String name, Long current, Long size);
    /**
     * 根据ID来查询班级信息
     *
     * @param bh
     * @return
     */
    public StuInfo StuShowUpdate(Long bh);

    /**
     * 根据ID修改班级信息
     * @param stuInfo
     * @return
     */
    public int StuUpdate(StuInfo stuInfo);
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
     * 根据sid查找数据
     */
    public StuInfo selectBySid(String sid);

    public List<Map<String, Object>> getSexCount();
}
