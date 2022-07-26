package com.yxcr.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yxcr.pojo.ClassIdt;
import com.yxcr.pojo.SchIdt;
import com.yxcr.service.SchIdtService;
import com.yxcr.util.JsonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController  //采用这个注解可以返回json格式和controller
@RequestMapping("/sch")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true") //解决跨域
public class SchIdtcontroller {
    @Resource
    private SchIdtService schIdtService;

    /**
     * 查询学校信息
     *
     * @param current
     * @param size
     * @return
     */
    @GetMapping("/schAll")
    public Page<SchIdt> schAll(Long current, Long size) {
        return schIdtService.schAll(current, size);
    }


    //   后端使用集合来接受参数，灵活性较好，如果url中没有对参数赋key值，后端在接收时，会根据参数值的类型附，赋一个初始key（String、long ……）

    /**
     * 添加学校
     *
     * @param schIdt
     * @return
     */
    @GetMapping("/addsch")
    public int addSch(SchIdt schIdt) {
        return schIdtService.addSch(schIdt);

    }

    /**
     * 根据ID来查询班级信息
     *
     * @param id
     * @return
     */
    @GetMapping("/selectById")
    public SchIdt selectById(int id) {
        return schIdtService.selectById(id);
    }

    /**
     * 根据班级编号或班级名称动态模糊查询
     *
     * @param sdid
     * @param sdname
     * @param current
     * @param size
     * @return
     */
    @GetMapping("/likeselect")
    public Page<SchIdt> schLikesearch(String sdid, String sdname, Long current, Long size) {
        return schIdtService.schLikesearch(sdid, sdname, current, size);
    }

    /**
     * 根据ID来查询班级信息
     *
     * @param bh
     * @return
     */
    @GetMapping("/showupdate")
    public SchIdt schshowupte(Long bh) {
        return schIdtService.schshowupte(bh);

    }

    /**
     * 根据ID修改班级信息
     *
     * @param schIdt
     * @return
     */
    @GetMapping("/updatesch")
    public int schUpdate(SchIdt schIdt) {
        return schIdtService.schUpdate(schIdt);
    }

    /**
     * 根据Id删除
     *
     * @param bh
     * @return
     */
    @GetMapping("/deleteById")
    public int DeleteById(Long bh) {
        return schIdtService.DeleteById(bh);
    }

    @GetMapping("/deleteByIds")
    public int DeleteByIds(Long[] bh) {
        return schIdtService.DeleteByIds(bh);
    }
    @GetMapping("/selectBysdId")
    public List<SchIdt> selectBySdId(String sdId){
        return schIdtService.selectBySdId(sdId);
    }
}
