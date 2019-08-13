package com.ww.wx_study.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IntelliJ IDEA.
 * Description: 用户实体类
 * User: ww
 * Date: 2019-08-13
 * Time: 16:58
 */
@Data
public class User {
    @Getter @Setter
    private Integer id;
    @Getter @Setter
    private String userName;
    @Getter @Setter
    private String passWord;
    @Getter @Setter
    private String realName;

}
