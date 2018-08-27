package com.wangcc.codegenplugin.generator;

public interface CodeGenerator {
    void geneCode(String tableName, String modelName);

    void geneCode(String tableName, String modelName, String businessName);

}
