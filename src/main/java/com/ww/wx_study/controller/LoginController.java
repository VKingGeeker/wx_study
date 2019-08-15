package com.ww.wx_study.controller;

import com.ww.wx_study.entity.User;
import com.ww.wx_study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description: UserController
 * User: ww
 * Date: 2019-08-13
 * Time: 17:04
 */
@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private UserService userService;

    //跳转首页
    @RequestMapping(value = "/index")
    public String show() {
        return "index";
    }

    //登录操作
    @ResponseBody
    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request) {
        String userName = user.getUserName();
        String passWord = user.getPassWord();
        User user1 = userService.login(userName, passWord);
        if (user1 == null) {
            return "账号或密码错误！";
        } else {
            request.getSession().setAttribute("session_user", user);
            return "登陆成功";
        }
    }

    //跳转注册页
    @RequestMapping("/toRegister")
    public String register() {
        return "register";
    }

    //注册操作
    @RequestMapping("/register")
    public String register(User user) {
        int su = userService.register(user);
        if (su == 0) {
            System.out.println("----");
        }
        return "welcome";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    //退出登录
    @RequestMapping("/outUser")
    public void outUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().removeAttribute("session_user");
        response.sendRedirect("/user/toIndex");
    }
}
