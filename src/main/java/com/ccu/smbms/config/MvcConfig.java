package com.ccu.smbms.config;

import com.ccu.smbms.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // 添加登录拦截器
        registry.addInterceptor(new LoginInterceptor())
                .excludePathPatterns("/login",
                        "/register").order(0);

    }
}
