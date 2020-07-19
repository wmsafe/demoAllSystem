package com.springBoot.wmsafe.interceptor;

import com.springBoot.wmsafe.util.UserContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CommonInterceptor extends HandlerInterceptorAdapter {
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        request.setCharacterEncoding("UTF-8");
        String url = request.getServletPath();
        System.out.println("post URL："+url);
        /*if(!url.equals("")){
            //判斷是否已登录
            Users loginUser = (Users)request.getSession().getAttribute("user");
            if(loginUser == null){
                //無session則是未登录狀態
                System.out.println(">>>未登录，請重新登录<<<");
                response.sendRedirect("../login.jsp");
                return false;
            }
        }*/
        //判断当前用户是否登录,已登录则放行,没登录则不放行,并且回到登录界面
        //session中无对象表示未登录
        if (UserContext.getCurrentUser() == null) {
            //没有登录则不放行,并且回到登录界面
            response.sendRedirect("../framework/welcome.jsp");
            return false;
        }
        return true; //已登录则放行
        //return super.preHandle(request, response, handler);
    }
	/*private boolean isPassUrl(String url){
        if(!url.endsWith("/login/login")
                && !url.endsWith("/login/chnagePassEntry")
                && !url.endsWith("/login/change_Login")
                && !url.endsWith("/API/Service")
                && !url.endsWith("/API/Service2")
                && !url.endsWith("/province.txt")
                && !url.endsWith("/city.txt")
                && !url.endsWith("/area.txt")
                && !url.endsWith(".xml")
                && !url.endsWith(".js")
                && !url.endsWith(".css") && !url.endsWith(".png")
                && !url.endsWith(".CSS") && !url.endsWith(".CSS")
                && !url.endsWith(".jpg") && !url.endsWith(".gif")
                && !url.endsWith(".JPG") && !url.endsWith(".GIF")){
            return true;
        }
        return false;
    }*/

}
