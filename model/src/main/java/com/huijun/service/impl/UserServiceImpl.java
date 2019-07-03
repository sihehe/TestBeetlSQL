package com.huijun.service.impl;

import com.huijun.dao.UserDao;
import com.huijun.model.User;
import com.huijun.service.IUserService;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: TestBeetlSQL
 * @description: usersrvice实现类
 * @author: Mr.si
 * @create: 2019-07-02 17:42
 **/

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserDao userdao;

    @Autowired
    SQLManager sqlManager;


    @Override
    public List<User> findAll() {
        List<User> all = userdao.all();
        return all;
    }

    @Override
    public User findOne() {
        User user1 = new User();
        user1.setId(1);
        List<User> select = sqlManager.select("user.findOne", User.class, user1);
        User user = select.get(0);
        return user;
    }

    @Override
    public User findOneByUserName() {
        Query<User> query = userdao.createQuery();
        User user = query.andEq("username", "张三").single();
        return user;
    }
}
