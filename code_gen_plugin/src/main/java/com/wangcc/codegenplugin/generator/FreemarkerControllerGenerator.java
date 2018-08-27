package com.wangcc.codegenplugin.generator;

import org.springframework.beans.factory.annotation.Autowired;

public class FreemarkerControllerGenerator implements ControllerGenerator {
    @Autowired
    private freemarker.template.Configuration configuration;

    @Override
    public void geneCode(String tableName, String modelName) {
        // TODO Auto-generated method stub

    }

    @Override
    public void geneCode(String tableName, String modelName, String businessName) {
        // TODO Auto-generated method stub

    }

}
