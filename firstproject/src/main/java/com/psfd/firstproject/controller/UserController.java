package com.psfd.firstproject.controller;


import com.psfd.firstproject.service.IUserService;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userServicel;

    @RequestMapping("/login")
    public ModelAndView login(String username,String password) {
        System.out.println(username + "-------" + password);
        userServicel.list();
        ModelAndView andView = new ModelAndView();
        andView.setViewName("index");
        return andView;
    }
}

