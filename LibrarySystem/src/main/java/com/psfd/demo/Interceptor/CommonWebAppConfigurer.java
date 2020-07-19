//package com.psfd.demo.Interceptor;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class CommonWebAppConfigurer implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new CommonInterceptor());
//
//        interceptorRegistration.addPathPatterns("/*");
//
//        interceptorRegistration.excludePathPatterns("/login");
//    }
//}
