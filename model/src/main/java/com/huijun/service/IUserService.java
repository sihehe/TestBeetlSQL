package com.huijun.service;

import com.huijun.dao.UserDao;
import com.huijun.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: TestBeetlSQL
 * @description: userService接口
 * @author: Mr.si
 * @create: 2019-07-02 17:41
 **/

public interface IUserService {
    List<User> findAll();

    User findOne();

    User findOneByUserName();

    List<User> findPage(String account, Integer start, Integer end);

    List<User> pageQuery();
}
