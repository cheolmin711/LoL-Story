package com.example.per6.Lolstory;

/**
 * Created by per6 on 3/29/18.
 */

public class MatchReferenceDto {
    private String lane,platformid,role;
    private long gameId,timestamp;
    private int  champion,season,queue;

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getPlatformid() {
        return platformid;
    }

    public void setPlatformid(String platformid) {
        this.platformid = platformid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getChampion() {
        return champion;
    }

    public void setChampion(int champion) {
        this.champion = champion;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getQueue() {
        return queue;
    }

    public void setQueue(int queue) {
        this.queue = queue;
    }
}
