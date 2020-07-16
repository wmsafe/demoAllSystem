package com.psfd.demo.web;


import com.psfd.demo.service.IReadersMessageService;
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
 * @since 2020-07-14
 */
@RestController
public class ReadersMessageController {
    @Autowired
    IReadersMessageService iReadersMessageService;

    @RequestMapping("readermessage")
    public ModelAndView readerlist(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("readerslist",iReadersMessageService.list());
        modelAndView.setViewName("/readersmessage");
        return modelAndView;
    }

}

