package com.huijun.dao;

import com.huijun.model.User;
import org.beetl.sql.core.annotatoin.Param;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: TestBeetlSQL
 * @description: this is userDao class
 * @author: Mr.si
 * @create: 2019-07-02 18:06
 **/

@SqlResource("userDao")
@Repository
public interface UserDao extends BaseMapper<User> {

}
