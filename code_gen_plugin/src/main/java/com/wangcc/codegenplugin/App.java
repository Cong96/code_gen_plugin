package com.wangcc.codegenplugin;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.convert.converter.Converter;


/**
 * @ClassName: App
 * @Description: TODO
 * @author wangcongchong
 * @date 2018年8月16日
 * 
 */
@SpringBootApplication
@ComponentScan({"com.wangcc.*"})
public class App {
    private static Logger LOGGER = LoggerFactory.getLogger(App.class);

    @Bean
    public Converter<String, Date> dateConverter() {
        return new Converter<String, Date>() {

            @Override
            public Date convert(String source) {
                try {
                    long sourceLong = Long.parseLong(source);
                    Date date = new Date(sourceLong);
                    return date;
                } catch (Exception e) {
                    return null;
                }
            }

        };
    }


    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);


        String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();
        for (String profile : activeProfiles) {
            LOGGER.info("当前使用profile为: {}", profile);
        }
    }
}
