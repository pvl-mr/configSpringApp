package com.maripavlova.springbootconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RefreshScope
public class ParameterController {

    @Value("${mari.parameter}")
    private String default_parameter;

    @Value("${mari.description}")
    private String app_description;

    @Value("${mari.non: default non}")
    private String def;

    @Value("#{${mari.dbValues}}")
    private Map<String, String> dbValues;

    @Value("${mari.list}")
    private List<String> lst;

    @Autowired
    private DbSettings dbSettings;

    @Autowired
    private Environment environment;

    @GetMapping("/app-info")
    public String getApplicationInformation(){
        return app_description;
    }

    @GetMapping("/parameter")
    public String getParameterName() {
        return default_parameter;
//        return default_parameter + def;
    }

    @GetMapping("/lst")
    public int getList() {
        return lst.size();
    }

    @GetMapping("/map")
    public Map<String, String> getMap() {
        return dbValues;
    }

    @GetMapping("/config-prop")
    public String getDbInfo() {
        return dbSettings.getDbValues() + dbSettings.getPort() + dbSettings.isStatus();
    }

    @GetMapping("env-details")
    public String getEnvDetails() {
        return environment.toString();
    }
}
