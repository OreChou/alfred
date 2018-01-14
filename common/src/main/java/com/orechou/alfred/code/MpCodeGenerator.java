package com.orechou.alfred.code;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * Mybatis-Plus代码生成器
 *
 * @author OreChou
 * @create 2018-01-12 下午3:27
 */
public class MpCodeGenerator {

    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig config = new GlobalConfig();
        config.setOutputDir("D://");
        config.setFileOverride(true);
        // 不需要ActiveRecord特性的请改为false
        config.setActiveRecord(true);
        // XML 二级缓存
        config.setEnableCache(false);
        // XML ResultMap
        config.setBaseResultMap(true);
        // XML columList
        config.setBaseColumnList(false);
        // .setKotlin(true) 是否生成 kotlin 代码
        // .setMapperName("%sDao")
        config.setXmlName("%sMapper");
        // .setServiceName("MP%sService")
        config.setServiceImplName("%sService");
        config.setAuthor("OreChou");
        mpg.setGlobalConfig(config);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setTypeConvert(new MySqlTypeConvert() {
            @Override
            public DbColumnType processTypeConvert(String fieldType) {
                return super.processTypeConvert(fieldType);
            }
        });
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/mybatis-plus?characterEncoding=utf8");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 此处可以修改为您的表前缀
        strategy.setTablePrefix(new String[] {"sys_", "bis_"});
        strategy.setNaming(NamingStrategy.underline_to_camel);
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setEntity("entity");

        mpg.execute();

    }

}
