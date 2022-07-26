package com.yxcr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yxcr.pojo.StuInfo;
import com.yxcr.pojo.StuPedit;
import com.yxcr.pojo.UserLogin;
import com.yxcr.service.StuPeditService;
import com.yxcr.mapper.StuPeditMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @author 79392
 * @description 针对表【stu_pedit】的数据库操作Service实现
 * @createDate 2022-05-28 23:04:29
 */
@Service
public class StuPeditServiceImpl extends ServiceImpl<StuPeditMapper, StuPedit>
        implements StuPeditService {
    @Resource
    private StuPeditMapper stuPeditMapper;

    @Override
    public Page<StuPedit> StuPeditAll(Long current, Long size) {
        if (current == null) {
            current = 1L;
        }
        if (size == null) {
            size = 10L;
        }
        Page<StuPedit> page = new Page<>(current, size);
        return stuPeditMapper.selectPage(page, null);
    }

    @Override
    public int addStuPedit(StuPedit stuPedit) {
        return stuPeditMapper.insert(stuPedit);
    }

    @Override
    public StuPedit selectById(int id) {
        return stuPeditMapper.selectById(id);
    }

    @Override
    public Page<StuPedit> StuPeditFuQuery(String sid, String name, Long current, Long size) {
        LambdaQueryWrapper<StuPedit> lqw = new LambdaQueryWrapper<>();
//        判断
        if (sid != null && sid != "") {
            lqw.like(StuPedit::getSid, sid);
        }
        if (name != null && name != "") {
            lqw.like(StuPedit::getName, name);
        }
//        分页 默认页面大小为10
        if (current == null) {
            current = 1L;
        }
        if (size == null) {
            size = 10L;
        }
        Page<StuPedit> page = new Page<>(current, size);
        return stuPeditMapper.selectPage(page, lqw);
    }

    @Override
    public StuPedit StuPeditShowUpdate(Long bh) {
        return stuPeditMapper.selectById(bh);
    }

    @Override
    public int StuPeditUpdate(StuPedit stuPedit) {
        return stuPeditMapper.updateById(stuPedit);
    }

    @Override
    public int DeleteById(Long bh) {
        return stuPeditMapper.deleteById(bh);
    }

    @Override
    public int DeleteByIds(Long[] bh) {
        return stuPeditMapper.deleteBatchIds(Arrays.asList(bh));
    }

    @Override
    public List<StuPedit> selectBySid(String sid) {
        List<StuPedit> stuPedits = stuPeditMapper.selectBySid(sid);
        return stuPedits;
    }


}




