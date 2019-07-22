package com.huijun.service;


import com.huijun.model.SysProduct;

import java.util.List;

public interface IProductService {

    List<SysProduct> getProductList(String type, String season);
}
