package com.springBoot.wmsafe.util;

import com.springBoot.wmsafe.model.Users;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

public class UserContext {
    private UserContext(){};

    public static final String EMP_IN_SESSION="EMP_IN_SESSION";

    public static void setCurrentUser(Users emp){
        getSession().setAttribute("EMP_IN_SESSION", emp);

    }

    public static Users getCurrentUser(){
        return (Users) getSession().getAttribute(EMP_IN_SESSION);

    }

    public static HttpSession getSession(){
        ServletRequestAttributes attrs=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return attrs.getRequest().getSession();
    }
}
