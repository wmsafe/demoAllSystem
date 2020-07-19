package com.psfd.demo.web;


import com.psfd.demo.entity.User;
import com.psfd.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

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


    @RequestMapping("/login")
    public ModelAndView login(String username,String password) {
        System.out.println(username+"-----"+password);
        ModelAndView modelAndView = new ModelAndView();
        List<User> userList = iUserService.list();
        for (User user1 : userList) {
            if (username.equals(user1.getUsername()) && password.equals(user1.getPassword())) {
                modelAndView.setViewName("/manage");
                return modelAndView;
            }
        }
        modelAndView.setViewName("/login_false");
        return modelAndView;
    }

    @RequestMapping("userlist")
    public ModelAndView userlist(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userlist",iUserService.list());
        modelAndView.setViewName("/userlist");
        return modelAndView;
    }


    @RequestMapping("adduser")
    public ModelAndView adduser(User user){
        ModelAndView modelAndView = new ModelAndView();
        iUserService.save(user);
        modelAndView.addObject("userlist",iUserService.list());
        modelAndView.setViewName("/userlist");
        return modelAndView;
    }

    @RequestMapping("updateuserone")
    public ModelAndView updateuserone(int userid){
        ModelAndView modelAndView = new ModelAndView();
        User user2 = new User();
        user2.setUserid(userid);
        modelAndView.addObject("user",user2);
        modelAndView.setViewName("/updateuser");
        return modelAndView;
    }

    @RequestMapping("updateusertwo")
    public ModelAndView updateusertwo(User user){
        ModelAndView modelAndView = new ModelAndView();
        iUserService.updateById(user);
        modelAndView.addObject("userlist",iUserService.list());
        modelAndView.setViewName("/userlist");
        return modelAndView;
    }

    @RequestMapping("removeuser")
    public ModelAndView removeuser(int userid){
        ModelAndView modelAndView = new ModelAndView();
        iUserService.removeById(userid);
        modelAndView.addObject("userlist",iUserService.list());
        modelAndView.setViewName("/userlist");
        return modelAndView;
    }



}

