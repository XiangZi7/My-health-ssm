package com.yxcr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yxcr.mapper.StuInfoMapper;
import com.yxcr.pojo.StuInfo;
import com.yxcr.service.StuInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author 79392
 * @description 针对表【stu_info】的数据库操作Service实现
 * @createDate 2022-05-31 18:46:43
 */
@Service
public class StuInfoServiceImpl extends ServiceImpl<StuInfoMapper, StuInfo>
        implements StuInfoService {
    @Resource
    private StuInfoMapper stuInfoMapper;

    @Override
    public Page<StuInfo> StuAll(Long current, Long size) {
        if (current == null) {
            current = 1L;
        }
        if (size == null) {
            size = 10L;
        }
        Page<StuInfo> page = new Page<>(current, size);
        return stuInfoMapper.selectPage(page, null);
    }

    @Override
    public int addStu(StuInfo stuInfo) {
        return stuInfoMapper.insert(stuInfo);
    }

    @Override
    public StuInfo selectById(int id) {
        return stuInfoMapper.selectById(id);
    }

    @Override
    public Page<StuInfo> StuFuQuery(String sid, String name, Long current, Long size) {
        LambdaQueryWrapper<StuInfo> lqw = new LambdaQueryWrapper<>();
//        判断
        if (sid != null && sid != "") {
            lqw.like(StuInfo::getSid, sid);
        }
        if (name != null && name != "") {
            lqw.like(StuInfo::getName, name);
        }
//        分页 默认页面大小为10
        if (current == null) {
            current = 1L;
        }
        if (size == null) {
            size = 10L;
        }
        Page<StuInfo> page = new Page<>(current, size);
        return stuInfoMapper.selectPage(page, lqw);
    }

    @Override
    public StuInfo StuShowUpdate(Long bh) {
        return stuInfoMapper.selectById(bh);
    }

    @Override
    public int StuUpdate(StuInfo stuInfo) {
        return stuInfoMapper.updateById(stuInfo);
    }

    @Override
    public int DeleteById(Long bh) {
        return stuInfoMapper.deleteById(bh);
    }

    @Override
    public int DeleteByIds(Long[] bh) {
        int i = stuInfoMapper.deleteBatchIds(Arrays.asList(bh));
        return i;
    }

    @Override
    public StuInfo selectBySid(String sid) {
        StuInfo stuInfos = stuInfoMapper.selectBySid(sid);
        return stuInfos;
    }

    @Override
    public List<Map<String, Object>> getSexCount() {
        QueryWrapper lqw = new QueryWrapper<>();
        lqw.select("sex,COUNT(sex) as num").groupBy("sex");
        return stuInfoMapper.selectMaps(lqw);
    }


}




