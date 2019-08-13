package com.ww.wx_study.controller;

import com.ww.wx_study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description: UserController
 * User: ww
 * Date: 2019-08-13
 * Time: 17:04
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "getUser/{id}")
    public String getUser(@PathVariable int id ){
        return userService.getUser(id).toString();
    }
}
