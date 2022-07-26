package com.yxcr.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yxcr.pojo.StuInfo;
import com.yxcr.pojo.StuPedit;
import com.yxcr.service.StuInfoService;
import com.yxcr.service.StuPeditService;
import com.yxcr.service.impl.StuPeditServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController  //采用这个注解可以返回json格式
@RequestMapping("/stupedit")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true") //解决跨域
public class StuPeditcontroller {
    @Resource
    private StuPeditService stuPeditService;

    /**
     * 查询学生信息
     *
     * @param current
     * @param size
     * @return
     */
    @GetMapping("/stupeditAll")
    public Page<StuPedit> StuAll(Long current, Long size) {
        return stuPeditService.StuPeditAll(current, size);
    }

    /**
     * 添加学生
     *
     * @param stuPedit
     * @return
     */
    @GetMapping("/addstupedit")
    public int addStu(StuPedit stuPedit) {
        return stuPeditService.addStuPedit(stuPedit);

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
    public Page<StuPedit> StuFuQuery(String sid, String name, Long current, Long size) {
        return stuPeditService.StuPeditFuQuery(sid, name, current, size);
    }

    /**
     * 根据ID来查询学生信息
     *
     * @param bh
     * @return
     */
    @GetMapping("/DisplayData")
    public StuPedit StuShowUpdate(Long bh) {
        return stuPeditService.StuPeditShowUpdate(bh);
    }

    /**
     * 根据ID修改学生信息
     *
     * @param stuPedit
     * @return
     */
    @GetMapping("/Updatestupedit")
    public int StuUpdate(StuPedit stuPedit) {
        return stuPeditService.StuPeditUpdate(stuPedit);
    }

    /**
     * 根据Id删除
     *
     * @param bh
     * @return
     */
    @GetMapping("/deleteById")
    public int DeleteById(Long bh) {
        return stuPeditService.DeleteById(bh);
    }
    @GetMapping("/deleteByIds")
    public int DeleteByIds(Long[] bh) {
        return stuPeditService.DeleteByIds(bh);
    }

    /**
     * 根据sid查找数据
     */
    @GetMapping("/selectBySid")
    public List<StuPedit> SelectBySid(String sid) {
        return stuPeditService.selectBySid(sid);
    }

}
