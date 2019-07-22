package com.huijun.api;

import com.huijun.model.SysProduct;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import java.util.List;


/**
 * @program: TestBeetlSQL
 * @description: 查询接口
 * @author: Mr.si
 * @create: 2019-07-08 13:57
 **/
@Api(value = "queryController",description = "查询接口")
public interface IQueryController {


    @ApiOperation(value = "列表查询接口",notes = "前台输入类型和季节返回相对应的衣服列表",httpMethod = "GET",response = List.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "type", value = "衣服类型", dataType = "String", paramType = "query", required = true),
            @ApiImplicitParam(name = "season", value = "季节", dataType = "String", paramType = "query", required = true)
    })
    List<SysProduct> getProductList(String type,String season);
}
