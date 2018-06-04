package com.example.per6.Lolstory;

import java.util.List;
import java.util.Map;

/**
 * Created by per6 on 3/27/18.
 */

public class ItemDto {

    //LOL STATIC DATA

    private GoldDto gold;
    private String plainText, colloq, specialRecipe, description, requiredChampion, group, name, sanitizedDescription;
    private boolean hideFromAll, inStore, consumeOnFull,consumed;
    private List<String> into;
    private int id, depth, stacks;
    private InventoryDataStatsDto stats;
    private Map<String, Boolean>maps;
    private ImageDto image;
    private List<String> tags;
    private Map<String, String> effect;
    private List<String> from;

    public GoldDto getGold() {
        return gold;
    }

    public void setGold(GoldDto gold) {
        this.gold = gold;
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public String getColloq() {
        return colloq;
    }

    public void setColloq(String colloq) {
        this.colloq = colloq;
    }

    public String getSpecialRecipe() {
        return specialRecipe;
    }

    public void setSpecialRecipe(String specialRecipe) {
        this.specialRecipe = specialRecipe;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequiredChampion() {
        return requiredChampion;
    }

    public void setRequiredChampion(String requiredChampion) {
        this.requiredChampion = requiredChampion;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(String sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
    }

    public boolean isHideFromAll() {
        return hideFromAll;
    }

    public void setHideFromAll(boolean hideFromAll) {
        this.hideFromAll = hideFromAll;
    }

    public boolean isInStore() {
        return inStore;
    }

    public void setInStore(boolean inStore) {
        this.inStore = inStore;
    }

    public boolean isConsumeOnFull() {
        return consumeOnFull;
    }

    public void setConsumeOnFull(boolean consumeOnFull) {
        this.consumeOnFull = consumeOnFull;
    }

    public boolean isConsumed() {
        return consumed;
    }

    public void setConsumed(boolean consumed) {
        this.consumed = consumed;
    }

    public List<String> getInto() {
        return into;
    }

    public void setInto(List<String> into) {
        this.into = into;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getStacks() {
        return stacks;
    }

    public void setStacks(int stacks) {
        this.stacks = stacks;
    }

    public InventoryDataStatsDto getStats() {
        return stats;
    }

    public void setStats(InventoryDataStatsDto stats) {
        this.stats = stats;
    }

    public Map<String, Boolean> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Boolean> maps) {
        this.maps = maps;
    }

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Map<String, String> getEffect() {
        return effect;
    }

    public void setEffect(Map<String, String> effect) {
        this.effect = effect;
    }

    public List<String> getFrom() {
        return from;
    }

    public void setFrom(List<String> from) {
        this.from = from;
    }
}
