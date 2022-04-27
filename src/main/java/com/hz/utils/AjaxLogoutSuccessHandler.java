package com.hz.utils;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AjaxLogoutSuccessHandler implements LogoutSuccessHandler {

    @Autowired
    private RedisUtil redisUtil;
    @Override
    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {

        //获取登陆token    然后注销token
        String token = httpServletRequest.getHeader("token");
        redisUtil.del("login:"+token);
        MassageJson massageJson = new MassageJson(200,"请求成功","摸你数据");
        httpServletResponse.setCharacterEncoding("utf-8");
        httpServletResponse.getWriter().write(JSONObject.toJSONString(massageJson));
    }
}
