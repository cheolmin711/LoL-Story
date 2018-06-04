package com.example.per6.Lolstory;

/**
 * Created by per6 on 3/27/18.
 */

public class LeagueItemDTO {

    //LEAGUE

    private String rank, playerOrTeamName, playerOrTeamId;
    private boolean notStreak, veteran, freshBlood, inactive;
    private MiniSeriesDTO miniSeries;
    private int wins, losses, leaguePoints;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPlayerOrTeamName() {
        return playerOrTeamName;
    }

    public void setPlayerOrTeamName(String playerOrTeamName) {
        this.playerOrTeamName = playerOrTeamName;
    }

    public String getPlayerOrTeamId() {
        return playerOrTeamId;
    }

    public void setPlayerOrTeamId(String playerOrTeamId) {
        this.playerOrTeamId = playerOrTeamId;
    }

    public boolean isNotStreak() {
        return notStreak;
    }

    public void setNotStreak(boolean notStreak) {
        this.notStreak = notStreak;
    }

    public boolean isVeteran() {
        return veteran;
    }

    public void setVeteran(boolean veteran) {
        this.veteran = veteran;
    }

    public boolean isFreshBlood() {
        return freshBlood;
    }

    public void setFreshBlood(boolean freshBlood) {
        this.freshBlood = freshBlood;
    }

    public boolean isInactive() {
        return inactive;
    }

    public void setInactive(boolean inactive) {
        this.inactive = inactive;
    }

    public MiniSeriesDTO getMiniSeries() {
        return miniSeries;
    }

    public void setMiniSeries(MiniSeriesDTO miniSeries) {
        this.miniSeries = miniSeries;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getLeaguePoints() {
        return leaguePoints;
    }

    public void setLeaguePoints(int leaguePoints) {
        this.leaguePoints = leaguePoints;
    }
}
