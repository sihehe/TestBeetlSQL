package com.huijun.controller;

import com.huijun.model.User;
import com.huijun.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: TestBeetlSQL
 * @description: 这是一个usercontroller类
 * @author: Mr.si
 * @create: 2019-07-02 17:39
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping("/get")
    @ResponseBody
    public List<User> getUserList(){
        List<User> list = userService.findAll();
        return list;
    }
    @RequestMapping("/getOneByUserName")
    @ResponseBody
    public User getOneByUserName(){
        User user = userService.findOneByUserName();
        return user;
    }
    @RequestMapping("/getone")
    @ResponseBody
    public User getUser(){
        User user = userService.findOne();
        return user;
    }

}
