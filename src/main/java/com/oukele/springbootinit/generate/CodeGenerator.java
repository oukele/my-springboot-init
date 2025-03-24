package com.oukele.springbootinit.generate;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.nio.file.Paths;

/**
 * 代码生成器
 *
 * @author oukele
 */
public class CodeGenerator {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/oukele_db?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai";
        String username = "root";
        String password = "oukele";

        String[] tableNames = new String[]{"d_group", "d_topic", "d_topic_option"};
        String[] tablePrefixList = new String[]{"d_"};

        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> builder
                        .author("oukele")
                        .outputDir(Paths.get(System.getProperty("user.dir")) + "/src/main/resources/generator/")
                        .commentDate("yyyy-MM-dd")
                )
                .packageConfig(builder -> builder
                        .parent("com.oukele.springbootinit")
                        .entity("entity")
                        .mapper("mapper")
                        .service("service")
                        .serviceImpl("service.impl")
                        .xml("mapper.xml")
                )
                .strategyConfig(builder -> builder
                        .addTablePrefix(tablePrefixList)
                        .addInclude(tableNames)
                        .entityBuilder()
                        .enableLombok()
                        .serviceBuilder()
                        .formatServiceFileName("%sService")
                        .formatServiceImplFileName("%sServiceImp")
                )
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
