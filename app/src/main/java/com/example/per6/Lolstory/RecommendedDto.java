package com.example.per6.Lolstory;

import java.util.List;

/**
 * Created by per6 on 3/27/18.
 */

public class RecommendedDto {
    private String map,champion, title, mod,type;
    private boolean priority;
    private List<BlockDto>blocks;

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    public List<BlockDto> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<BlockDto> blocks) {
        this.blocks = blocks;
    }
}
