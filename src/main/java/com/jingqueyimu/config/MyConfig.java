package com.jingqueyimu.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 自定义配置
 *
 * @author zhuangyilian
 */
@Component
@ConfigurationProperties(prefix="myconfig")
@PropertySource(value={"classpath:config/myconfig.properties"}, encoding="UTF-8")
public class MyConfig {
    
    /**
     * 运行环境
     */
    private String runEnv;
    
    /**
     * 网站地址
     */
    private String siteUrl;
    
    /**
     * 网站名称
     */
    private String siteName;
    
    /**
     * 文件存放路径
     */
    private String fileStoragePath;

    public String getRunEnv() {
        return runEnv;
    }

    public void setRunEnv(String runEnv) {
        this.runEnv = runEnv;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getFileStoragePath() {
        return fileStoragePath;
    }

    public void setFileStoragePath(String fileStoragePath) {
        this.fileStoragePath = fileStoragePath;
    }
}
