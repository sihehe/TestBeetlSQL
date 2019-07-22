package com.huijun.model;

import org.beetl.sql.core.annotatoin.Table;

/*
 *
 * gen by beetlsql 2019-07-08
 */
@Table(name="SmartFittingRoom.sys_type")
public class SysType   {

    /*
    品类编号
    */
    private String typeNum ;
    /*
    层级顺序
    */
    private Integer hierarchicalOrder ;
    /*
    是否启用
    */
    private Integer status ;
    /*
    部位
    */
    private String part ;
    /*
    品类代码
    */
    private String typeCode ;
    /*
    品类名称
    */
    private String typeName ;

    public SysType() {
    }

    /**
     * 品类编号
     *@return
     */
    public String getTypeNum(){
        return  typeNum;
    }
    /**
     * 品类编号
     *@param  typeNum
     */
    public void setTypeNum(String typeNum ){
        this.typeNum = typeNum;
    }

    /**
     * 层级顺序
     *@return
     */
    public Integer getHierarchicalOrder(){
        return  hierarchicalOrder;
    }
    /**
     * 层级顺序
     *@param  hierarchicalOrder
     */
    public void setHierarchicalOrder(Integer hierarchicalOrder ){
        this.hierarchicalOrder = hierarchicalOrder;
    }

    /**
     * 是否启用
     *@return
     */
    public Integer getStatus(){
        return  status;
    }
    /**
     * 是否启用
     *@param  status
     */
    public void setStatus(Integer status ){
        this.status = status;
    }

    /**
     * 部位
     *@return
     */
    public String getPart(){
        return  part;
    }
    /**
     * 部位
     *@param  part
     */
    public void setPart(String part ){
        this.part = part;
    }

    /**
     * 品类代码
     *@return
     */
    public String getTypeCode(){
        return  typeCode;
    }
    /**
     * 品类代码
     *@param  typeCode
     */
    public void setTypeCode(String typeCode ){
        this.typeCode = typeCode;
    }

    /**
     * 品类名称
     *@return
     */
    public String getTypeName(){
        return  typeName;
    }
    /**
     * 品类名称
     *@param  typeName
     */
    public void setTypeName(String typeName ){
        this.typeName = typeName;
    }


}