package com.cloudiip.controller;

import com.cloudiip.pojo.entity.UserEntity;
import com.cloudiip.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author huangruibin
 * @Date 2021/11/17 10:31
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/getlogin")
    public String getlogin() {
        return "login";
    }

    /*登录*/
    @RequestMapping("/login")
    public ModelAndView login(UserEntity user, ModelAndView mv, HttpServletRequest request) {
        UserEntity login = loginService.login(user.getUserId(), user.getPassword());
        System.out.println(login);
        if (login != null) {
            request.getSession().setAttribute("login", login);
            System.out.println("登录成功!!");
            mv.setViewName("index");
        } else {
            System.out.println("用户名或密码错误!");
            mv.setViewName("login");
        }
        return mv;
    }


}
