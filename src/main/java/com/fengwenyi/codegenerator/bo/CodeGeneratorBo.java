package com.fengwenyi.codegenerator.bo;

import com.baomidou.mybatisplus.annotation.DbType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author <a href="https://www.fengwenyi.com">Erwin Feng</a>
 * @since 2021-07-14
 */
@Data
@Accessors(chain = true)
public class CodeGeneratorBo {

    // 包名
    private String packageName;

    // 数据库类型
    private DbType dbType;
    // 数据库连接地址
    private String dbUrl;
    // 数据库名称
    private String username;
    // 数据库密码
    private String password;
    // 数据库驱动
    private String driver;

    // 表名
    private String [] tableNames;
    // 表前缀
    private String [] tablePrefixes;
    // 字段前缀
    private String [] fieldPrefixes;
    // 排出表的表名
    private String [] excludeTableNames;

    // 作者
    private String author;
    // 输入目录
    private String outDir;

    // 实体类包名
    private String packageEntity;
    // mapper包名
    private String packageMapper;
    // mapper XML目录名
    private String packageMapperXml;
    // service包名
    private String packageService;
    // serviceImpl包名
    private String packageServiceImpl;
    // controller包名
    private String packageController;

    // 实体类文件名格式
    private String fileNamePatternEntity;
    // mapper文件名格式
    private String fileNamePatternMapper;
    // mapper XML文件名格式
    private String fileNamePatternMapperXml;
    // service文件名格式
    private String fileNamePatternService;
    // serviceImpl文件名格式
    private String fileNamePatternServiceImpl;
    // controller文件名格式
    private String fileNamePatternController;

    // 逻辑删除字段
    private String fieldLogicDelete;
    // 乐观锁字段
    private String fieldVersion;

    // 模版引擎
    private String templateEngine;
    // 是否支持Swagger
    private Boolean swaggerSupport;
    // JDK版本
    private String jdkVersion;

}
