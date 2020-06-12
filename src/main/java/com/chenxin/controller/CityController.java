package com.chenxin.controller;


import com.chenxin.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 陈新
 * @since 2020-05-05
 */
@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;


    @RequestMapping("list")
    public List getCity(Long pid){
      return  cityService.getCity(pid);

    }
}

