package com.example.per6.Lolstory;

import android.os.Parcel;
import android.os.Parcelable;

public class TeamBansDto implements Parcelable {
    private int pickTurn, championId;

    public int getPickTurn() {
        return pickTurn;
    }

    public void setPickTurn(int pickTurn) {
        this.pickTurn = pickTurn;
    }

    public int getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.pickTurn);
        dest.writeInt(this.championId);
    }

    public TeamBansDto() {
    }

    protected TeamBansDto(Parcel in) {
        this.pickTurn = in.readInt();
        this.championId = in.readInt();
    }

    public static final Parcelable.Creator<TeamBansDto> CREATOR = new Parcelable.Creator<TeamBansDto>() {
        @Override
        public TeamBansDto createFromParcel(Parcel source) {
            return new TeamBansDto(source);
        }

        @Override
        public TeamBansDto[] newArray(int size) {
            return new TeamBansDto[size];
        }
    };
}
