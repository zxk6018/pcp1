package com.hz.config;


import com.hz.utils.AjaxAuthenticationEntryPoint;
import com.hz.utils.AjaxLogoutSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 未登陆时返回 JSON 格式的数据给前端
     */
    @Autowired
    private AjaxAuthenticationEntryPoint ajaxAuthenticationEntryPoint;
    @Autowired
    private AjaxLogoutSuccessHandler ajaxLogoutSuccessHandler;

    protected void configure(HttpSecurity http) throws Exception{
        //去掉CSRF
        http
                .csrf()
                .disable()
                .exceptionHandling().authenticationEntryPoint(ajaxAuthenticationEntryPoint)
                .and()
                //基于Token  不需要Session
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                //登陆处理
                .and()
                .formLogin()
                .loginProcessingUrl("admin/login")
                .permitAll()//放行
                .and()
                //登陆和权限控制
                .authorizeRequests()
                .anyRequest()
                //RBAC动态url认证
                .access("@rbacAuthorityService.hasPermission(request,authentication)")
                .and().logout()
                //默认注销行为为logout
                .logoutUrl("/admin/loginOut")
                //设置调用路径
                .logoutSuccessHandler(ajaxLogoutSuccessHandler).permitAll();



    }
}
