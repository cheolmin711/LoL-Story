package com.example.per6.Lolstory;

import android.provider.ContactsContract;

import java.util.List;
import java.util.Set;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface API {
    public static final String baseUrl = "https://na1.api.riotgames.com";

    @GET("/lol/summoner/v3/summoners/by-name/{summonerName}?api_key=RGAPI-9564df5a-dbe4-45bc-8150-7189128ad39c")
    Call<SummonerDTO>  getSummonerDTO(@Path("summonerName") String str );

    @GET("/lol/match/v3/matchlists/by-account/{accountId}?api_key=RGAPI-9564df5a-dbe4-45bc-8150-7189128ad39c")
    Call<MatchlistDto> getMatchlistDto(@Path("accountId")Long lng);

    @GET("/lol/match/v3/matches/{matchId}?api_key=RGAPI-9564df5a-dbe4-45bc-8150-7189128ad39c")
    Call<MatchDto> getMatchDto(@Path("matchId") Long lng);

    @GET("/lol/league/v3/positions/by-summoner/{summonerId}?api_key=RGAPI-9564df5a-dbe4-45bc-8150-7189128ad39c")
    Call<Set<LeaguePositionDTO>> getLeaguePositionDTO(@Path("summonerId") Long lng);

    @GET("lol/static-data/v3/profile-icons?api_key=RGAPI-9564df5a-dbe4-45bc-8150-7189128ad39c")
    Call<ProfileIconDataDto> getProfileIconDataDto(@Path("profileIconId")Integer integer );

    @GET("?lol/static-data/v3/champions/{chmPointsapionId}?api_key=RGAPI-9564df5a-dbe4-45bc-8150-7189128ad39c")
    Call<ChampionDto> getChampionDto(@Path("championId")Integer integer );

    @GET("lol/champion-mastery/v3/champion-masteries/by-summoner/{summonerId}?api_key=RGAPI-9564df5a-dbe4-45bc-8150-7189128ad39c")
    Call<List<ChampionMasteryDTO>> getChampionMasteryDTO(@Path("summonerId")Long lng);

    ///
    }
