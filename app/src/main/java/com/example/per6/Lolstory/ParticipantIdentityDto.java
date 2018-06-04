package com.example.per6.Lolstory;

import android.os.Parcel;
import android.os.Parcelable;

public class ParticipantIdentityDto implements Parcelable {

    private PlayerDto player;
    private int participantId;

    public PlayerDto getPlayer() {
        return player;
    }

    public void setPlayer(PlayerDto player) {
        this.player = player;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.player, flags);
        dest.writeInt(this.participantId);
    }

    public ParticipantIdentityDto() {
    }

    protected ParticipantIdentityDto(Parcel in) {
        this.player = in.readParcelable(PlayerDto.class.getClassLoader());
        this.participantId = in.readInt();
    }

    public static final Parcelable.Creator<ParticipantIdentityDto> CREATOR = new Parcelable.Creator<ParticipantIdentityDto>() {
        @Override
        public ParticipantIdentityDto createFromParcel(Parcel source) {
            return new ParticipantIdentityDto(source);
        }

        @Override
        public ParticipantIdentityDto[] newArray(int size) {
            return new ParticipantIdentityDto[size];
        }
    };
}
