package com.huijun.service.impl;

import com.huijun.dao.UserDao;
import com.huijun.model.User;
import com.huijun.service.IUserService;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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

    @Override
    public List<User> findPage(String account, Integer start, Integer end) {
        List<User> all = null;
        if(!StringUtils.isEmpty(account)){
            Query<User> query = sqlManager.query(User.class);
            all = query.andEq("account", account).limit(start, end).select();
        }else{
            all = userdao.all(start, end);

        }
        return all;
    }

    @Override
    public List<User> pageQuery() {
        PageQuery<User> query = new PageQuery<>(1l,5l);
        sqlManager.pageQuery("user.pageQuery", User.class, query);
        long totalPage = query.getTotalPage();
        long totalRow = query.getTotalRow();
        System.out.println("totalPage = "+totalPage+"  totalRow"+totalRow);
        List<User> list = query.getList();
        return list;
    }

}
