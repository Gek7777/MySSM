package com.MySSM.controller;

import javax.json.Json;
import javax.servlet.http.HttpServletRequest;

import com.MySSM.model.User;
import com.MySSM.service.IUserService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/showUser.do")
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long userId = Long.parseLong(request.getParameter("id"));
        User user = this.userService.selectUser(userId);

        PrintWriter out = response.getWriter();
        String jsonString = JSON.toJSONString(user);

        if(jsonString != null){
            out.write(jsonString);
        }else{
            out.write("出错了");
        }
        out.close();
    }
}