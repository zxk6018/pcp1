package com.hz.utils;

import com.hz.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Component("rbacAuthorityService")
public class RbacAuthorityService {
    @Autowired
    private RedisUtil redisUtil;

    public boolean hasPermission(HttpServletRequest request, Authentication authentication){
        //获取当前请求的URI
        String requestURI = request.getServletPath();
        //放开登陆url
        if (requestURI.equals("/admin/login")){
            return true;
        }
        //登陆判断
        String token = request.getHeader("token");
        //token需要到redis中找 找不到也是未登录
        System.out.println(token);
        if (token == null){
            request.setAttribute("code","1");
            return false;
        }
        //在redis找对象
        Object object = redisUtil.getStrJson("login:"+token,Admin.class);
        if (object == null){
            request.setAttribute("code","1");
            return false;
        }
        Admin admin = (Admin) object;
        /*
            1.启动项目是获得所有角色ID 与对应权限  存入redis
            2.根据角色ID  获得相应权限菜单集合 (控制到按钮)
            3.控制菜单  写controller路径
         */
        // 权限判断 利用token获取用户登录对象 获取角色ID 通过角色ID到redis中找角色对应 的权限集合
        List<String>  roles = new ArrayList<String>();
        roles.add("/admin");
        roles.add("/admin/show");
        roles.add("/admin/selectAdminList");
        if (!roles.contains(requestURI)){
            request.setAttribute("code","2");
            return false;
        }
        return true;

    }





}
