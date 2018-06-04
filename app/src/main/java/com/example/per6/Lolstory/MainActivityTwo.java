package com.example.per6.Lolstory;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
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

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityTwo extends AppCompatActivity{
    private TextView tierRankTextFlex,summonerNameText,levelText, tierRankTextSolo, leaguePointsTextSolo, leaguePointsTextFlex,
            winsAndLossesSoloText, winsAndLossesFlexText;
    private ImageView rankIconImageSolo, rankIconImageFlex, rankBorder, rankBanner, profileIcon, jhinImage;
    private String gameTypeMain;
    private String summonerName;
    Button buttonToHistory;
    EditText summonerNameInput;
    long [] gameIdArray = new long[10];
    private long  summonerLevel;
    private String rankFlex,rankSolo, tierFlex,tierSolo, leagueNameFlex,leagueNameSolo, getSummonerName,
            tierRankFlex, tierRankSolo, queueTypeFlex, queueTypeSolo,winsAndLossesSolo, winsAndLossesFlex;//use substring to get places of string
    private int winsFlex, lossesFlex, leaguePointsFlex, winsSolo, lossesSolo, leaguePointsSolo;
    private long[] longsFlex =new long[30];
    private long[] longsSolo = new long[30];
    private ArrayList<String> stringsFlex, stringsSolo;
    private ArrayList<Integer> integersFlex, integersSolo, championLevel, championPoints;
    private long[] championId = new long[10];




    @SuppressLint("MissingSuperCall")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main_two);
        wireWidgets();
        championLevel=getIntent().getIntegerArrayListExtra("passing intent championLevel");
        championPoints=getIntent().getIntegerArrayListExtra("passing intent championPoints");
        championId=getIntent().getLongArrayExtra("passing intent championId");
        longsSolo=getIntent().getLongArrayExtra("passing intent longsSolo");
        longsFlex =getIntent().getLongArrayExtra("passing intent longsFlex");
        summonerLevel= longsFlex[0];
        stringsFlex =getIntent().getStringArrayListExtra("passing intent stringsFlex");
        summonerName= stringsFlex.get(0);
        Toast.makeText(this, summonerName, Toast.LENGTH_SHORT).show();
        Log.d("from intent", summonerName);
        rankFlex = stringsFlex.get(1);
        tierFlex = stringsFlex.get(2);
        tierRankFlex = tierFlex +" "+ rankFlex;
        leagueNameFlex = stringsFlex.get(3);
        queueTypeFlex = stringsFlex.get(4);
        stringsSolo=getIntent().getStringArrayListExtra("passing intent stringsSolo");
        rankSolo=stringsSolo.get(1);
        tierSolo=stringsSolo.get(2);
        tierRankSolo=tierSolo+ " "+ rankSolo;
        leagueNameSolo=stringsSolo.get(3);
        queueTypeSolo=stringsSolo.get(4);
        integersFlex =getIntent().getIntegerArrayListExtra("passing intent integersFlex");
        winsFlex = integersFlex.get(0);
        lossesFlex = integersFlex.get(1);
        winsAndLossesFlex=winsFlex+"W/"+lossesFlex+"L";
        leaguePointsFlex = integersFlex.get(2);
        integersSolo=getIntent().getIntegerArrayListExtra("passing intent integersSolo");
        winsSolo=integersSolo.get(0);
        lossesSolo=integersSolo.get(1);
        winsAndLossesSolo=winsSolo+"W/"+lossesSolo+"L";
        leaguePointsSolo=integersSolo.get(2);

        assgin();

        //getMatchDto();
    }

    private void getSoloTierImage() {//mjst change to solo
        if (tierRankSolo.substring(0,6).equals("SILVER")){
            rankIconImageSolo.setImageResource(R.drawable.silver);
            rankBorder.setImageResource(R.drawable.silverborder);
            rankBanner.setImageResource(R.drawable.silverbanner);
            profileIcon.setImageResource(R.drawable.silvericon);
        }else if (tierRankSolo.substring(0,6).equals("BRONZE")){
            rankIconImageSolo.setImageResource(R.drawable.bronze);
            rankBorder.setImageResource(R.drawable.bronzeborder);
            //rankBanner.setImageResource(R.drawable.bronzebanner);
            profileIcon.setImageResource(R.drawable.bronzeicon);
        }else if (tierRankSolo.substring(0,4).equals("GOLD")){
            rankIconImageSolo.setImageResource(R.drawable.gold);
            rankBorder.setImageResource(R.drawable.goldborder);
            rankBanner.setImageResource(R.drawable.goldbanner);
            profileIcon.setImageResource(R.drawable.goldicon);
        }else if (tierRankSolo.substring(0,8).equals("PLATINUM")){
            rankIconImageSolo.setImageResource(R.drawable.platinum);
            rankBorder.setImageResource(R.drawable.platinumborder);
            rankBanner.setImageResource(R.drawable.platinumbanner);
            profileIcon.setImageResource(R.drawable.platicon);
        }else if (tierRankSolo.substring(0,7).equals("DIAMOND")){
            rankIconImageSolo.setImageResource(R.drawable.diamond);
            rankBorder.setImageResource(R.drawable.diamondborder);
            rankBanner.setImageResource(R.drawable.diamondbanner);
            profileIcon.setImageResource(R.drawable.diamondicon);
        }else if (tierRankSolo.substring(0,6).equals("MASTER")){
            rankIconImageSolo.setImageResource(R.drawable.master);
            rankBorder.setImageResource(R.drawable.masterborder);
            rankBanner.setImageResource(R.drawable.masterbanner);
            profileIcon.setImageResource(R.drawable.mastericon);
        }else if (tierRankSolo.length()>10&& tierRankSolo.substring(0,10).equals("CHALLENGER")){
            rankIconImageSolo.setImageResource(R.drawable.challenger);
            rankBorder.setImageResource(R.drawable.challengerborder);
            rankBanner.setImageResource(R.drawable.challengerbanner);
            profileIcon.setImageResource(R.drawable.challengericon);
        }
    }

    private void getFlexTierImage() {
        if (tierRankFlex.substring(0,6).equals("SILVER")){
            rankIconImageFlex.setImageResource(R.drawable.silver);
        }else if (tierRankFlex.substring(0,6).equals("BRONZE")){
            rankIconImageFlex.setImageResource(R.drawable.bronze);
        }else if (tierRankFlex.substring(0,4).equals("GOLD")){
            rankIconImageFlex.setImageResource(R.drawable.gold);
        }else if (tierRankFlex.substring(0,8).equals("PLATINUM")){
            rankIconImageFlex.setImageResource(R.drawable.platinum);
        }else if (tierRankFlex.substring(0,7).equals("DIAMOND")){
            rankIconImageFlex.setImageResource(R.drawable.diamond);
        }else if (tierRankFlex.substring(0,6).equals("MASTER")){
            rankIconImageFlex.setImageResource(R.drawable.master);
        }else if (tierRankFlex.length()>10&&tierRankFlex.substring(0,10).equals("CHALLENGER")){
            rankIconImageFlex.setImageResource(R.drawable.challenger);
        }

    }

    private void assgin() {
        summonerNameText.setText(summonerName.toString());
        levelText.setText("Level "+summonerLevel);
        tierRankTextFlex.setText(tierRankFlex);
        tierRankTextSolo.setText(tierRankSolo);
        leaguePointsTextFlex.setText(leaguePointsFlex+" LP");
        leaguePointsTextSolo.setText(leaguePointsSolo+" LP");
        winsAndLossesSoloText.setText(winsAndLossesSolo);
        winsAndLossesFlexText.setText(winsAndLossesFlex);
        getFlexTierImage();
        getSoloTierImage();
    }

    private void wireWidgets() {
        summonerNameText = (TextView) findViewById(R.id.summonername);
        levelText = (TextView) findViewById(R.id.level);
        tierRankTextFlex = (TextView) findViewById(R.id.tierrankFlex);
        tierRankTextSolo = (TextView) findViewById(R.id.tierrankSolo);
        leaguePointsTextSolo = (TextView) findViewById(R.id.leaguepointsSolo);
        leaguePointsTextFlex = (TextView) findViewById(R.id.leaguepointsFlex);
        rankIconImageSolo = (ImageView) findViewById(R.id.rankIconSolo);
        rankIconImageFlex = (ImageView) findViewById(R.id.rankiconFlex);
        winsAndLossesFlexText=(TextView) findViewById(R.id.winsAndLossesFlex);
        winsAndLossesSoloText=(TextView) findViewById(R.id.winsAndLossesSolo);



        rankBanner=(ImageView) findViewById(R.id.rankBanner);
        rankBorder=(ImageView) findViewById(R.id.rankborder);
        profileIcon=(ImageView) findViewById(R.id.profileicon);

        buttonToHistory = (Button)findViewById(R.id.buttonToHistory);
        buttonToHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityTwo.this, MainThreeActivity.class);
                intent.putExtra("championId", championId);
                intent.putExtra("championPoints", championPoints);
                intent.putExtra("championLevel", championLevel);
                intent.putExtra("tier", tierRankSolo);
                startActivity(intent);
            }
        });
    }
}


