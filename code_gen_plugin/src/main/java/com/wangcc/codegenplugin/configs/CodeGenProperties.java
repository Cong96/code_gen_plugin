package com.wangcc.codegenplugin.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * @ClassName: CodeGenProperties
 * @Description: TODO
 * @author wangcongchong
 * @date 2018年8月16日
 * 
 */
@ConfigurationProperties(prefix = CodeGenProperties.CODEGEN_PREFIX)
public class CodeGenProperties {
    public static final String CODEGEN_PREFIX = "code_gen";
    private String url;
    private String password;
    private String username;
    private String freemarkerTmpPath;
    private String projectPath;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getFreemarkerTmpPath() {
        return freemarkerTmpPath;
    }

    public void setFreemarkerTmpPath(String freemarkerTmpPath) {
        this.freemarkerTmpPath = freemarkerTmpPath;
    }

    public String getProjectPath() {
        return projectPath;
    }

    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath;
    }

    public static String getCodegenPrefix() {
        return CODEGEN_PREFIX;
    }

}
