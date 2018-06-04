package com.example.per6.Lolstory;

import java.util.Map;

public class MapDataDto {

    //LOL STATIC DATA

    private Map<String, MapDetailsDto> data;
    private String version, type;

    public Map<String, MapDetailsDto> getData() {
        return data;
    }

    public void setData(Map<String, MapDetailsDto> data) {
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
