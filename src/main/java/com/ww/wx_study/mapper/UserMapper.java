package com.ww.wx_study.mapper;

import com.ww.wx_study.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * Description: XXX
 * User: ww
 * Date: 2019-08-13
 * Time: 17:13
 */
@Repository
public interface UserMapper {
    User getUser(int id);

    User login(String userName, String passWord);

    int register(User user);
}
