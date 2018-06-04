package com.example.per6.Lolstory;

import android.os.Parcel;
import android.os.Parcelable;

public class MasteryDto implements Parcelable {
    private int masteryId, rank;

    public int getMasteryId() {
        return masteryId;
    }

    public void setMasteryId(int masteryId) {
        this.masteryId = masteryId;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.masteryId);
        dest.writeInt(this.rank);
    }

    public MasteryDto() {
    }

    protected MasteryDto(Parcel in) {
        this.masteryId = in.readInt();
        this.rank = in.readInt();
    }

    public static final Parcelable.Creator<MasteryDto> CREATOR = new Parcelable.Creator<MasteryDto>() {
        @Override
        public MasteryDto createFromParcel(Parcel source) {
            return new MasteryDto(source);
        }

        @Override
        public MasteryDto[] newArray(int size) {
            return new MasteryDto[size];
        }
    };
}
