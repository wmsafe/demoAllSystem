package com.psfd.firstproject.controller;


import com.psfd.firstproject.entity.User;
import com.psfd.firstproject.service.IUserService;
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
public class UserController {

    @Autowired
    private IUserService userServicel;

    @RequestMapping("/login")
    public ModelAndView login(String username,String password) {
        System.out.println(username + "-------" + password);
        List<User> list = userServicel.list();
        ModelAndView andView = new ModelAndView();
        try {
            if(username == null || password == null){
                andView.setViewName("/login/login");
                return andView;
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }

        try {
            for (User user : list) {
                if (username.equals(user.getUsername()) && password.equals(user.getPassword())){
                    andView.setViewName("/framework/framework");
                    return andView;
                }
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        andView.setViewName("/login/false");
        return andView;
    }

    @RequestMapping("/query")
    public ModelAndView userList() {
        ModelAndView andView = new ModelAndView();
        andView.addObject("userList",userServicel.list());
        andView.setViewName("/user/userList");
        return andView;
    }

    @RequestMapping("/insertUser")
    public ModelAndView addUser(User user) {
        ModelAndView andView = new ModelAndView();
        if (user == null){
            andView.setViewName("/user/insertUser");
            return andView;
        }
        List<User> userList = userServicel.list();
        for (User user1 : userList) {
            if (user.getUsername().equals(user1.getUsername())){
                 return null;
            }
        }
        userServicel.save(user);
        andView.addObject("userList",userList);
        andView.setViewName("/user/userList");
        return andView;
    }
}

