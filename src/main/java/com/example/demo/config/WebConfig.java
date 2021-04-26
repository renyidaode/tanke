//package com.example.demo.config;
//
//import com.example.demo.utils.JWT.JwtInterceptor;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
///*****
// *@className: WebConfig
// *@date: 2021/3/30  16:33
// *@User: create By haha
// *
// */
//
////用于定义配置类，可替换xml配置文件
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//
//    //添加拦截器
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new JwtInterceptor()).addPathPatterns("/**")
//                .excludePathPatterns("/swagger-resources/**",
//                        "/webjars/**", "/v2/**",
//                        "/swagger-ui.html/**",
//                        "/**"
//                );
//    }
//
//
//    //跨域支持
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("*")
//                .allowCredentials(true)
//                .allowedMethods("GET", "POST", "DELETE", "PUT", "PATCH", "OPTIONS", "HEAD")
//                .maxAge(3600 *24)
//                .allowedHeaders("*");
//    }
//
//}
