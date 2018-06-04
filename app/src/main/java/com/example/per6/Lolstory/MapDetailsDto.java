package com.example.per6.Lolstory;

import java.util.List;

public class MapDetailsDto {

    //LOL STATIC DATA

    private String mapName;
    private ImageDto image;
    private long mapId;
    private List<Long> unpurchaseableItemList;

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }

    public long getMapId() {
        return mapId;
    }

    public void setMapId(long mapId) {
        this.mapId = mapId;
    }

    public List<Long> getUnpurchaseableItemList() {
        return unpurchaseableItemList;
    }

    public void setUnpurchaseableItemList(List<Long> unpurchaseableItemList) {
        this.unpurchaseableItemList = unpurchaseableItemList;
    }
}
