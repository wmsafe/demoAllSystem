package com.springBoot.wmsafe.controller;

import com.springBoot.wmsafe.model.Users;
import com.springBoot.wmsafe.service.UserService;
import com.springBoot.wmsafe.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
@RequestMapping("/framework")
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public ModelAndView login(String username,String password) throws Exception {
        /*
        ModelAndView作用：
            1、设置转向地址
            2、将底层获取的数据进行存储（或者封装）
            3、最后将数据传递给View
        */
        ModelAndView mv = new ModelAndView();

        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("username",username);
        map.put("password",password);

        Users user = null;
        user = userService.login(map);
        System.out.println(user);

        if (user != null){
            if (user.getIsadmin() == 0) {
                UserContext.setCurrentUser(user);
                mv.addObject("message", "登录成功！两秒后跳转");
                mv.addObject("goUrl", "/framework/manage.jsp");
                mv.setViewName("/statusMessageJsp/success");
                return mv;
            }else{
                mv.addObject("message", "登录成功！但您的权限不足！两秒后跳转");
                mv.addObject("goUrl", "/framework/welcome.jsp");
                mv.setViewName("/statusMessageJsp/error");
                return mv;
            }
        }else{
            mv.addObject("message", "登录失败！请检查账号密码！两秒后跳转");
            mv.addObject("goUrl", "/framework/welcome.jsp");
            mv.setViewName("/statusMessageJsp/error");
            return mv;
        }
    }
    @RequestMapping("/loginOut")//退出登录实现
    public String loginOut(HttpSession session) {
        //銷毀session
        session.invalidate();
        return "redirect:/framework/welcome.jsp";
    }
}
