package com.wangcc.codegenplugin.configs;

import java.util.Properties;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.wangcc.codegenplugin.BaseTest;

import freemarker.template.Configuration;

public class ConfigTests extends BaseTest {
    @Test
    public void testBean() {
        Object o = ApplicationContextHolder.getContext().getBean(CodeGenProperties.class);
        System.out.println(JSON.toJSONString(o));
        Configuration cofiguration = ApplicationContextHolder.getContext().getBean(Configuration.class);
        System.out.println(JSON.toJSONString(cofiguration));
        System.out.println(cofiguration.getDefaultEncoding());
        Properties properties = (Properties) ApplicationContextHolder.getContext().getBean("mybatisGeneProperties");
        System.out.println(JSON.toJSONString(properties));
        System.out.println(properties.get("url"));
    }
}
