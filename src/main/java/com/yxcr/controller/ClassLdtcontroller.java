package com.yxcr.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yxcr.pojo.ClassIdt;
import com.yxcr.service.ClassIdtService;
import com.yxcr.util.ResponseUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

//@RestController注解，相当于@Controller+@ResponseBody两个注解的结合，
// 返回json数据不需要在方法前面加@ResponseBody注解了，
// 但使用@RestController这个注解，就不能返回jsp,html页面，视图解析器无法解析jsp,html页面

@RestController  //采用这个注解可以返回json格式
@RequestMapping("/class")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true") //解决跨域
public class ClassLdtcontroller {
    @Resource
    private ClassIdtService classIdtService;

    /**
     * 查询班级信息
     *
     * @param current
     * @param size
     * @return
     */
    @GetMapping("/classldtAll")
    public Map<String, Object> clsAll(Long current, Long size) {
        Page<ClassIdt> page = classIdtService.clsAll(current, size);

        return ResponseUtil.result("success",page);
    }

    //   后端使用集合来接受参数，灵活性较好，如果url中没有对参数赋key值，后端在接收时，会根据参数值的类型附，赋一个初始key（String、long ……）

    /**
     * 添加班级
     *
     * @param classIdt
     * @return
     */
    @GetMapping("/addclass")
    public int clsAdd(ClassIdt classIdt) {
        return classIdtService.clsAdd(classIdt);
    }

    /**
     * 根据ID来查询班级信息
     *
     * @param id
     * @return
     */
    @GetMapping("/selectById")
    public ClassIdt selectById(int id) {
        return classIdtService.selectById(id);
    }

    /**
     * 根据班级编号或班级名称动态模糊查询
     *
     * @param cdid
     * @param cdname
     * @param current
     * @param size
     * @return
     */
    @GetMapping("/likeselect")
    public Page<ClassIdt> ClassLikesearch(String cdid, String cdname, Long current, Long size) {

        return classIdtService.ClassLikesearch(cdid, cdname, current, size);
    }

    /**
     * 根据ID来查询班级信息
     *
     * @param bh
     * @return
     */
    @GetMapping("/showupdate")
    public ClassIdt Classshowupte(Long bh) {

        return classIdtService.Classshowupte(bh);
    }

    /**
     * 根据ID修改班级信息
     *
     * @param classIdt
     * @return
     */
    @GetMapping("/updateClass")
    public int ClassUpdate(ClassIdt classIdt) {
        return classIdtService.ClassUpdate(classIdt);
    }

    /**
     * 根据Id删除
     *
     * @param bh
     * @return
     */
    @GetMapping("/deleteById")
    public int DeleteById(Long bh) {
        return classIdtService.DeleteById(bh);
    }

    @GetMapping("/deleteByIds")
    public int DeleteByIds(Long[] bh) {

        return classIdtService.DeleteByIds(bh);
    }

    @GetMapping("/selectByCdid")
    public List<ClassIdt> selectByCdId(String cdId){

        return classIdtService.selectByCdId(cdId);
    }


//@PathVariable
//使用@PathVariable接收参数，参数值需要在url进行占位，前端传参的URL：
//前台实例： url = “${ctx}/main/mm/am/edit/${Id}/${name}”
//    @GetMapping("/add1/{id}/{name}")
//    public String studentLogin1(@PathVariable String id,@PathVariable String  name) {
//        System.out.println("name:" + name);
//        return id+name;
//    }
//    注解@RequestBody接收的参数是来自requestBody中，即请求体。
//    一般用于处理非 Content-Type: application/x-www-form-urlencoded编码格式的数据，
//    比如：application/json、application/xml等类型的数据。
//    就application/json类型的数据而言，使用注解@RequestBody可以将body里面所有的json数据传到后端，后端再进行解析。
}
