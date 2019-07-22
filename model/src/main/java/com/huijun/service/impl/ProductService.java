package com.huijun.service.impl;

import com.huijun.dao.ProductDao;
import com.huijun.model.SysProduct;
import com.huijun.service.IProductService;
import org.beetl.sql.core.SQLManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: TestBeetlSQL
 * @description: productservice类
 * @author: Mr.si
 * @create: 2019-07-08 17:04
 **/

@Service
public class ProductService implements IProductService {

    @Autowired
    ProductDao productDao;

    @Autowired
    SQLManager sqlManager;


    @Override
    public List<SysProduct> getProductList(String type, String season) {
        List<SysProduct> list = productDao.getProductList(type,season);
        return list;
    }
}
