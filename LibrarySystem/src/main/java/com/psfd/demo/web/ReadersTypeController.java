package com.psfd.demo.web;


import com.psfd.demo.entity.ReadersType;
import com.psfd.demo.service.IReadersTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Mht
 * @since 2020-07-14
 */
@RestController
public class ReadersTypeController {
    @Autowired
    IReadersTypeService iReaderstypeService;

    @RequestMapping("readerstype")
    public ModelAndView addreaders(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("readerslist",iReaderstypeService.list());
        modelAndView.setViewName("/readerstype");
        return modelAndView;
    }

    @RequestMapping("readersupdate")
    public ModelAndView readersupdate(int id){
        ModelAndView modelAndView = new ModelAndView();
        ReadersType readersType2 = new ReadersType();
        readersType2.setId(id);
        modelAndView.addObject("readersType2",readersType2);
        modelAndView.setViewName("/updatereaders");
        return modelAndView;
    }

    @RequestMapping("updatereaders")
    public ModelAndView updatereaders(ReadersType readersType){
        ModelAndView modelAndView = new ModelAndView();
        iReaderstypeService.updateById(readersType);
        modelAndView.addObject("readerslist",iReaderstypeService.list());
        modelAndView.setViewName("/readerstype");
        return modelAndView;
    }

    @RequestMapping("removereaders")
    public ModelAndView removereaders(int id){
        ModelAndView modelAndView = new ModelAndView();
        iReaderstypeService.removeById(id);
        modelAndView.addObject("readerslist",iReaderstypeService.list());
        modelAndView.setViewName("/readerstype");
        return modelAndView;
    }

    @RequestMapping("addreaders")
    public ModelAndView addreaders(ReadersType readersType){
        ModelAndView modelAndView = new ModelAndView();
        iReaderstypeService.save(readersType);
        modelAndView.addObject("readerslist",iReaderstypeService.list());
        modelAndView.setViewName("/readerstype");
        return modelAndView;
    }

}

