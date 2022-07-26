package com.yxcr.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yxcr.pojo.StuInfo;
import com.yxcr.service.StuInfoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController  //采用这个注解可以返回json格式
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true") //解决跨域
public class StuInfocontroller {
    @Resource
    private StuInfoService stuInfoService;

    /**
     * 统计男女
     */
    @GetMapping("/stuSexCount")
    public List<Map<String, Object>> stuSexCount() {
        return stuInfoService.getSexCount();
    }
    /**
     * 查询学生信息
     *
     * @param current
     * @param size
     * @return
     */
    @GetMapping("/stuAll")
    public Page<StuInfo> StuAll(Long current, Long size) {
        return stuInfoService.StuAll(current, size);
    }

    /**
     * 添加学生
     *
     * @param stuInfo
     * @return
     */
    @GetMapping("/addStu")
    public int addStu(StuInfo stuInfo) {
        return stuInfoService.addStu(stuInfo);

    }

    /**
     * 根据学生编号或学生名称动态模糊查询
     *
     * @param sid
     * @param name
     * @param current
     * @param size
     * @return
     */
    @GetMapping("/fuQuery")
    public Page<StuInfo> StuFuQuery(String sid, String name, Long current, Long size) {
        return stuInfoService.StuFuQuery(sid, name, current, size);
    }

    /**
     * 根据ID来查询学生信息
     *
     * @param bh
     * @return
     */
    @GetMapping("/DisplayData")
    public StuInfo StuShowUpdate(Long bh) {
        return stuInfoService.StuShowUpdate(bh);
    }

    /**
     * 根据ID修改学生信息
     *
     * @param stuInfo
     * @return
     */
    @GetMapping("/UpdateStu")
    public int StuUpdate(StuInfo stuInfo) {
        return stuInfoService.StuUpdate(stuInfo);
    }

    /**
     * 根据Id删除
     *
     * @param bh
     * @return
     */
    @GetMapping("/deleteById")
    public int DeleteById(Long bh) {
        return stuInfoService.DeleteById(bh);
    }

    @GetMapping("/deleteByIds")
    public int DeleteByIds(Long[] bh) {
        return stuInfoService.DeleteByIds(bh);
    }

    @GetMapping("/selectBySid")
    public StuInfo SelectBySid(String sid) {
        return stuInfoService.selectBySid(sid);
    }
}
