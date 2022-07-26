package com.yxcr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yxcr.pojo.ClassIdt;
import com.yxcr.pojo.SchIdt;
import com.yxcr.service.SchIdtService;
import com.yxcr.mapper.SchIdtMapper;
import com.yxcr.util.JsonResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
* @author 79392
* @description 针对表【sch_idt】的数据库操作Service实现
* @createDate 2022-05-31 00:07:13
*/
@Service
public class SchIdtServiceImpl extends ServiceImpl<SchIdtMapper, SchIdt>
    implements SchIdtService{
    @Resource
    private SchIdtMapper schIdtMapper;


    @Override
    public Page<SchIdt> schAll(Long current, Long size) {
        //        分页 默认页面大小为10
        if (current == null) {
            current = 1L;
        }
        if (size == null) {
            size = 10L;
        }
        Page<SchIdt> page = new Page<>(current, size);
        Page<SchIdt> page1 = schIdtMapper.selectPage(page, null);
        return page1;
    }

    @Override
    public int addSch(SchIdt schIdt) {
        int insert = schIdtMapper.insert(schIdt);
//       System.out.println(classIdt);
//       System.out.println(insert);
        return insert;
    }

    @Override
    public SchIdt selectById(int id) {
        SchIdt schIdt = schIdtMapper.selectById(id);
        return schIdt;
    }

    @Override
    public Page<SchIdt> schLikesearch(String sdid, String sdname, Long current, Long size) {
        LambdaQueryWrapper<SchIdt> lqw = new LambdaQueryWrapper<>();
//        判断
        if (sdid != null && sdid != "") {
            lqw.like(SchIdt::getSdId, sdid);
        }
        if (sdname != null && sdname != "") {
            lqw.like(SchIdt::getSdName, sdname);
        }
//        分页 默认页面大小为10
        if (current == null) {
            current = 1L;
        }
        if (size == null) {
            size = 10L;
        }
        Page<SchIdt> page = new Page<>(current, size);
        Page<SchIdt> page1 = schIdtMapper.selectPage(page, lqw);
//        return classIdtMapper.selectList(lqw);
        return page1;
    }

    @Override
    public SchIdt schshowupte(Long bh) {
        SchIdt schIdt = schIdtMapper.selectById(bh);
        return schIdt;
    }

    @Override
    public int schUpdate(SchIdt schIdt) {
        int update = schIdtMapper.updateById(schIdt);
        return update;
    }

    @Override
    public int DeleteById(Long bh) {
        int i = schIdtMapper.deleteById(bh);
        return i;
    }

    @Override
    public int DeleteByIds(Long[] bh) {
        int i = schIdtMapper.deleteBatchIds(Arrays.asList(bh));
        return i;
    }

    @Override
    public List<SchIdt> selectBySdId(String sdId) {

        return schIdtMapper.selectBySdId(sdId);
    }
}




