package com.chenxin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenxin.entity.City;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 陈新
 * @since 2020-05-05
 */
public interface CityService extends IService<City> {

    List getCity(Long pid);
}
