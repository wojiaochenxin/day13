package com.chenxin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenxin.entity.City;
import com.chenxin.mapper.CityMapper;
import com.chenxin.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 陈新
 * @since 2020-05-05
 */
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements CityService {

    @Override
    public List getCity(Long pid) {
        QueryWrapper<City> wrapper = new QueryWrapper<>();
        wrapper.eq("pid",pid);
        return this.list(wrapper);
    }
}
