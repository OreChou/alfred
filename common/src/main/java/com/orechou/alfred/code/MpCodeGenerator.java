package com.orechou.alfred.code;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        config.setOutputDir("F://Projects//Private//alfred//doc//output");
        config.setFileOverride(true);
        // 不需要ActiveRecord特性的请改为false
        config.setActiveRecord(true);
        // XML 二级缓存
        config.setEnableCache(false);
        // XML ResultMap
        config.setBaseResultMap(true);
        // XML columList
        config.setBaseColumnList(true);
        // .setKotlin(true) 是否生成 kotlin 代码
        // .setMapperName("%sDao")
        config.setXmlName("%sMapper");
        // .setServiceName("MP%sService")
        config.setServiceName("%sService");
        config.setServiceImplName("%sServiceImpl");
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
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/alfred?characterEncoding=utf8");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 此处可以修改为您的表前缀
        strategy.setTablePrefix(new String[] {"sys_", "bis_"});
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setSuperServiceImplClass("com.orechou.alfred.service.base.BaseServiceImpl");
        strategy.setEntityLombokModel(true);
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.orechou.alfred");
        pc.setEntity("domain.system");
        pc.setMapper("dao.system");
        pc.setService("service.system");
        pc.setServiceImpl("service.system.impl");
        mpg.setPackageInfo(pc);

        // 关闭默认 xml 生成，调整生成 至 根目录
        TemplateConfig tc = new TemplateConfig();
        tc.setXml(null);
        mpg.setTemplate(tc);

        // 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                this.setMap(map);
            }
        };
        List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
        // 调整 xml 生成目录演示
        focList.add(new FileOutConfig("/templates/mapper.xml.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return "F://Projects//Private//alfred//doc//output//mapper//" + tableInfo.getEntityName() + "Mapper.xml";
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        mpg.execute();

    }

}
