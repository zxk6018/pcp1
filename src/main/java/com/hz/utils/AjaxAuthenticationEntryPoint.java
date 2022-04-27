package com.hz.utils;

import com.alibaba.fastjson.JSONObject;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/***
 * 用户没有登录时返回给前端的数据
 */
@Component
public class AjaxAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {

        //从RbacAuthorityService获取code判断是那种
        String code = httpServletRequest.getAttribute("code").toString();
        MassageJson massageJson = new MassageJson();
        if (code.equals("1")){
            massageJson.setCode(1);
            massageJson.setMsg("未登录");
        }else if (code.equals("2")){
            massageJson.setCode(2);
            massageJson.setMsg("权限不足");
        }else if (code.equals("3")){
            massageJson.setCode(3);
            massageJson.setMsg("系统异常");
        }
        httpServletResponse.setCharacterEncoding("utf-8");
        httpServletResponse.getWriter().write(JSONObject.toJSONString(massageJson));
    }
}
