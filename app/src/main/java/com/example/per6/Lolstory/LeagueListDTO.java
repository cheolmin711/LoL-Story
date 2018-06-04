package com.example.per6.Lolstory;

import java.util.List;

/**
 * Created by per6 on 3/27/18.
 */

public class LeagueListDTO {

    //LEAGUE

    private String leagueId, tier, queue, name;
    private List<LeagueItemDTO> entries;

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LeagueItemDTO> getEntries() {
        return entries;
    }

    public void setEntries(List<LeagueItemDTO> entries) {
        this.entries = entries;
    }
}
