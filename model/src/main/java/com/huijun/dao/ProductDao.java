package com.huijun.dao;

import com.huijun.model.SysProduct;
import com.huijun.model.User;
import org.beetl.sql.core.annotatoin.Param;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: TestBeetlSQL
 * @description: 操作product表
 * @author: Mr.si
 * @create: 2019-07-08 16:47
 **/

@SqlResource("product")
@Repository
public interface ProductDao extends BaseMapper<User> {

    List<SysProduct> getProductList(@Param("type") String type, @Param("season") String season);

}

