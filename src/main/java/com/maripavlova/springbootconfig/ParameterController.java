package com.maripavlova.springbootconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParameterController {

    @Value("${mari.parameter}")
    private String default_parameter;

    @Value("${mari.description}")
    private String app_description;

    @GetMapping("/app-info")
    public String getApplicationInformation(){
        return app_description;
    }

    @GetMapping("/parameter")
    public String getParameterName() {
        return default_parameter;
    }
}
