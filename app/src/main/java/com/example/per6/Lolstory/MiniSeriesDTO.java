package com.example.per6.Lolstory;

/**
 * Created by per6 on 3/19/18.
 */

public class MiniSeriesDTO {

    //LEAGUE

    //object type for LeaguePosition
    private int wins, losses, target;
    private String progress;

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getTarget() {
        return target;
    }

    public String getProgress() {
        return progress;
    }
}
