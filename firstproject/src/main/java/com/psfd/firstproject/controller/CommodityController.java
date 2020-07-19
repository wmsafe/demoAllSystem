package com.psfd.firstproject.controller;


import com.psfd.firstproject.entity.Commodity;
import com.psfd.firstproject.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
        ModelAndView modelAndView = new ModelAndView();
        iCommodityService.save(commodity);
        modelAndView.addObject("commodityList",iCommodityService.list());
        modelAndView.setViewName("commodity/commodityList");
        return modelAndView;
    }

    @RequestMapping("/delete")
    public ModelAndView deleteCommodity(int commodityId){
        ModelAndView modelAndView = new ModelAndView();
        iCommodityService.removeById(commodityId);
        modelAndView.addObject("commodityList",iCommodityService.list());
        modelAndView.setViewName("commodity/commodityList");
        return modelAndView;
    }


    @RequestMapping("/updateOne")
    public ModelAndView updateCommodity(int commodityId){
        ModelAndView modelAndView = new ModelAndView();
        Commodity cd = new Commodity();
        cd.setCommodityId(commodityId);
        modelAndView.addObject("commodity",cd);
        modelAndView.setViewName("commodity/commodityUpdate");
        return modelAndView;
    }

    @RequestMapping("/updateTwo")
    public ModelAndView updateCommodityTwo(Commodity commodity){
        ModelAndView modelAndView = new ModelAndView();
        iCommodityService.updateById(commodity);
        modelAndView.addObject("commodityList",iCommodityService.list());
        modelAndView.setViewName("commodity/commodityList");
        return modelAndView;
    }
}

