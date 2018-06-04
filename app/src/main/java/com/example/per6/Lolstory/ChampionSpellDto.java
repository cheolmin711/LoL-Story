package com.example.per6.Lolstory;

import java.util.List;

/**
 * Created by per6 on 3/27/18.
 */

public class ChampionSpellDto {
    private String cooldownBurn,resource,costType,sanitizedDescription,sanitizedTooltip,tooltip,costBurn,rangeBurn,key,description,name;
    private LevelTipDto leveltip;
    private List<SpellVarsDto>vars;
    private ImageDto image;
    private List<Object> effect;
    private int maxrank;
    private Object range;
    private List<Double>cooldown;
    private List<Integer>cost;
    private List<String>effectBurn;
    private List<ImageDto>altimages;

    public String getCooldownBurn() {
        return cooldownBurn;
    }

    public void setCooldownBurn(String cooldownBurn) {
        this.cooldownBurn = cooldownBurn;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(String sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
    }

    public String getSanitizedTooltip() {
        return sanitizedTooltip;
    }

    public void setSanitizedTooltip(String sanitizedTooltip) {
        this.sanitizedTooltip = sanitizedTooltip;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public String getCostBurn() {
        return costBurn;
    }

    public void setCostBurn(String costBurn) {
        this.costBurn = costBurn;
    }

    public String getRangeBurn() {
        return rangeBurn;
    }

    public void setRangeBurn(String rangeBurn) {
        this.rangeBurn = rangeBurn;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LevelTipDto getLeveltip() {
        return leveltip;
    }

    public void setLeveltip(LevelTipDto leveltip) {
        this.leveltip = leveltip;
    }

    public List<SpellVarsDto> getVars() {
        return vars;
    }

    public void setVars(List<SpellVarsDto> vars) {
        this.vars = vars;
    }

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }

    public List<Object> getEffect() {
        return effect;
    }

    public void setEffect(List<Object> effect) {
        this.effect = effect;
    }

    public int getMaxrank() {
        return maxrank;
    }

    public void setMaxrank(int maxrank) {
        this.maxrank = maxrank;
    }

    public Object getRange() {
        return range;
    }

    public void setRange(Object range) {
        this.range = range;
    }

    public List<Double> getCooldown() {
        return cooldown;
    }

    public void setCooldown(List<Double> cooldown) {
        this.cooldown = cooldown;
    }

    public List<Integer> getCost() {
        return cost;
    }

    public void setCost(List<Integer> cost) {
        this.cost = cost;
    }

    public List<String> getEffectBurn() {
        return effectBurn;
    }

    public void setEffectBurn(List<String> effectBurn) {
        this.effectBurn = effectBurn;
    }

    public List<ImageDto> getAltimages() {
        return altimages;
    }

    public void setAltimages(List<ImageDto> altimages) {
        this.altimages = altimages;
    }
}
