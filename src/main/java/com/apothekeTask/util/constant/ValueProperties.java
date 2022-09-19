package com.apothekeTask.util.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueProperties {

    private String resources;

    public ValueProperties(@Value("${resources.url}") String resources){
        this.resources = resources;
    }


}
