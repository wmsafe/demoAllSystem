package com.psfd.demo.web;


import com.psfd.demo.entity.User;
import com.psfd.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Mht
 * @since 2020-07-14
 */
@RestController
public class UserController {
    @Autowired
    IUserService iUserService;

    @RequestMapping("login")
    public ModelAndView login(User user) {
        ModelAndView modelAndView = new ModelAndView();
        List<User> userList = iUserService.list();
        for (User user1 : userList) {
            if (user.getUsername().equals(user1.getUsername()) || user.getPassword().equals(user1.getPassword())) {
                modelAndView.addObject("user",user);
                modelAndView.setViewName("/manage");
                return modelAndView;
            }
        }
        modelAndView.setViewName("/login_false");
        return modelAndView;
    }


}

