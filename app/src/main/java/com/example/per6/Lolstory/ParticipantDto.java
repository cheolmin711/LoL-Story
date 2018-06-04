package com.example.per6.Lolstory;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class ParticipantDto implements Parcelable {
    private ParticipantStatsDto stats;
    private int participantId, teamId, spell2Id, spell1Id, championId;
    private List<MasteryDto> runes;
    //private  ParticipantTimelineDto timeline;
    private String highestAchievedSeasonTier;

    public ParticipantStatsDto getStats() {
        return stats;
    }

    public void setStats(ParticipantStatsDto stats) {
        this.stats = stats;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getSpell2Id() {
        return spell2Id;
    }

    public void setSpell2Id(int spell2Id) {
        this.spell2Id = spell2Id;
    }

    public int getSpell1Id() {
        return spell1Id;
    }

    public void setSpell1Id(int spell1Id) {
        this.spell1Id = spell1Id;
    }

    public int getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
    }

    public List<MasteryDto> getRunes() {
        return runes;
    }

    public void setRunes(List<MasteryDto> runes) {
        this.runes = runes;
    }

//    public ParticipantTimelineDto getTimeline() {
//        return timeline;
//    }

//    public void setTimeline(ParticipantTimelineDto timeline) {
//        this.timeline = timeline;
//    }

    public String getHighestAchievedSeasonTier() {
        return highestAchievedSeasonTier;
    }

    public void setHighestAchievedSeasonTier(String highestAchievedSeasonTier) {
        this.highestAchievedSeasonTier = highestAchievedSeasonTier;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.stats, flags);
        dest.writeInt(this.participantId);
        dest.writeInt(this.teamId);
        dest.writeInt(this.spell2Id);
        dest.writeInt(this.spell1Id);
        dest.writeInt(this.championId);
        dest.writeList(this.runes);
        //dest.writeParcelable(this.timeline, flags);
        dest.writeString(this.highestAchievedSeasonTier);
    }



    protected ParticipantDto(Parcel in) {
        this.stats = in.readParcelable(ParticipantStatsDto.class.getClassLoader());
        this.participantId = in.readInt();
        this.teamId = in.readInt();
        this.spell2Id = in.readInt();
        this.spell1Id = in.readInt();
        this.championId = in.readInt();
        this.runes = new ArrayList<MasteryDto>();
        in.readList(this.runes, MasteryDto.class.getClassLoader());
        //this.timeline = in.readParcelable(ParticipantTimelineDto.class.getClassLoader());
        this.highestAchievedSeasonTier = in.readString();
    }

    public static final Parcelable.Creator<ParticipantDto> CREATOR = new Parcelable.Creator<ParticipantDto>() {
        @Override
        public ParticipantDto createFromParcel(Parcel source) {
            return new ParticipantDto(source);
        }

        @Override
        public ParticipantDto[] newArray(int size) {
            return new ParticipantDto[size];
        }
    };
}
