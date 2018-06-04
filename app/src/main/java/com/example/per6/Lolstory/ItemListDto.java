package com.example.per6.Lolstory;

import java.util.List;
import java.util.Map;

/**
 * Created by per6 on 3/27/18.
 */

public class ItemListDto {
    //LOL STATIC DATA

    private Map<String, ItemDto> data;
    private String version,type;
    private List<ItemTreeDto> tree;
    private List<GroupDto>  groups;

    public Map<String, ItemDto> getData() {
        return data;
    }

    public void setData(Map<String, ItemDto> data) {
        this.data = data;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<ItemTreeDto> getTree() {
        return tree;
    }

    public void setTree(List<ItemTreeDto> tree) {
        this.tree = tree;
    }

    public List<GroupDto> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupDto> groups) {
        this.groups = groups;
    }
}
