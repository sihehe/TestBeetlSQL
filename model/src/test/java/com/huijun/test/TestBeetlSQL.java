package com.huijun.test;

import com.huijun.QuickStart;
import org.beetl.sql.core.SQLManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: TestBeetlSQL
 * @description: 测试类
 * @author: Mr.si
 * @create: 2019-07-02 15:43
 **/
@SpringBootTest(classes = QuickStart.class)
@RunWith(SpringRunner.class)
public class TestBeetlSQL {

    @Autowired
    SQLManager sqlManager;

    @Test
    public void test1() throws Exception {
//        sqlManager.genPojoCodeToConsole("sys_product");
//        sqlManager.genPojoCodeToConsole("sys_type");
        sqlManager.genSQLTemplateToConsole("sys_product");
    }
}
