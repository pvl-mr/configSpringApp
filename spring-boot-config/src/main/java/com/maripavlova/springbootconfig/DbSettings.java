package com.maripavlova.springbootconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("db")
public class DbSettings {
    private String dbValues;
    private int port;
    private boolean status;

    public String getDbValues() {
        return dbValues;
    }

    public void setDbValues(String dbValues) {
        this.dbValues = dbValues;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

