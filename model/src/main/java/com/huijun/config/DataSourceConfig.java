package com.huijun.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.ibeetl.starter.BeetlMapperScannerRegister;
import com.ibeetl.starter.BeetlSqlSingleCondition;
import org.beetl.sql.ext.spring4.BeetlSqlDataSource;
import org.beetl.sql.ext.spring4.SqlManagerFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/**
 * @program: TestBeetlSQL
 * @description: beetlsql配置类
 * @author: Mr.si
 * @create: 2019-07-01 17:46
 **/

@Configuration
public class DataSourceConfig {


    @Bean(name="datasource")
    public DruidDataSource datasource(DruidProperties properties) {
        DruidDataSource ds = new DruidDataSource();
        properties.config(ds);
        return ds;
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidProperties druidProperties() {
        return new DruidProperties();
    }

    @Bean
    public BeetlSqlDataSource beetlSqlDataSource(@Qualifier("datasource") DataSource dataSource){
        BeetlSqlDataSource source = new BeetlSqlDataSource();
        source.setMasterSource(dataSource);
        return source;
    }

    @Bean
    public BeetlSqlSingleCondition getBeetlSqlSingleCondition(){
        BeetlSqlSingleCondition beetlSqlSingleCondition = new BeetlSqlSingleCondition();
        return beetlSqlSingleCondition;
    }
    @Bean
    public BeetlMapperScannerRegister getBeetlMapperScannerRegister(){
        BeetlMapperScannerRegister beetlMapperScannerRegister = new BeetlMapperScannerRegister();
        return beetlMapperScannerRegister;
    }



//    @Bean
//    public SqlManagerFactoryBean getSqlManagerFactoryBean(BeetlSqlDataSource cs){
//        SqlManagerFactoryBean sqlManagerFactoryBean = new SqlManagerFactoryBean();
//        sqlManagerFactoryBean.setCs(cs);
//        return sqlManagerFactoryBean;
//    }
}
