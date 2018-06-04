package com.example.per6.Lolstory;

import android.os.Parcel;
import android.os.Parcelable;

public class PlayerDto implements Parcelable {
    private String currentPlatformId, summonerName, matchHistoryUri, platformId;
    private long currentAccountId, summonerId, accountId;
    private int profileIcon;

    public String getCurrentPlatformId() {
        return currentPlatformId;
    }

    public void setCurrentPlatformId(String currentPlatformId) {
        this.currentPlatformId = currentPlatformId;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public String getMatchHistoryUri() {
        return matchHistoryUri;
    }

    public void setMatchHistoryUri(String matchHistoryUri) {
        this.matchHistoryUri = matchHistoryUri;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public long getCurrentAccountId() {
        return currentAccountId;
    }

    public void setCurrentAccountId(long currentAccountId) {
        this.currentAccountId = currentAccountId;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public int getProfileIcon() {
        return profileIcon;
    }

    public void setProfileIcon(int profileIcon) {
        this.profileIcon = profileIcon;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.currentPlatformId);
        dest.writeString(this.summonerName);
        dest.writeString(this.matchHistoryUri);
        dest.writeString(this.platformId);
        dest.writeLong(this.currentAccountId);
        dest.writeLong(this.summonerId);
        dest.writeLong(this.accountId);
        dest.writeInt(this.profileIcon);
    }

    public PlayerDto() {
    }

    protected PlayerDto(Parcel in) {
        this.currentPlatformId = in.readString();
        this.summonerName = in.readString();
        this.matchHistoryUri = in.readString();
        this.platformId = in.readString();
        this.currentAccountId = in.readLong();
        this.summonerId = in.readLong();
        this.accountId = in.readLong();
        this.profileIcon = in.readInt();
    }

    public static final Parcelable.Creator<PlayerDto> CREATOR = new Parcelable.Creator<PlayerDto>() {
        @Override
        public PlayerDto createFromParcel(Parcel source) {
            return new PlayerDto(source);
        }

        @Override
        public PlayerDto[] newArray(int size) {
            return new PlayerDto[size];
        }
    };
}
