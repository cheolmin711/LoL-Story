package com.example.per6.Lolstory;

import java.util.List;

public class ReforgedRunePathDto {

    private List<ReforgedRuneSlotDto> slots;
    private String icon, key, name;
    private int id;

    public List<ReforgedRuneSlotDto> getSlots() {
        return slots;
    }

    public void setSlots(List<ReforgedRuneSlotDto> slots) {
        this.slots = slots;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
