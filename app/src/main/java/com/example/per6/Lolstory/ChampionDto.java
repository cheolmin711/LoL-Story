package com.example.per6.Lolstory;

import java.util.List;

public class ChampionDto {
    private int id;
    private String key,lore,blurb,partype,title,name;
    private InfoDto info;
    private List<String>enemytips,tags,allytips;
    private List<SkinDto>skins;
    private List<RecommendedDto>recommended;
    private StatsDto stats;
    private ImageDto image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public String getPartype() {
        return partype;
    }

    public void setPartype(String partype) {
        this.partype = partype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InfoDto getInfo() {
        return info;
    }

    public void setInfo(InfoDto info) {
        this.info = info;
    }

    public List<String> getEnemytips() {
        return enemytips;
    }

    public void setEnemytips(List<String> enemytips) {
        this.enemytips = enemytips;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getAllytips() {
        return allytips;
    }

    public void setAllytips(List<String> allytips) {
        this.allytips = allytips;
    }

    public List<SkinDto> getSkins() {
        return skins;
    }

    public void setSkins(List<SkinDto> skins) {
        this.skins = skins;
    }

    public List<RecommendedDto> getRecommended() {
        return recommended;
    }

    public void setRecommended(List<RecommendedDto> recommended) {
        this.recommended = recommended;
    }

    public StatsDto getStats() {
        return stats;
    }

    public void setStats(StatsDto stats) {
        this.stats = stats;
    }

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }

    public PassiveDto getPassive() {
        return passive;
    }

    public void setPassive(PassiveDto passive) {
        this.passive = passive;
    }

    public List<ChampionSpellDto> getSpells() {
        return spells;
    }

    public void setSpells(List<ChampionSpellDto> spells) {
        this.spells = spells;
    }

    private PassiveDto passive;
    private List<ChampionSpellDto>spells;



}

