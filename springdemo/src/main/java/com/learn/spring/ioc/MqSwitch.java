package com.learn.spring.ioc;

import java.util.Properties;

public class MqSwitch {
    private Properties properties = new Properties();

    public String getProperties(String name) {
        return properties.getProperty(name);
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
