package com.psfd.firstproject.controller;


import com.psfd.firstproject.entity.Commodity;
import com.psfd.firstproject.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Mht
 * @since 2020-07-12
 */
@RestController
public class CommodityController {
    @Autowired
    private ICommodityService iCommodityService;

    @RequestMapping("/queryCommodity")
    public ModelAndView commodityList(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("commodityList",iCommodityService.list());
        modelAndView.setViewName("commodity/commodityList");
        return modelAndView;
    }

    @RequestMapping("/insertCommodity")
    public ModelAndView insertCommodity(Commodity commodity){
        System.out.println(commodity);
        ModelAndView modelAndView = new ModelAndView();
        iCommodityService.save(commodity);
        modelAndView.setViewName("commodity/commodityList");
        return modelAndView;
    }
}

