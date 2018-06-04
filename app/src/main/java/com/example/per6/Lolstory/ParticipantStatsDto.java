package com.example.per6.Lolstory;

import android.os.Parcel;
import android.os.Parcelable;

public class ParticipantStatsDto implements Parcelable {
    private long physicalDamageDealt, magicDamageDealt, totalDamageDealt, magicDamageDealtToChampions,
            damageDealtToObjectives, visionScore, damageSelfMitigated, magicDamageTaken, trueDamageTaken,
            damageDealtToTurrets, physicalDamageDealtToChampions, trueDamageDealt, trueDamageDealtToChampions,
            totalHeal, totalDamageDealtToChampions, totalDamageTaken, timeCCingOthers, physicalDamageTaken;
    private int neutralMinionsKilledTeamJungle, totalPlayerScore, deaths, neutralMinsionsKilledEnemyJungle,
            altarsCaptured, largestCriticalStrike, visionWardsBoughInGame, largestKillingSpree, item1, quadraKills,
            teamObjective, totalTimeCrowdControlDealt, longestTimeSpendLiving, wardsKilled, item2, item0, item3,
            wardsPlaced, item4, item5, item6, turretKills, tripleKills, championLevel, nodeNeutralizeAssist,
            goldEarned, kills, doubleKills, nodeCaptureAssist, nodeNeutralize, assists, unrealKills, neutralMinionsKilled,
            objectivePlayerScore, combatPlayerScore, altarsNeutralized, goldSpent, participantId, pentaKills,
            totalMinionsKilled, nodeCapture, largestMultiKill, sightWardsBoughtInGame, totalUnitsHealed, inhibitorKills,
            totalScoreRank, killingSprees;
    private boolean win, firstTowerAssist, firstTowerKill,firstBloodAssist, firstInhibitorKill, firstInhibitorAssist,
            firstBloodKill;

    public long getTimeCCingOthers() {
        return timeCCingOthers;
    }

    public void setTimeCCingOthers(long timeCCingOthers) {
        this.timeCCingOthers = timeCCingOthers;
    }

    public long getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    public void setPhysicalDamageTaken(long physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
    }

    public long getPhysicalDamageDealt() {
        return physicalDamageDealt;
    }

    public void setPhysicalDamageDealt(long physicalDamageDealt) {
        this.physicalDamageDealt = physicalDamageDealt;
    }

    public long getMagicDamageDealt() {
        return magicDamageDealt;
    }

    public void setMagicDamageDealt(long magicDamageDealt) {
        this.magicDamageDealt = magicDamageDealt;
    }

    public long getTotalDamageDealt() {
        return totalDamageDealt;
    }

    public void setTotalDamageDealt(long totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
    }

    public long getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    public void setMagicDamageDealtToChampions(long magicDamageDealtToChampions) {
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
    }

    public long getDamageDealtToObjectives() {
        return damageDealtToObjectives;
    }

    public void setDamageDealtToObjectives(long damageDealtToObjectives) {
        this.damageDealtToObjectives = damageDealtToObjectives;
    }

    public long getVisionScore() {
        return visionScore;
    }

    public void setVisionScore(long visionScore) {
        this.visionScore = visionScore;
    }

    public long getDamageSelfMitigated() {
        return damageSelfMitigated;
    }

    public void setDamageSelfMitigated(long damageSelfMitigated) {
        this.damageSelfMitigated = damageSelfMitigated;
    }

    public long getMagicDamageTaken() {
        return magicDamageTaken;
    }

    public void setMagicDamageTaken(long magicDamageTaken) {
        this.magicDamageTaken = magicDamageTaken;
    }

    public long getTrueDamageTaken() {
        return trueDamageTaken;
    }

    public void setTrueDamageTaken(long trueDamageTaken) {
        this.trueDamageTaken = trueDamageTaken;
    }

    public long getDamageDealtToTurrets() {
        return damageDealtToTurrets;
    }

    public void setDamageDealtToTurrets(long damageDealtToTurrets) {
        this.damageDealtToTurrets = damageDealtToTurrets;
    }

    public long getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    public void setPhysicalDamageDealtToChampions(long physicalDamageDealtToChampions) {
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
    }

    public long getTrueDamageDealt() {
        return trueDamageDealt;
    }

    public void setTrueDamageDealt(long trueDamageDealt) {
        this.trueDamageDealt = trueDamageDealt;
    }

