package com.example.per6.Lolstory;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MatchDto implements Parcelable, Serializable {

    private int seasonId, queueId, mapId;
    private long gameId, gameCreation, gameDuration;
    private List<ParticipantIdentityDto> participantIdentities;
    private String gameVersion, platformId, gameMode, gameType;
    private List<TeamStatsDto> teams;
    private List<ParticipantDto> participants;

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
    }

    public int getQueueId() {
        return queueId;
    }

    public void setQueueId(int queueId) {
        this.queueId = queueId;
    }

    public int getMapId() {
        return mapId;
    }

    public void setMapId(int mapId) {
        this.mapId = mapId;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public long getGameCreation() {
        return gameCreation;
    }

    public void setGameCreation(long gameCreation) {
        this.gameCreation = gameCreation;
    }

    public long getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(long gameDuration) {
        this.gameDuration = gameDuration;
    }

    public List<ParticipantIdentityDto> getParticipantIdentities() {
        return participantIdentities;
    }

    public void setParticipantIdentities(List<ParticipantIdentityDto> participantIdentities) {
        this.participantIdentities = participantIdentities;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public void setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public List<TeamStatsDto> getTeams() {
        return teams;
    }

    public void setTeams(List<TeamStatsDto> teams) {
        this.teams = teams;
    }

    public List<ParticipantDto> getParticipants() {
        return participants;
    }

    public void setParticipants(List<ParticipantDto> participants) {
        this.participants = participants;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.seasonId);
        dest.writeInt(this.queueId);
        dest.writeInt(this.mapId);
        dest.writeLong(this.gameId);
        dest.writeLong(this.gameCreation);
        dest.writeLong(this.gameDuration);
        dest.writeList(this.participantIdentities);
        dest.writeString(this.gameVersion);
        dest.writeString(this.platformId);
        dest.writeString(this.gameMode);
        dest.writeString(this.gameType);
        dest.writeList(this.teams);
        dest.writeList(this.participants);
    }



    protected MatchDto(Parcel in) {
        this.seasonId = in.readInt();
        this.queueId = in.readInt();
        this.mapId = in.readInt();
        this.gameId = in.readLong();
        this.gameCreation = in.readLong();
        this.gameDuration = in.readLong();
        this.participantIdentities = new ArrayList<ParticipantIdentityDto>();
        in.readList(this.participantIdentities, ParticipantIdentityDto.class.getClassLoader());
        this.gameVersion = in.readString();
        this.platformId = in.readString();
        this.gameMode = in.readString();
        this.gameType = in.readString();
        this.teams = new ArrayList<TeamStatsDto>();
        in.readList(this.teams, TeamStatsDto.class.getClassLoader());
        this.participants = new ArrayList<ParticipantDto>();
        //in.readList(this.participants, ParticipantDto.class.getClassLoader());
    }

    public static final Parcelable.Creator<MatchDto> CREATOR = new Parcelable.Creator<MatchDto>() {
        @Override
        public MatchDto createFromParcel(Parcel source) {
            return new MatchDto(source);
        }

        @Override
        public MatchDto[] newArray(int size) {
            return new MatchDto[size];
        }
    };
}