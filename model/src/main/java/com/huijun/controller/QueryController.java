package com.huijun.controller;

import com.huijun.api.IQueryController;
import com.huijun.model.SysProduct;
import com.huijun.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: TestBeetlSQL
 * @description: 查询接口
 * @author: Mr.si
 * @create: 2019-07-08 13:56
 **/


@RestController("query")
public class QueryController implements IQueryController {

    @Autowired
    IProductService productService;

    @Override
    @GetMapping("/querylist")
    public List<SysProduct> getProductList(String type, String season) {
        List<SysProduct> list = productService.getProductList(type,season);
        return list;
    }
}
