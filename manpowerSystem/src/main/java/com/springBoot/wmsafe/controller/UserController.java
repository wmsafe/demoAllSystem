package com.springBoot.wmsafe.controller;

import com.springBoot.wmsafe.model.Users;
import com.springBoot.wmsafe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/select")
    public ModelAndView selectUser() throws Exception {

        ModelAndView mv = new ModelAndView();

        Users user = userService.selectUser(1);
        System.out.println(user);

        mv.addObject("user", user);
        mv.addObject("message","这是一条测试信息");
        mv.setViewName("test");

        return mv;
    }
}