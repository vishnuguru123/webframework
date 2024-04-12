package com.example.day2q1.controller.model;




import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
    @Value("${app.name}")
    private String appName;
    @Value("${app.version}")
    private String appVersion;
    public String getAppName() {
        return appName;
    }
    public String getAppVersion() {
        return appVersion;
    }

}

