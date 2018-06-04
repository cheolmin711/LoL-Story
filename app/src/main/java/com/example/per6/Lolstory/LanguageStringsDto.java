package com.example.per6.Lolstory;

import java.util.Map;

/**
 * Created by per6 on 3/27/18.
 */

public class LanguageStringsDto {
    private String version, type;
    private Map<String, String> data;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }
}
