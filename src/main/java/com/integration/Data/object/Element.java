package com.integration.Data.object;

import java.util.LinkedHashMap;

public class Element {


    private String key;
    private LinkedHashMap<String,Float> values;


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public LinkedHashMap<String, Float> getValues() {
        return values;
    }

    public void setValues(LinkedHashMap<String, Float> values) {
        this.values = values;
    }
}
