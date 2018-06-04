package com.example.per6.Lolstory;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class TeamStatsDto implements Parcelable {
    private boolean firstDragon, firstInhibitor, firstRiftHerald, firstBaron, firstBlood, firstTower, win;
    private List<TeamBansDto> bans;
    private int baronKills, riftHeraldKills, teamId, vilemawKills, inhibitorKills, towerKills, dominionVictoryScore, dragonKills;

    public boolean isFirstDragon() {
        return firstDragon;
    }

    public void setFirstDragon(boolean firstDragon) {
        this.firstDragon = firstDragon;
    }

    public boolean isFirstInhibitor() {
        return firstInhibitor;
    }

    public void setFirstInhibitor(boolean firstInhibitor) {
        this.firstInhibitor = firstInhibitor;
    }

    public boolean isFirstRiftHerald() {
        return firstRiftHerald;
    }

    public void setFirstRiftHerald(boolean firstRiftHerald) {
        this.firstRiftHerald = firstRiftHerald;
    }

    public boolean isFirstBaron() {
        return firstBaron;
    }

    public void setFirstBaron(boolean firstBaron) {
        this.firstBaron = firstBaron;
    }

    public boolean isFirstBlood() {
        return firstBlood;
    }

    public void setFirstBlood(boolean firstBlood) {
        this.firstBlood = firstBlood;
    }

    public boolean isFirstTower() {
        return firstTower;
    }

    public void setFirstTower(boolean firstTower) {
        this.firstTower = firstTower;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public List<TeamBansDto> getBans() {
        return bans;
    }

    public void setBans(List<TeamBansDto> bans) {
        this.bans = bans;
    }

    public int getBaronKills() {
        return baronKills;
    }

    public void setBaronKills(int baronKills) {
        this.baronKills = baronKills;
    }

    public int getRiftHeraldKills() {
        return riftHeraldKills;
    }

    public void setRiftHeraldKills(int riftHeraldKills) {
        this.riftHeraldKills = riftHeraldKills;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getVilemawKills() {
        return vilemawKills;
    }

    public void setVilemawKills(int vilemawKills) {
        this.vilemawKills = vilemawKills;
    }

    public int getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(int inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public int getTowerKills() {
        return towerKills;
    }

    public void setTowerKills(int towerKills) {
        this.towerKills = towerKills;
    }

    public int getDominionVictoryScore() {
        return dominionVictoryScore;
    }

    public void setDominionVictoryScore(int dominionVictoryScore) {
        this.dominionVictoryScore = dominionVictoryScore;
    }

    public int getDragonKills() {
        return dragonKills;
    }

    public void setDragonKills(int dragonKills) {
        this.dragonKills = dragonKills;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(this.firstDragon ? (byte) 1 : (byte) 0);
        dest.writeByte(this.firstInhibitor ? (byte) 1 : (byte) 0);
        dest.writeByte(this.firstRiftHerald ? (byte) 1 : (byte) 0);
        dest.writeByte(this.firstBaron ? (byte) 1 : (byte) 0);
        dest.writeByte(this.firstBlood ? (byte) 1 : (byte) 0);
        dest.writeByte(this.firstTower ? (byte) 1 : (byte) 0);
        dest.writeByte(this.win ? (byte) 1 : (byte) 0);
        dest.writeList(this.bans);
        dest.writeInt(this.baronKills);
        dest.writeInt(this.riftHeraldKills);
        dest.writeInt(this.teamId);
        dest.writeInt(this.vilemawKills);
        dest.writeInt(this.inhibitorKills);
        dest.writeInt(this.towerKills);
        dest.writeInt(this.dominionVictoryScore);
        dest.writeInt(this.dragonKills);
    }

    public TeamStatsDto() {
    }

    protected TeamStatsDto(Parcel in) {
        this.firstDragon = in.readByte() != 0;
        this.firstInhibitor = in.readByte() != 0;
        this.firstRiftHerald = in.readByte() != 0;
        this.firstBaron = in.readByte() != 0;
        this.firstBlood = in.readByte() != 0;
        this.firstTower = in.readByte() != 0;
        this.win = in.readByte() != 0;
        this.bans = new ArrayList<TeamBansDto>();
        in.readList(this.bans, TeamBansDto.class.getClassLoader());
        this.baronKills = in.readInt();
        this.riftHeraldKills = in.readInt();
        this.teamId = in.readInt();
        this.vilemawKills = in.readInt();
        this.inhibitorKills = in.readInt();
        this.towerKills = in.readInt();
        this.dominionVictoryScore = in.readInt();
        this.dragonKills = in.readInt();
    }

    public static final Parcelable.Creator<TeamStatsDto> CREATOR = new Parcelable.Creator<TeamStatsDto>() {
        @Override
        public TeamStatsDto createFromParcel(Parcel source) {
            return new TeamStatsDto(source);
        }

        @Override
        public TeamStatsDto[] newArray(int size) {
            return new TeamStatsDto[size];
        }
    };
}
