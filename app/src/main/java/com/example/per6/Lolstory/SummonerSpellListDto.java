package com.example.per6.Lolstory;

import java.util.Map;

/**
 * Created by per6 on 3/29/18.
 */

public class SummonerSpellListDto {
    private Map <String, SummonerSpellDto>data;
    private String type,version;

    public Map<String, SummonerSpellDto> getData() {
        return data;
    }

    public void setData(Map<String, SummonerSpellDto> data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