    public long getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    public void setTrueDamageDealtToChampions(long trueDamageDealtToChampions) {
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
    }

    public long getTotalHeal() {
        return totalHeal;
    }

    public void setTotalHeal(long totalHeal) {
        this.totalHeal = totalHeal;
    }

    public long getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    public void setTotalDamageDealtToChampions(long totalDamageDealtToChampions) {
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
    }

    public long getTotalDamageTaken() {
        return totalDamageTaken;
    }

    public void setTotalDamageTaken(long totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
    }

    public int getNeutralMinionsKilledTeamJungle() {
        return neutralMinionsKilledTeamJungle;
    }

    public void setNeutralMinionsKilledTeamJungle(int neutralMinionsKilledTeamJungle) {
        this.neutralMinionsKilledTeamJungle = neutralMinionsKilledTeamJungle;
    }

    public int getTotalPlayerScore() {
        return totalPlayerScore;
    }

    public void setTotalPlayerScore(int totalPlayerScore) {
        this.totalPlayerScore = totalPlayerScore;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getNeutralMinsionsKilledEnemyJungle() {
        return neutralMinsionsKilledEnemyJungle;
    }

    public void setNeutralMinsionsKilledEnemyJungle(int neutralMinsionsKilledEnemyJungle) {
        this.neutralMinsionsKilledEnemyJungle = neutralMinsionsKilledEnemyJungle;
    }

    public int getAltarsCaptured() {
        return altarsCaptured;
    }

    public void setAltarsCaptured(int altarsCaptured) {
        this.altarsCaptured = altarsCaptured;
    }

    public int getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    public void setLargestCriticalStrike(int largestCriticalStrike) {
        this.largestCriticalStrike = largestCriticalStrike;
    }

    public int getVisionWardsBoughInGame() {
        return visionWardsBoughInGame;
    }

    public void setVisionWardsBoughInGame(int visionWardsBoughInGame) {
        this.visionWardsBoughInGame = visionWardsBoughInGame;
    }

    public int getLargestKillingSpree() {
        return largestKillingSpree;
    }

    public void setLargestKillingSpree(int largestKillingSpree) {
        this.largestKillingSpree = largestKillingSpree;
    }

    public int getItem1() {
        return item1;
    }

    public void setItem1(int item1) {
        this.item1 = item1;
    }

    public int getQuadraKills() {
        return quadraKills;
    }

    public void setQuadraKills(int quadraKills) {
        this.quadraKills = quadraKills;
    }

    public int getTeamObjective() {
        return teamObjective;
    }

    public void setTeamObjective(int teamObjective) {
        this.teamObjective = teamObjective;
    }

    public int getTotalTimeCrowdControlDealt() {
        return totalTimeCrowdControlDealt;
    }

    public void setTotalTimeCrowdControlDealt(int totalTimeCrowdControlDealt) {
        this.totalTimeCrowdControlDealt = totalTimeCrowdControlDealt;
    }

    public int getLongestTimeSpendLiving() {
        return longestTimeSpendLiving;
    }

    public void setLongestTimeSpendLiving(int longestTimeSpendLiving) {
        this.longestTimeSpendLiving = longestTimeSpendLiving;
    }

    public int getWardsKilled() {
        return wardsKilled;
    }

    public void setWardsKilled(int wardsKilled) {
        this.wardsKilled = wardsKilled;
    }

    public int getItem2() {
        return item2;
    }

    public void setItem2(int item2) {
        this.item2 = item2;
    }

    public int getItem0() {
        return item0;
    }

    public void setItem0(int item0) {
        this.item0 = item0;
    }

    public int getItem3() {
        return item3;
    }

    public void setItem3(int item3) {
        this.item3 = item3;
    }

    public int getWardsPlaced() {
        return wardsPlaced;
    }

    public void setWardsPlaced(int wardsPlaced) {
        this.wardsPlaced = wardsPlaced;
    }

    public int getItem4() {
        return item4;
    }

    public void setItem4(int item4) {
        this.item4 = item4;
    }

    public int getItem5() {
        return item5;
    }

    public void setItem5(int item5) {
        this.item5 = item5;
    }

    public int getItem6() {
        return item6;
    }

    public void setItem6(int item6) {
        this.item6 = item6;
    }

    public int getTurretKills() {
        return turretKills;
    }

    public void setTurretKills(int turretKills) {
        this.turretKills = turretKills;
    }

    public int getTripleKills() {
        return tripleKills;
    }

    public void setTripleKills(int tripleKills) {
        this.tripleKills = tripleKills;
    }

    public int getChampionLevel() {
        return championLevel;
    }

    public void setChampionLevel(int championLevel) {
        this.championLevel = championLevel;
    }

    public int getNodeNeutralizeAssist() {
        return nodeNeutralizeAssist;
    }

    public void setNodeNeutralizeAssist(int nodeNeutralizeAssist) {
        this.nodeNeutralizeAssist = nodeNeutralizeAssist;
    }

    public int getGoldEarned() {
        return goldEarned;
    }

    public void setGoldEarned(int goldEarned) {
        this.goldEarned = goldEarned;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDoubleKills() {
        return doubleKills;
    }

    public void setDoubleKills(int doubleKills) {
        this.doubleKills = doubleKills;
    }

    public int getNodeCaptureAssist() {
        return nodeCaptureAssist;
    }

    public void setNodeCaptureAssist(int nodeCaptureAssist) {
        this.nodeCaptureAssist = nodeCaptureAssist;
    }

    public int getNodeNeutralize() {
        return nodeNeutralize;
    }

    public void setNodeNeutralize(int nodeNeutralize) {
        this.nodeNeutralize = nodeNeutralize;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getUnrealKills() {
        return unrealKills;
    }

    public void setUnrealKills(int unrealKills) {
        this.unrealKills = unrealKills;
    }

    public int getNeutralMinionsKilled() {
        return neutralMinionsKilled;
    }

    public void setNeutralMinionsKilled(int neutralMinionsKilled) {
        this.neutralMinionsKilled = neutralMinionsKilled;
    }

    public int getObjectivePlayerScore() {
        return objectivePlayerScore;
    }

    public void setObjectivePlayerScore(int objectivePlayerScore) {
        this.objectivePlayerScore = objectivePlayerScore;
    }

    public int getCombatPlayerScore() {
        return combatPlayerScore;
    }

    public void setCombatPlayerScore(int combatPlayerScore) {
        this.combatPlayerScore = combatPlayerScore;
    }

    public int getAltarsNeutralized() {
        return altarsNeutralized;
    }

    public void setAltarsNeutralized(int altarsNeutralized) {
        this.altarsNeutralized = altarsNeutralized;
    }

    public int getGoldSpent() {
        return goldSpent;
    }

    public void setGoldSpent(int goldSpent) {
        this.goldSpent = goldSpent;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public int getPentaKills() {
        return pentaKills;
    }

    public void setPentaKills(int pentaKills) {
        this.pentaKills = pentaKills;
    }

    public int getTotalMinionsKilled() {
        return totalMinionsKilled;
    }

    public void setTotalMinionsKilled(int totalMinionsKilled) {
        this.totalMinionsKilled = totalMinionsKilled;
    }

    public int getNodeCapture() {
        return nodeCapture;
    }

    public void setNodeCapture(int nodeCapture) {
        this.nodeCapture = nodeCapture;
    }

    public int getLargestMultiKill() {
        return largestMultiKill;
    }

    public void setLargestMultiKill(int largestMultiKill) {
        this.largestMultiKill = largestMultiKill;
    }

    public int getSightWardsBoughtInGame() {
        return sightWardsBoughtInGame;
    }

    public void setSightWardsBoughtInGame(int sightWardsBoughtInGame) {
        this.sightWardsBoughtInGame = sightWardsBoughtInGame;
    }

    public int getTotalUnitsHealed() {
        return totalUnitsHealed;
    }

    public void setTotalUnitsHealed(int totalUnitsHealed) {
        this.totalUnitsHealed = totalUnitsHealed;
    }

    public int getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(int inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public int getTotalScoreRank() {
        return totalScoreRank;
    }

    public void setTotalScoreRank(int totalScoreRank) {
        this.totalScoreRank = totalScoreRank;
    }

    public int getKillingSprees() {
        return killingSprees;
    }

    public void setKillingSprees(int killingSprees) {
        this.killingSprees = killingSprees;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public boolean isFirstTowerAssist() {
        return firstTowerAssist;
    }

    public void setFirstTowerAssist(boolean firstTowerAssist) {
        this.firstTowerAssist = firstTowerAssist;
    }

    public boolean isFirstTowerKill() {
        return firstTowerKill;
    }

    public void setFirstTowerKill(boolean firstTowerKill) {
        this.firstTowerKill = firstTowerKill;
    }

    public boolean isFirstBloodAssist() {
        return firstBloodAssist;
    }

    public void setFirstBloodAssist(boolean firstBloodAssist) {
        this.firstBloodAssist = firstBloodAssist;
    }

    public boolean isFirstInhibitorKill() {
        return firstInhibitorKill;
    }

    public void setFirstInhibitorKill(boolean firstInhibitorKill) {
        this.firstInhibitorKill = firstInhibitorKill;
    }

    public boolean isFirstInhibitorAssist() {
        return firstInhibitorAssist;
    }

    public void setFirstInhibitorAssist(boolean firstInhibitorAssist) {
        this.firstInhibitorAssist = firstInhibitorAssist;
    }

    public boolean isFirstBloodKill() {
        return firstBloodKill;
    }

    public void setFirstBloodKill(boolean firstBloodKill) {
        this.firstBloodKill = firstBloodKill;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.physicalDamageDealt);
        dest.writeLong(this.magicDamageDealt);
        dest.writeLong(this.totalDamageDealt);
        dest.writeLong(this.magicDamageDealtToChampions);
        dest.writeLong(this.damageDealtToObjectives);
        dest.writeLong(this.visionScore);
        dest.writeLong(this.damageSelfMitigated);
        dest.writeLong(this.magicDamageTaken);
        dest.writeLong(this.trueDamageTaken);
        dest.writeLong(this.damageDealtToTurrets);
        dest.writeLong(this.physicalDamageDealtToChampions);
        dest.writeLong(this.trueDamageDealt);
        dest.writeLong(this.trueDamageDealtToChampions);
        dest.writeLong(this.totalHeal);
        dest.writeLong(this.totalDamageDealtToChampions);
        dest.writeLong(this.totalDamageTaken);
        dest.writeLong(this.timeCCingOthers);
        dest.writeLong(this.physicalDamageTaken);
        dest.writeInt(this.neutralMinionsKilledTeamJungle);
        dest.writeInt(this.totalPlayerScore);
        dest.writeInt(this.deaths);
        dest.writeInt(this.neutralMinsionsKilledEnemyJungle);
        dest.writeInt(this.altarsCaptured);
        dest.writeInt(this.largestCriticalStrike);
        dest.writeInt(this.visionWardsBoughInGame);
        dest.writeInt(this.largestKillingSpree);
        dest.writeInt(this.item1);
        dest.writeInt(this.quadraKills);
        dest.writeInt(this.teamObjective);
        dest.writeInt(this.totalTimeCrowdControlDealt);
        dest.writeInt(this.longestTimeSpendLiving);
        dest.writeInt(this.wardsKilled);
        dest.writeInt(this.item2);
        dest.writeInt(this.item0);
        dest.writeInt(this.item3);
        dest.writeInt(this.wardsPlaced);
        dest.writeInt(this.item4);
        dest.writeInt(this.item5);
        dest.writeInt(this.item6);
        dest.writeInt(this.turretKills);
        dest.writeInt(this.tripleKills);
        dest.writeInt(this.championLevel);
        dest.writeInt(this.nodeNeutralizeAssist);
        dest.writeInt(this.goldEarned);
        dest.writeInt(this.kills);
        dest.writeInt(this.doubleKills);
        dest.writeInt(this.nodeCaptureAssist);
        dest.writeInt(this.nodeNeutralize);
        dest.writeInt(this.assists);
        dest.writeInt(this.unrealKills);
        dest.writeInt(this.neutralMinionsKilled);
        dest.writeInt(this.objectivePlayerScore);
        dest.writeInt(this.combatPlayerScore);
        dest.writeInt(this.altarsNeutralized);
        dest.writeInt(this.goldSpent);
        dest.writeInt(this.participantId);
        dest.writeInt(this.pentaKills);
        dest.writeInt(this.totalMinionsKilled);
        dest.writeInt(this.nodeCapture);
        dest.writeInt(this.largestMultiKill);
        dest.writeInt(this.sightWardsBoughtInGame);
        dest.writeInt(this.totalUnitsHealed);
        dest.writeInt(this.inhibitorKills);
        dest.writeInt(this.totalScoreRank);
        dest.writeInt(this.killingSprees);
        dest.writeByte(this.win ? (byte) 1 : (byte) 0);
        dest.writeByte(this.firstTowerAssist ? (byte) 1 : (byte) 0);
        dest.writeByte(this.firstTowerKill ? (byte) 1 : (byte) 0);
        dest.writeByte(this.firstBloodAssist ? (byte) 1 : (byte) 0);
        dest.writeByte(this.firstInhibitorKill ? (byte) 1 : (byte) 0);
        dest.writeByte(this.firstInhibitorAssist ? (byte) 1 : (byte) 0);
        dest.writeByte(this.firstBloodKill ? (byte) 1 : (byte) 0);
    }

    public ParticipantStatsDto() {
    }

    protected ParticipantStatsDto(Parcel in) {
        this.physicalDamageDealt = in.readLong();
        this.magicDamageDealt = in.readLong();
        this.totalDamageDealt = in.readLong();
        this.magicDamageDealtToChampions = in.readLong();
        this.damageDealtToObjectives = in.readLong();
        this.visionScore = in.readLong();
        this.damageSelfMitigated = in.readLong();
        this.magicDamageTaken = in.readLong();
        this.trueDamageTaken = in.readLong();
        this.damageDealtToTurrets = in.readLong();
        this.physicalDamageDealtToChampions = in.readLong();
        this.trueDamageDealt = in.readLong();
        this.trueDamageDealtToChampions = in.readLong();
        this.totalHeal = in.readLong();
        this.totalDamageDealtToChampions = in.readLong();
        this.totalDamageTaken = in.readLong();
        this.timeCCingOthers = in.readLong();
        this.physicalDamageTaken = in.readLong();
        this.neutralMinionsKilledTeamJungle = in.readInt();
        this.totalPlayerScore = in.readInt();
        this.deaths = in.readInt();
        this.neutralMinsionsKilledEnemyJungle = in.readInt();
        this.altarsCaptured = in.readInt();
        this.largestCriticalStrike = in.readInt();
        this.visionWardsBoughInGame = in.readInt();
        this.largestKillingSpree = in.readInt();
        this.item1 = in.readInt();
        this.quadraKills = in.readInt();
        this.teamObjective = in.readInt();
        this.totalTimeCrowdControlDealt = in.readInt();
        this.longestTimeSpendLiving = in.readInt();
        this.wardsKilled = in.readInt();
        this.item2 = in.readInt();
        this.item0 = in.readInt();
        this.item3 = in.readInt();
        this.wardsPlaced = in.readInt();
        this.item4 = in.readInt();
        this.item5 = in.readInt();
        this.item6 = in.readInt();
        this.turretKills = in.readInt();
        this.tripleKills = in.readInt();
        this.championLevel = in.readInt();
        this.nodeNeutralizeAssist = in.readInt();
        this.goldEarned = in.readInt();
        this.kills = in.readInt();
        this.doubleKills = in.readInt();
        this.nodeCaptureAssist = in.readInt();
        this.nodeNeutralize = in.readInt();
        this.assists = in.readInt();
        this.unrealKills = in.readInt();
        this.neutralMinionsKilled = in.readInt();
        this.objectivePlayerScore = in.readInt();
        this.combatPlayerScore = in.readInt();
        this.altarsNeutralized = in.readInt();
        this.goldSpent = in.readInt();
        this.participantId = in.readInt();
        this.pentaKills = in.readInt();
        this.totalMinionsKilled = in.readInt();
        this.nodeCapture = in.readInt();
        this.largestMultiKill = in.readInt();
        this.sightWardsBoughtInGame = in.readInt();
        this.totalUnitsHealed = in.readInt();
        this.inhibitorKills = in.readInt();
        this.totalScoreRank = in.readInt();
        this.killingSprees = in.readInt();
        this.win = in.readByte() != 0;
        this.firstTowerAssist = in.readByte() != 0;
        this.firstTowerKill = in.readByte() != 0;
        this.firstBloodAssist = in.readByte() != 0;
        this.firstInhibitorKill = in.readByte() != 0;
        this.firstInhibitorAssist = in.readByte() != 0;
        this.firstBloodKill = in.readByte() != 0;
    }

    public static final Parcelable.Creator<ParticipantStatsDto> CREATOR = new Parcelable.Creator<ParticipantStatsDto>() {
        @Override
        public ParticipantStatsDto createFromParcel(Parcel source) {
            return new ParticipantStatsDto(source);
        }

        @Override
        public ParticipantStatsDto[] newArray(int size) {
            return new ParticipantStatsDto[size];
        }
    };
}
