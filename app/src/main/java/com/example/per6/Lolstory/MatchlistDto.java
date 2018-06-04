package com.example.per6.Lolstory;

import java.util.List;

/**
 * Created by per6 on 3/29/18.
 */

public class MatchlistDto {
    private List<MatchReferenceDto> matches;
    private int totalGames,startIndex,endIndex;

    public List<MatchReferenceDto> getMatches() {
        return matches;
    }

    public void setMatches(List<MatchReferenceDto> matches) {
        this.matches = matches;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(int totalGames) {
        this.totalGames = totalGames;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}
