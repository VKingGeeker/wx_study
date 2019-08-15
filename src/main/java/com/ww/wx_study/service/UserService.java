package com.ww.wx_study.service;

import com.sun.org.apache.bcel.internal.generic.InstructionList;
import com.ww.wx_study.entity.User;
import com.ww.wx_study.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description: XXX
 * User: ww
 * Date: 2019-08-13
 * Time: 17:06
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User getUser(int id) {
        return userMapper.getUser(id);
    }

    public User login(String userName, String passWord) {
        return userMapper.login(userName,passWord);
    }

    public int register(User user) {
        return userMapper.register(user);
    }
}
