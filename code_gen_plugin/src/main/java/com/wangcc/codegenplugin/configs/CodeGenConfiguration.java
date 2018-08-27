package com.wangcc.codegenplugin.configs;

import java.io.File;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wangcc.codegenplugin.utils.ParamCheckUtil;

import freemarker.template.TemplateExceptionHandler;

/**
 * @ClassName: CodeGenConfiguration
 * @Description: TODO
 * @author wangcongchong
 * @date 2018年8月16日
 * 
 */
@Configuration
public class CodeGenConfiguration {



    @Bean
    @ConfigurationProperties(prefix = CodeGenProperties.CODEGEN_PREFIX)
    public CodeGenProperties codeGenProperties() {
        return new CodeGenProperties();
    }

    @Bean
    @ConditionalOnProperty(name = "code_gen.usefreemarker", havingValue = "true")
    public freemarker.template.Configuration initFreemarkerConfiguration() {
        freemarker.template.Configuration cfg = new freemarker.template.Configuration(freemarker.template.Configuration.VERSION_2_3_23);;
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.IGNORE_HANDLER);
        String projectPath =
                StringUtils.isBlank(codeGenProperties().getProjectPath()) ? System.getProperty("user.dir") : codeGenProperties().getProjectPath();
        String freemarkerTmpPath = codeGenProperties().getFreemarkerTmpPath();
        ParamCheckUtil.assertNotBlank(freemarkerTmpPath, "当指定使用FreeMarker时,freemark_tmp_path必须配置且不能为空");
        try {
            cfg.setDirectoryForTemplateLoading(new File(projectPath + freemarkerTmpPath));
        } catch (Exception e) {
            throw new RuntimeException("Freemarker 模板环境初始化异常!", e);
        }
        return cfg;
        // try {
        // cfg = new
        // freemarker.template.Configuration(freemarker.template.Configuration.VERSION_2_3_23);
        // cfg.setDirectoryForTemplateLoading(new File(""));
        // cfg.setDefaultEncoding("UTF-8");
        // cfg.setTemplateExceptionHandler(TemplateExceptionHandler.IGNORE_HANDLER);
        // } catch (IOException e) {
        // throw new RuntimeException("Freemarker 模板环境初始化异常!", e);
        // }

    }

    @Bean
    @ConfigurationProperties(prefix = Consts.MYBATIS_GENERTATOR_PREFIX)
    public Properties mybatisGeneProperties() {
        return new Properties();
    }

}
