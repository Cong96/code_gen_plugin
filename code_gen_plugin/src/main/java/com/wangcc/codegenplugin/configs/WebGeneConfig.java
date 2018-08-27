package com.wangcc.codegenplugin.configs;

import java.util.Set;

public class WebGeneConfig {
    private Set<String> tables;
    private String test_url;
    private String test_password;
    private String test_username;
    private String prod_url;
    private String prod_password;
    private String prod_username;

    public Set<String> getTables() {
        return tables;
    }

    public void setTables(Set<String> tables) {
        this.tables = tables;
    }

    public String getTest_url() {
        return test_url;
    }

    public void setTest_url(String test_url) {
        this.test_url = test_url;
    }

    public String getTest_password() {
        return test_password;
    }

    public void setTest_password(String test_password) {
        this.test_password = test_password;
    }

    public String getTest_username() {
        return test_username;
    }

    public void setTest_username(String test_username) {
        this.test_username = test_username;
    }

    public String getProd_url() {
        return prod_url;
    }

    public void setProd_url(String prod_url) {
        this.prod_url = prod_url;
    }

    public String getProd_password() {
        return prod_password;
    }

    public void setProd_password(String prod_password) {
        this.prod_password = prod_password;
    }

    public String getProd_username() {
        return prod_username;
    }

    public void setProd_username(String prod_username) {
        this.prod_username = prod_username;
    }

}
