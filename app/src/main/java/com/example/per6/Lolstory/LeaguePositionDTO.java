package com.example.per6.Lolstory;

/**
 * Created by per6 on 3/27/18.
 */

public class LeaguePositionDTO {
    private String rank, queueType, leagueId, playerOrTeamName, playerOrTeamId, leagueName, tier;
    private boolean hotStreak, veteran, freshBlood, inactive;
    private MiniSeriesDTO miniSeries;
    private int wins, losses, leaguePoints;

    public String getRank() {
        return rank;
    }

    public String getQueueType() {
        return queueType;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public String getPlayerOrTeamName() {
        return playerOrTeamName;
    }

    public String getPlayerOrTeamId() {
        return playerOrTeamId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public String getTier() {
        return tier;
    }

    public boolean isHotStreak() {
        return hotStreak;
    }

    public boolean isVeteran() {
        return veteran;
    }

    public boolean isFreshBlood() {
        return freshBlood;
    }

    public boolean isInactive() {
        return inactive;
    }

    public MiniSeriesDTO getMiniSeries() {
        return miniSeries;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getLeaguePoints() {
        return leaguePoints;
    }
}
