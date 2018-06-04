package com.example.per6.Lolstory;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class ParticipantTimelineDto implements Parcelable {
    private String lane, role;
    private int participantId;
//    private Map<String,Double> csDiffPerMinDeltas;
//    private Map<String,Double>goldPerMinDeltas;
//    private Map<String,Double>xpDifferPerMinDeltas;
//    private Map<String,Double>creepsPerMinDeltas;
//    private Map<String,Double>xpPerMinDeltas;
//    private Map<String,Double>damageTakenDiffPerMinDeltas;
//    private Map<String,Double>damageTakenPerMinDeltas;

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

//    public Map<String, Double> getCsDiffPerMinDeltas() {
//        return csDiffPerMinDeltas;
//    }
//
//    public void setCsDiffPerMinDeltas(Map<String, Double> csDiffPerMinDeltas) {
//        this.csDiffPerMinDeltas = csDiffPerMinDeltas;
//    }
//
//    public Map<String, Double> getGoldPerMinDeltas() {
//        return goldPerMinDeltas;
//    }
//
//    public void setGoldPerMinDeltas(Map<String, Double> goldPerMinDeltas) {
//        this.goldPerMinDeltas = goldPerMinDeltas;
//    }
//
//    public Map<String, Double> getXpDifferPerMinDeltas() {
//        return xpDifferPerMinDeltas;
//    }
//
//    public void setXpDifferPerMinDeltas(Map<String, Double> xpDifferPerMinDeltas) {
//        this.xpDifferPerMinDeltas = xpDifferPerMinDeltas;
//    }
//
//    public Map<String, Double> getCreepsPerMinDeltas() {
//        return creepsPerMinDeltas;
//    }
//
//    public void setCreepsPerMinDeltas(Map<String, Double> creepsPerMinDeltas) {
//        this.creepsPerMinDeltas = creepsPerMinDeltas;
//    }
//
//    public Map<String, Double> getXpPerMinDeltas() {
//        return xpPerMinDeltas;
//    }
//
//    public void setXpPerMinDeltas(Map<String, Double> xpPerMinDeltas) {
//        this.xpPerMinDeltas = xpPerMinDeltas;
//    }
//
//    public Map<String, Double> getDamageTakenDiffPerMinDeltas() {
//        return damageTakenDiffPerMinDeltas;
//    }
//
//    public void setDamageTakenDiffPerMinDeltas(Map<String, Double> damageTakenDiffPerMinDeltas) {
//        this.damageTakenDiffPerMinDeltas = damageTakenDiffPerMinDeltas;
//    }
//
//    public Map<String, Double> getDamageTakenPerMinDeltas() {
//        return damageTakenPerMinDeltas;
//    }
//
//    public void setDamageTakenPerMinDeltas(Map<String, Double> damageTakenPerMinDeltas) {
//        this.damageTakenPerMinDeltas = damageTakenPerMinDeltas;
//    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.lane);
        dest.writeString(this.role);
        dest.writeInt(this.participantId);
//        dest.writeDouble(this.csDiffPerMinDeltas.size());
//        for (Map.Entry<String, Double> entry : this.csDiffPerMinDeltas.entrySet()) {
//
//            dest.writeString(entry.getKey());
//            dest.writeValue(entry.getValue());
//        }
//        dest.writeDouble(this.goldPerMinDeltas.size());
//        for (Map.Entry<String, Double> entry : this.goldPerMinDeltas.entrySet()) {
//            dest.writeString(entry.getKey());
//            dest.writeValue(entry.getValue());
//        }
//        dest.writeDouble(this.xpDifferPerMinDeltas.size());
//        for (Map.Entry<String, Double> entry : this.xpDifferPerMinDeltas.entrySet()) {
//            dest.writeString(entry.getKey());
//            dest.writeValue(entry.getValue());
//        }
//        dest.writeDouble(this.creepsPerMinDeltas.size());
//        for (Map.Entry<String, Double> entry : this.creepsPerMinDeltas.entrySet()) {
//            dest.writeString(entry.getKey());
//            dest.writeValue(entry.getValue());
//        }
//        dest.writeDouble(this.xpPerMinDeltas.size());
//        for (Map.Entry<String, Double> entry : this.xpPerMinDeltas.entrySet()) {
//            dest.writeString(entry.getKey());
//            dest.writeValue(entry.getValue());
//        }
//        dest.writeDouble(this.damageTakenDiffPerMinDeltas.size());
//        for (Map.Entry<String, Double> entry : this.damageTakenDiffPerMinDeltas.entrySet()) {
//            dest.writeString(entry.getKey());
//            dest.writeValue(entry.getValue());
//        }
//        dest.writeDouble(this.damageTakenPerMinDeltas.size());
//        for (Map.Entry<String, Double> entry : this.damageTakenPerMinDeltas.entrySet()) {
//            dest.writeString(entry.getKey());
//            dest.writeValue(entry.getValue());
//        }
    }

    public ParticipantTimelineDto() {
    }

    protected ParticipantTimelineDto(Parcel in) {
        this.lane = in.readString();
        this.role = in.readString();
        this.participantId = in.readInt();
        int csDiffPerMinDeltasSize = in.readInt();
//        this.csDiffPerMinDeltas = new HashMap<String, Double>(csDiffPerMinDeltasSize);
//        for (int i = 0; i < csDiffPerMinDeltasSize; i++) {
//            String key = in.readString();
//            Double value = (Double) in.readValue(Double.class.getClassLoader());
//            this.csDiffPerMinDeltas.put(key, value);
//        }
//        int goldPerMinDeltasSize = in.readInt();
//        this.goldPerMinDeltas = new HashMap<String, Double>(goldPerMinDeltasSize);
//        for (int i = 0; i < goldPerMinDeltasSize; i++) {
//            String key = in.readString();
//            Double value = (Double) in.readValue(Double.class.getClassLoader());
//            this.goldPerMinDeltas.put(key, value);
//        }
//        int xpDifferPerMinDeltasSize = in.readInt();
//        this.xpDifferPerMinDeltas = new HashMap<String, Double>(xpDifferPerMinDeltasSize);
//        for (int i = 0; i < xpDifferPerMinDeltasSize; i++) {
//            String key = in.readString();
//            Double value = (Double) in.readValue(Double.class.getClassLoader());
//            this.xpDifferPerMinDeltas.put(key, value);
//        }
//        int creepsPerMinDeltasSize = in.readInt();
//        this.creepsPerMinDeltas = new HashMap<String, Double>(creepsPerMinDeltasSize);
//        for (int i = 0; i < creepsPerMinDeltasSize; i++) {
//            String key = in.readString();
//            Double value = (Double) in.readValue(Double.class.getClassLoader());
//            this.creepsPerMinDeltas.put(key, value);
//        }
//        int xpPerMinDeltasSize = in.readInt();
//        this.xpPerMinDeltas = new HashMap<String, Double>(xpPerMinDeltasSize);
//        for (int i = 0; i < xpPerMinDeltasSize; i++) {
//            String key = in.readString();
//            Double value = (Double) in.readValue(Double.class.getClassLoader());
//            this.xpPerMinDeltas.put(key, value);
//        }
//        int damageTakenDiffPerMinDeltasSize = in.readInt();
//        this.damageTakenDiffPerMinDeltas = new HashMap<String, Double>(damageTakenDiffPerMinDeltasSize);
//        for (int i = 0; i < damageTakenDiffPerMinDeltasSize; i++) {
//            String key = in.readString();
//            Double value = (Double) in.readValue(Double.class.getClassLoader());
//            this.damageTakenDiffPerMinDeltas.put(key, value);
//        }
//        int damageTakenPerMinDeltasSize = in.readInt();
//        this.damageTakenPerMinDeltas = new HashMap<String, Double>(damageTakenPerMinDeltasSize);
//        for (int i = 0; i < damageTakenPerMinDeltasSize; i++) {
//            String key = in.readString();
//            Double value = (Double) in.readValue(Double.class.getClassLoader());
//            this.damageTakenPerMinDeltas.put(key, value);
//        }
    }

    public static final Parcelable.Creator<ParticipantTimelineDto> CREATOR = new Parcelable.Creator<ParticipantTimelineDto>() {
        @Override
        public ParticipantTimelineDto createFromParcel(Parcel source) {
            return new ParticipantTimelineDto(source);
        }

        @Override
        public ParticipantTimelineDto[] newArray(int size) {
            return new ParticipantTimelineDto[size];
        }
    };
}
