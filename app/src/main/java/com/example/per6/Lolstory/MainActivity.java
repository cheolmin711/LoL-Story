package com.example.per6.Lolstory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TextView gameTypeTextMain;

    Button searchButton;
    EditText summonerNameInput;
    MatchDto matchDto1, matchDto2, matchDto3, matchDto4, matchDto5, matchDto6, matchDto7, matchDto8, matchDto9, matchDto10 ;
    API apiService;
    SummonerDTO summonerDTO;
    private int chmPoints1, chmPoints2, chmPoints3, chmPoints4, chmPoints5, chmPoints6, chmPoints7, chmPoints8, chmPoints9, chmPoints10,
            chmlevel1, chmlevel2,chmlevel3, chmlevel4, chmlevel5, chmlevel6, chmlevel7, chmlevel8, chmlevel9, chmlevel10;
    private long chmId1, chmId2, chmId3,chmId4,chmId5,chmId6,chmId7,chmId8,chmId9,chmId10;
    ImageView imageView;
    MatchlistDto matchlistDto;
    public long [] gameIdArray = new long[10];
    private long accountId,summonerId ,matchId1, matchId2, matchId3, matchId4, matchId5, matchId6, matchId7, matchId8, matchId9, matchId10, summonerLevel;
    private String rankFlex, rankSolo, tierFlex,tierSolo,gameTypeMain,summonerName, leagueNameFlex, leagueNameSolo, queueTypeFlex, queueTypeSolo;
    private int profileIconId, winsFlex, winsSolo, lossesFlex,lossesSolo, leaguePointsFlex, leaguePointsSolo;
    Integer championId1OfMatch1, championId2OfMatch1, championId3OfMatch1, championId4OfMatch1, championId5OfMatch1,
            championId6OfMatch1, championId7OfMatch1, championId8OfMatch1, championId9OfMatch1, championId10OfMatch1;
    ImageDto championImage1OfMatch1, championImage2OfMatch1, championImage3OfMatch1, championImage4OfMatch1, championImage5OfMatch1,
            championImage6OfMatch1, championImage7OfMatch1, championImage8OfMatch1, championImage9OfMatch1, championImage10OfMatch1;
    private long[] longsFlex=new long[30];
    private ArrayList<String> stringsFlex=new ArrayList<String>();
    private ArrayList<Integer> integersFlex=new ArrayList<Integer>();
    private long[] longsSolo=new long[30];
    private ArrayList<String> stringsSolo=new ArrayList<String>();
    private ArrayList<Integer> integersSolo=new ArrayList<Integer>();
    private ArrayList<Integer> championLevel=new ArrayList<Integer>();
    private ArrayList<Integer> championPoints=new ArrayList<Integer>();
    private long[] championId=new long[10];

    public static final String EXTRA_MESSAGE= "msg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        apiService = ApiClient.getClient().create(API.class);

        wireWidgets();



        //Toast.makeText(this, "ArrayList successfully sent!", Toast.LENGTH_SHORT).show();


        //setGameTypeTextMain();



    }



    private void wireWidgets() {

        summonerNameInput = (EditText) findViewById(R.id.summonerNameInput);
        searchButton = (Button) findViewById(R.id.searchButton);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                summonerName = summonerNameInput.getText().toString();

                //showToast(summonerName);
                getSummonerInfo();

            }
        });
    }





    public void setGameTypeTextMain() {
        gameTypeMain = (String) matchDto1.getGameType();
        gameTypeTextMain.setText(gameTypeMain);
    }


    public void getSummonerInfo()
    {
        HashMap<String, String> queryParams = new HashMap<>();
        queryParams.put("summonerName",summonerName);
        //queryParams.put("user[name]",etUserName.getText().toString());


        Call<SummonerDTO> call = apiService.getSummonerDTO(summonerName);
        call.enqueue(new Callback<SummonerDTO>() {
            @Override
            public void onResponse(Call<SummonerDTO> call, Response<SummonerDTO> response) {
                if (response != null) {
                    Log.d("look",""+response.body());
                    accountId=response.body().getaccountId();
                    summonerId=response.body().getId();
                    profileIconId= response.body().getProfileIconId();
                    summonerLevel=response.body().getSummonerLevel();
                    Log.d("callback", "onResponse: " + response.body().toString());


                    // Toast.makeText(MainActivity.this, ""+response.body().getaccountId(), Toast.LENGTH_SHORT).show();
                    Log.d("", "onResponse: "+response.body().toString());
                    getChampionMasteryDTO();
                    getMatchlistDto();

                    getProfileIconDataDto();




                } else
                {
                    Log.d("callback", "onResponse: RESPONSE IS NULL");
                    Toast.makeText(MainActivity.this, "response is null", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<SummonerDTO> call, Throwable t) {

            }
        });


    }

    private void getChampionMasteryDTO() {
        HashMap<String, Long> queryParams = new HashMap<>();
        queryParams.put("summonerId",summonerId);
        //queryParams.put("user[name]",etUserName.getText().toString());


        Call<List<ChampionMasteryDTO>> call = apiService.getChampionMasteryDTO(summonerId);
        call.enqueue(new Callback<List<ChampionMasteryDTO>>() {
            @Override
            public void onResponse(Call<List<ChampionMasteryDTO>> call, Response<List<ChampionMasteryDTO>> response) {
                Log.d("mastery", response.body().get(0).getChampionId()+"");
                if (response != null) {

                    ChampionMasteryDTO champ1=response.body().get(0);
                    ChampionMasteryDTO champ2=response.body().get(1);
                    ChampionMasteryDTO champ3=response.body().get(2);
                    ChampionMasteryDTO champ4=response.body().get(3);
                    ChampionMasteryDTO champ5=response.body().get(4);
                    ChampionMasteryDTO champ6=response.body().get(5);
                    ChampionMasteryDTO champ7=response.body().get(6);
                    ChampionMasteryDTO champ8=response.body().get(7);
                    ChampionMasteryDTO champ9=response.body().get(8);
                    ChampionMasteryDTO champ10=response.body().get(9);
                    chmPoints1=champ1.getChampionPoints();
                    chmlevel1=champ1.getChampionLevel();
                    chmId1= champ1.getChampionId();
                    chmPoints2=champ2.getChampionPoints();
                    chmlevel2=champ2.getChampionLevel();
                    chmId2= champ2.getChampionId();
                    chmPoints3=champ3.getChampionPoints();
                    chmlevel3=champ3.getChampionLevel();
                    chmId3= champ3.getChampionId();
                    chmPoints4=champ4.getChampionPoints();
                    chmlevel4=champ4.getChampionLevel();
                    chmId4= champ4.getChampionId();
                    chmPoints5=champ5.getChampionPoints();
                    chmlevel5=champ5.getChampionLevel();
                    chmId5= champ5.getChampionId();
                    chmPoints6=champ6.getChampionPoints();
                    chmlevel6=champ6.getChampionLevel();
                    chmId6= champ6.getChampionId();
                    chmPoints7=champ7.getChampionPoints();
                    chmlevel7=champ7.getChampionLevel();
                    chmId7= champ7.getChampionId();
                    chmPoints8=champ8.getChampionPoints();
                    chmlevel8=champ8.getChampionLevel();
                    chmId8= champ8.getChampionId();
                    chmPoints9=champ9.getChampionPoints();
                    chmlevel9=champ9.getChampionLevel();
                    chmId9= champ9.getChampionId();
                    chmPoints10=champ10.getChampionPoints();
                    chmlevel10=champ10.getChampionLevel();
                    chmId10= champ10.getChampionId();
                    championPoints.add(chmPoints1);
                    championPoints.add(chmPoints2);
                    championPoints.add(chmPoints3);
                    championPoints.add(chmPoints4);
                    championPoints.add(chmPoints5);
                    championPoints.add(chmPoints6);
                    championPoints.add(chmPoints7);
                    championPoints.add(chmPoints8);
                    championPoints.add(chmPoints9);
                    championPoints.add(chmPoints10);
                    championLevel.add(chmlevel1);
                    championLevel.add(chmlevel2);
                    championLevel.add(chmlevel3);
                    championLevel.add(chmlevel4);
                    championLevel.add(chmlevel5);
                    championLevel.add(chmlevel6);
                    championLevel.add(chmlevel7);
                    championLevel.add(chmlevel8);
                    championLevel.add(chmlevel9);
                    championLevel.add(chmlevel10);
                    championId[0]=chmId1;
                    championId[1]=chmId2;
                    championId[2]=chmId3;
                    championId[3]=chmId4;
                    championId[4]=chmId5;
                    championId[5]=chmId6;
                    championId[6]=chmId7;
                    championId[7]=chmId8;
                    championId[8]=chmId9;
                    championId[9]=chmId10;
                    getLeaguePositionDto();
                } else
                {
                    Log.d("callback", "onResponse: RESPONSE IS NULL");
                    Toast.makeText(MainActivity.this, "response is null", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<ChampionMasteryDTO>> call, Throwable t) {

            }
        });
    }

    private void getProfileIconDataDto() {
//        HashMap<String, Integer> queryParams = new HashMap<>();
//        queryParams.put("profileIconDataDto",profileIconId);
//        //queryParams.put("user[name]",etUserName.getText().toString());
//
//
//        Call<ProfileIconDataDto> call = apiService.getLeaguePositionDTO(profileIconId);
//        call.enqueue(new Callback<ProfileIconDataDto>() {
//            @Override
//            public void onResponse(Call<ProfileIconDataDto> call, Response<ProfileIconDataDto> response) {
//                if (response != null) {
//                    ProfileIconDataDto profileIconDataDto= response.body();
//                    profileIconDataDto.getData().get(response.body().getType());
//                } else
//                {
//                    Log.d("callback", "onResponse: RESPONSE IS NULL");
//                    Toast.makeText(MainActivity.this, "response is null", Toast.LENGTH_SHORT).show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ProfileIconDataDto> call, Throwable t) {
//            }
//        });
    }

    public void getMatchlistDto()
    {
        HashMap<String, Long> queryParams = new HashMap<>();
        queryParams.put("accountId",accountId);
        //queryParams.put("user[name]",etUserName.getText().toString());


        Call<MatchlistDto> call = apiService.getMatchlistDto(accountId);
        call.enqueue(new Callback<MatchlistDto>() {
            @Override
            public void onResponse(Call<MatchlistDto> call, Response<MatchlistDto> response) {
                if (response.body() != null) {

                    Log.d("callback", "onResponse: " + response.body().getMatches().get(1).getGameId());
                    //Toast.makeText(MainActivity.this, response.body().getMatches().get(0).getGameId() + "", Toast.LENGTH_SHORT).show();


                    //this only get the first object of the list
                    matchId1 = response.body().getMatches().get(0).getGameId();
                    Log.d("from response", "" + matchId1);
                    matchId2 = response.body().getMatches().get(1).getGameId();
                    matchId3 = response.body().getMatches().get(2).getGameId();
                    matchId4 = response.body().getMatches().get(3).getGameId();
                    matchId5 = response.body().getMatches().get(4).getGameId();
                    matchId6 = response.body().getMatches().get(5).getGameId();
                    matchId7 = response.body().getMatches().get(6).getGameId();
                    matchId8 = response.body().getMatches().get(7).getGameId();
                    matchId9 = response.body().getMatches().get(8).getGameId();
                    matchId10 = response.body().getMatches().get(9).getGameId();
                    gameIdArray [0] = matchId1;
                    Log.d("assigned to array", ""+ matchId1);
                    gameIdArray [1] = matchId2;
                    gameIdArray [2] = matchId3;
                    gameIdArray [3] = matchId4;
                    gameIdArray [4] = matchId5;
                    gameIdArray [5] = matchId6;
                    gameIdArray [6] = matchId7;
                    gameIdArray [7] = matchId8;
                    gameIdArray [8] = matchId9;
                    gameIdArray [9] = matchId10;

                    matchlistDto = response.body();
                    getMatchDto();





                } else
                {
                    Log.d("callback", "onResponse: RESPONSE IS NULL2");
                    Toast.makeText(MainActivity.this, "response is null2", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<MatchlistDto> call, Throwable t) {

            }
        });

    }
    public void getMatchDto(){
        HashMap<String, Long> queryParams = new HashMap<>();
        long matchId=matchId1;
        queryParams.put("matchId", matchId);
        //queryParams.put("user[name]",etUserName.getText().toString());
        Log.d("matchId1",matchId+"");
        Log.d("matchDto api", ""+apiService.getMatchDto(matchId));
        Call<MatchDto> call = apiService.getMatchDto(matchId);

        call.enqueue(new Callback<MatchDto>() {
            @Override
            public void onResponse(Call<MatchDto> call, Response<MatchDto> response) {
                if (response.body() != null) {
                    championId1OfMatch1 =response.body().getParticipants().get(0).getChampionId();
                    championId2OfMatch1 =response.body().getParticipants().get(1).getChampionId();
                    championId3OfMatch1 =response.body().getParticipants().get(2).getChampionId();
                    championId4OfMatch1 =response.body().getParticipants().get(3).getChampionId();
                    championId5OfMatch1 =response.body().getParticipants().get(4).getChampionId();
                    championId6OfMatch1 =response.body().getParticipants().get(5).getChampionId();
                    championId7OfMatch1 =response.body().getParticipants().get(6).getChampionId();
                    championId8OfMatch1 =response.body().getParticipants().get(7).getChampionId();
                    championId9OfMatch1 =response.body().getParticipants().get(8).getChampionId();
                    championId10OfMatch1 =response.body().getParticipants().get(9).getChampionId();

                    matchDto1=response.body();
                    //this only gets the first one of the list

                } else
                {
                    Log.d("callback", "onResponse: RESPONSE IS NULL");
                    Toast.makeText(MainActivity.this, "response is null", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<MatchDto> call, Throwable t) {

            }
        });

    }
    public void getLeaguePositionDto(){
        HashMap<String, Long> queryParams = new HashMap<>();
        queryParams.put("summonerId",summonerId);
        //queryParams.put("user[name]",etUserName.getText().toString());


        Call<Set<LeaguePositionDTO>> call = apiService.getLeaguePositionDTO(summonerId);
        call.enqueue(new Callback<Set<LeaguePositionDTO>>() {
            @Override
            public void onResponse(Call<Set<LeaguePositionDTO>> call, Response<Set<LeaguePositionDTO>> response) {
                if (response != null) {
                    Set<LeaguePositionDTO> leaguePositionDTOSet = response.body();
                    Iterator<LeaguePositionDTO> iterator=leaguePositionDTOSet.iterator();
                    LeaguePositionDTO flex = iterator.next();
                    Log.d("flex", flex.getQueueType());
                    LeaguePositionDTO solo = iterator.next();
                    Log.d("solo", solo.getQueueType());
                    Log.d("leagueid", flex.getLeagueId());
                    Log.d("queueType", flex.getQueueType());

                    rankFlex =flex.getRank().toString();
                    tierFlex =flex.getTier().toString();
                    leagueNameFlex =flex.getLeagueName();
                    lossesFlex =flex.getLosses();
                    winsFlex =flex.getWins();
                    leaguePointsFlex =flex.getLeaguePoints();
                    queueTypeFlex=flex.getQueueType();
                    //
                    rankSolo =solo.getRank().toString();
                    tierSolo =solo.getTier().toString();
                    leagueNameSolo =solo.getLeagueName();
                    lossesSolo =solo.getLosses();
                    winsSolo =solo.getWins();
                    leaguePointsSolo =solo.getLeaguePoints();
                    queueTypeSolo=solo.getQueueType();
                    //
                    longsFlex [0]=summonerLevel;
                    stringsFlex.add(summonerName);
                    stringsFlex.add(rankFlex);
                    stringsFlex.add(tierFlex);
                    stringsFlex.add(leagueNameFlex);
                    stringsFlex.add(queueTypeFlex);
                    integersFlex.add(winsFlex);
                    integersFlex.add(lossesFlex);
                    integersFlex.add(leaguePointsFlex);
                    //
                    longsSolo [0]=summonerLevel;
                    stringsSolo.add(summonerName);
                    stringsSolo.add(rankSolo);
                    stringsSolo.add(tierSolo);
                    stringsSolo.add(leagueNameSolo);
                    stringsSolo.add(queueTypeSolo);
                    integersSolo.add(winsSolo);
                    integersSolo.add(lossesSolo);
                    integersSolo.add(leaguePointsSolo);
                    Intent intent = new Intent(MainActivity.this, MainActivityTwo.class);

                    intent.putExtra("passing intent longsFlex",  longsFlex);
                    intent.putExtra("passing intent stringsFlex", stringsFlex);
                    intent.putExtra("passing intent integersFlex", integersFlex);
                    intent.putExtra("passing intent longsSolo",  longsSolo);
                    intent.putExtra("passing intent stringsSolo", stringsSolo);
                    intent.putExtra("passing intent integersSolo", integersSolo);
                    intent.putExtra("passing intent championPoints", championPoints);
                    intent.putExtra("passing intent championId", championId);
                    intent.putExtra("passing intent championLevel", championLevel);
                    startActivity(intent);

                    //Log.d("callback", "onResponse: " + response.body().toString());


                    // Toast.makeText(MainActivity.this, ""+response.body().getaccountId(), Toast.LENGTH_SHORT).show();
                    //Log.d("", "onResponse: "+response.body().toString());
                } else
                {
                    Log.d("callback", "onResponse: RESPONSE IS NULL");
                    Toast.makeText(MainActivity.this, "response is null", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onFailure(Call<Set<LeaguePositionDTO>> call, Throwable t) {
            }
        });
    }
}








