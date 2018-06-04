package com.example.per6.Lolstory;

import java.util.Map;

/**
 * Created by per6 on 3/29/18.
 */

public class ProfileIconDataDto {
    private Map<String,ProfileIconDetailsDto>data;
    private String version,type;

    public Map<String, ProfileIconDetailsDto> getData() {
        return data;
    }

    public void setData(Map<String, ProfileIconDetailsDto> data) {
        this.data = data;
    }

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
}
