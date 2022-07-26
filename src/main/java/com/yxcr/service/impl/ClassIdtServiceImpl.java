package com.yxcr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yxcr.pojo.ClassIdt;
import com.yxcr.service.ClassIdtService;
import com.yxcr.mapper.ClassIdtMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
* @author 79392
* @description 针对表【class_idt】的数据库操作Service实现
* @createDate 2022-05-31 00:07:13
*/
@Service
public class ClassIdtServiceImpl extends ServiceImpl<ClassIdtMapper, ClassIdt>
    implements ClassIdtService{
    @Resource
    private ClassIdtMapper classIdtMapper;

    @Override
    public Page<ClassIdt> clsAll(Long current, Long size) {
        //        分页 默认页面大小为10
        if (current == null) {
            current = 1L;
        }
        if (size == null) {
            size = 10L;
        }
        Page<ClassIdt> page = new Page<>(current, size);
        Page<ClassIdt> page1 = classIdtMapper.selectPage(page, null);
        return page1;
    }

    @Override
    public int clsAdd(ClassIdt classIdt) {
        int insert = classIdtMapper.insert(classIdt);
//       System.out.println(classIdt);
//       System.out.println(insert);
        return insert;
    }

    @Override
    public ClassIdt selectById(int id) {
        ClassIdt classIdt = classIdtMapper.selectById(id);
        return classIdt;
    }

    @Override
    public Page<ClassIdt> ClassLikesearch(String cdid, String cdname, Long current, Long size) {
        LambdaQueryWrapper<ClassIdt> lqw = new LambdaQueryWrapper<>();
//        判断
        if (cdid != null && cdid != "") {
            lqw.like(ClassIdt::getCdId, cdid);
        }
        if (cdname != null && cdname != "") {
            lqw.like(ClassIdt::getCdName, cdname);
        }
//        分页 默认页面大小为10
        if (current == null) {
            current = 1L;
        }
        if (size == null) {
            size = 10L;
        }
        Page<ClassIdt> page = new Page<>(current, size);
        Page<ClassIdt> page1 = classIdtMapper.selectPage(page, lqw);
//        return classIdtMapper.selectList(lqw);
        return page1;
    }

    @Override
    public ClassIdt Classshowupte(Long bh) {
        ClassIdt classIdt = classIdtMapper.selectById(bh);
        return classIdt;
    }

    @Override
    public int ClassUpdate(ClassIdt classIdt) {
        int update = classIdtMapper.updateById(classIdt);
        return update;
    }

    @Override
    public int DeleteById(Long bh) {
        int i = classIdtMapper.deleteById(bh);
        return i;
    }

    @Override
    public int DeleteByIds(Long[] bh) {
        int i = classIdtMapper.deleteBatchIds(Arrays.asList(bh));
        return i;
    }

    @Override
    public List<ClassIdt> selectByCdId(String cdId) {

        return  classIdtMapper.selectByCdId(cdId);
    }
}




