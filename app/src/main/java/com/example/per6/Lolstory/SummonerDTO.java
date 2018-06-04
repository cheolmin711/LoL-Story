package com.example.per6.Lolstory;

import android.os.Parcel;
import android.os.Parcelable;

public class SummonerDTO implements Parcelable {
    private int profileIconId;
    private String name;
    private long summonerLevel, revisionDate, id, accountId;

    public SummonerDTO(int profileIconId, String name, long summonerLevel, long revisionDate, long id, long accountId) {
        this.profileIconId = profileIconId;
        this.name = name;
        this.summonerLevel = summonerLevel;
        this.revisionDate = revisionDate;
        this.id = id;
        this.accountId = accountId;
    }

    public int getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(int profileIconId) {
        this.profileIconId = profileIconId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(long summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(long revisionDate) {
        this.revisionDate = revisionDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getaccountId() {
        return accountId;
    }

    public void setaccountId(long accountId) {
        this.accountId = accountId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.profileIconId);
        dest.writeString(this.name);
        dest.writeLong(this.summonerLevel);
        dest.writeLong(this.revisionDate);
        dest.writeLong(this.id);
        dest.writeLong(this.accountId);
    }

    protected SummonerDTO(Parcel in) {
        this.profileIconId = in.readInt();
        this.name = in.readString();
        this.summonerLevel = in.readLong();
        this.revisionDate = in.readLong();
        this.id = in.readLong();
        this.accountId = in.readLong();
    }

    public static final Parcelable.Creator<SummonerDTO> CREATOR = new Parcelable.Creator<SummonerDTO>() {
        @Override
        public SummonerDTO createFromParcel(Parcel source) {
            return new SummonerDTO(source);
        }

        @Override
        public SummonerDTO[] newArray(int size) {
            return new SummonerDTO[size];
        }
    };

    @Override
    public String toString() {
        return "SummonerDTO{" +
                "profileIconId=" + profileIconId +
                ", name='" + name + '\'' +
                ", summonerLevel=" + summonerLevel +
                ", revisionDate=" + revisionDate +
                ", id=" + id +
                ", accountId=" + accountId +
                '}';
    }
}
