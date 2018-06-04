package com.example.per6.Lolstory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainThreeActivity extends AppCompatActivity {
    private ArrayList<Integer> championPoints, championLevel;
    private int championLevel1,championLevel2,championLevel3;
    private long[]championId=new long[10];
    private String championPointString1,championPointString2,championPointString3,championPointString4,championPointString5,
            championPointString6, tierRankSolo;
    private ImageView champion1,champion2,champion3,champion4,champion5,champion6,
            masteryborder1, masteryborder2, masteryborder3, rankBorder2;
    private TextView championName4, championName5, championName6,
            championPoints1, championPoints2, championPoints3, championPoints4, championPoints5, championPoints6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main_three);
        wireWidgets();
        tierRankSolo=getIntent().getStringExtra("tier");
        setTierBanner();
        championId=getIntent().getLongArrayExtra("championId");
        championPoints=getIntent().getIntegerArrayListExtra("championPoints");
        championPointString1=championPoints.get(0)+" points";
        championPointString2=championPoints.get(1)+" points";
        championPointString3=championPoints.get(2)+" points";
        championPointString4=championPoints.get(3)+" points";
        championPointString5=championPoints.get(4)+" points";
        championPointString6=championPoints.get(5)+" points";

        championLevel=getIntent().getIntegerArrayListExtra("championLevel");
        championLevel1=championLevel.get(0);
        championLevel2=championLevel.get(1);
        championLevel3=championLevel.get(2);
        wireWidgets();
    }

    private void setTierBanner() {
        if (tierRankSolo.substring(0,6).equals("SILVER")){
            rankBorder2.setImageResource(R.drawable.silverborder);
//        }else if (tierRankSolo.substring(0,6).equals("BRONZE")){
//            rankBorder2.setImageResource(R.drawable.bronzebanner);
        }else if (tierRankSolo.substring(0,4).equals("GOLD")){
            rankBorder2.setImageResource(R.drawable.goldborder);
        }else if (tierRankSolo.substring(0,8).equals("PLATINUM")){
            rankBorder2.setImageResource(R.drawable.platinumborder);
        }else if (tierRankSolo.substring(0,7).equals("DIAMOND")){
            rankBorder2.setImageResource(R.drawable.diamondborder);
        }else if (tierRankSolo.substring(0,6).equals("MASTER")){
            rankBorder2.setImageResource(R.drawable.masterborder);
        }else if (tierRankSolo.length()>10&&tierRankSolo.substring(0,10).equals("CHALLENGER")){
            rankBorder2.setImageResource(R.drawable.challengerborder);
        }
    }

    private void wireWidgets() {
        rankBorder2 = (ImageView) findViewById(R.id.rankborder2);

        championPoints1 = (TextView) findViewById(R.id.championpoint1);
        championPoints2 = (TextView) findViewById(R.id.championpoint2);
        championPoints3 = (TextView) findViewById(R.id.championpoint3);
        championPoints4 = (TextView) findViewById(R.id.championpoint4);
        championPoints5 = (TextView) findViewById(R.id.championpoint5);
        championPoints6 = (TextView) findViewById(R.id.championpoint6);

        championPoints1.setText(championPointString1);
        championPoints2.setText(championPointString2);
        championPoints3.setText(championPointString3);
        championPoints4.setText(championPointString4);
        championPoints5.setText(championPointString5);
        championPoints6.setText(championPointString6);

        championName4 =(TextView) findViewById(R.id.championname1);
        championName5 =(TextView) findViewById(R.id.championname2);
        championName6 =(TextView) findViewById(R.id.championname3);

        decideChampionName(championId[3],championName4);
        decideChampionName(championId[4],championName5);
        decideChampionName(championId[5],championName6);

        masteryborder1 = (ImageView) findViewById(R.id.masteryborder1);
        masteryborder2 = (ImageView) findViewById(R.id.masteryborder2);
        masteryborder3 = (ImageView) findViewById(R.id.masteryborder3);

        decideMasteryBorder(championLevel1, masteryborder1);////problem
        decideMasteryBorder(championLevel2, masteryborder2);
        decideMasteryBorder(championLevel3, masteryborder3);

        champion1 = (ImageView) findViewById(R.id.champion1);
        champion2= (ImageView) findViewById(R.id.champion2);
        champion3 = (ImageView) findViewById(R.id.champion3);
        champion4 = (ImageView) findViewById(R.id.champion4);
        champion5 = (ImageView) findViewById(R.id.champion5);
        champion6 = (ImageView) findViewById(R.id.champion6);

        decideChampionImage(championId[0],champion1);
        decideChampionImage(championId[1],champion2);
        decideChampionImage(championId[2],champion3);
        decideChampionImage(championId[3],champion4);
        decideChampionImage(championId[4],champion5);
        decideChampionImage(championId[5],champion6);
//        decideChampionImage(championId[6],champion7);
//        decideChampionImage(championId[7],champion8);
    }

    private void decideChampionName(long id, TextView textView) {
        if (id==37){textView.setText("Sona");}
        else if (id==24){textView.setText("Jax");}//for jax
        else if (id==18){textView.setText("Tristana");}
        else if (id==110){textView.setText("Varus");}
        else if (id==145){textView.setText("Kaisa");}
        else if (id==114){textView.setText("Fiora");}
        else if (id==27){textView.setText("Singed");}
        else if (id==223){textView.setText("Tahm Kench");}
        else if (id==7){textView.setText("Leblanc");}
        else if (id==412){textView.setText("Thresh");}
        else if (id==43){textView.setText("Karma");}
        else if (id==202){textView.setText("Jhin");}
        else if (id==68){textView.setText("Rumble");}
        else if (id==77){textView.setText("Udyr");}
        else if (id==83){textView.setText("Yorick");}
        else if (id==516){textView.setText("Ornn");}
        else if (id==141){textView.setText("Kayn");}
        else if (id==38){textView.setText("Kassadin");}
        else if (id==15){textView.setText("Sivir");}
        else if (id==21){textView.setText("Miss Fortune");}
        else if (id==119){textView.setText("Draven");}
        else if (id==157){textView.setText("Yasuo");}
        else if (id==10){textView.setText("Kayle");}
        else if (id==35){textView.setText("Shaco");}
        else if (id==58){textView.setText("Renekton");}
        else if (id==120){textView.setText("Hecarim");}
        else if (id==105){textView.setText("Fizz");}
        else if (id==96){textView.setText("Kog’Maw");}
        else if (id==57){textView.setText("Maokai");}
        else if (id==127){textView.setText("Lissandra");}
        else if (id==222){textView.setText("Jinx");}
        else if (id==6){textView.setText("Urgot");}
        else if (id==9){textView.setText("Fiddlesticks");}
        else if (id==3){textView.setText("Galio");}
        else if (id==80){textView.setText("Pantheon");}
        else if (id==91){textView.setText("Talon");}
        else if (id==41){textView.setText("Gangplank");}
        else if (id==81){textView.setText("Ezreal");}
        else if (id==150){textView.setText("Gnar");}
        else if (id==17){textView.setText("Teemo");}
        else if (id==1){textView.setText("Annie");}
        else if (id==82){textView.setText("Mordekaiser");}
        else if (id==268){textView.setText("Azir");}
        else if (id==85){textView.setText("Kennen");}
        else if (id==67){textView.setText("Vayne");}
        else if (id==63){textView.setText("Brand");}
        else if (id==104){textView.setText("Graves");}
        else if (id==16){textView.setText("Soraka");}
        else if (id==498){textView.setText("Xayah");}
        else if (id==30){textView.setText("Karthus");}
        else if (id==8){textView.setText("Vladimir");}
        else if (id==26){textView.setText("Zilean");}
        else if (id==142){textView.setText("Zoe");}//for zoe
        else if (id==55){textView.setText("Katarina");}
        else if (id==102){textView.setText("Shyvana");}
        else if (id==19){textView.setText("Warwick");}
        else if (id==115){textView.setText("Ziggs");}
        else if (id==240){textView.setText("Kled");}
        else if (id==121){textView.setText("Kha’Zix");}
        else if (id==2){textView.setText("Olaf");}
        else if (id==4){textView.setText("Twisted Fate");}
        else if (id==20){textView.setText("Nunu");}
        else if (id==107){textView.setText("Rengar");}
        else if (id==432){textView.setText("Bard");}
        else if (id==39){textView.setText("Irelia");}
        else if (id==427){textView.setText("Ivern");}
        else if (id==62){textView.setText("Wukong");}
        else if (id==22){textView.setText("Ashe");}
        else if (id==429){textView.setText("Kalista");}
        else if (id==84){textView.setText("Akali");}
        else if (id==254){textView.setText("Vi");}
        else if (id==32){textView.setText("Amumu");}
        else if (id==117){textView.setText("Lulu");}
        else if (id==25){textView.setText("Morgana");}
        else if (id==56){textView.setText("Nocturne");}
        else if (id==131){textView.setText("Diana");}
        else if (id==136){textView.setText("Aurelion Sol");}
        else if (id==143){textView.setText("Zyra");}
        else if (id==112){textView.setText("Viktor");}
        else if (id==69){textView.setText("Cassiopeia");}
        else if (id==75){textView.setText("Nasus");}
        else if (id==29){textView.setText("Twitch");}
        else if (id==36){textView.setText("Dr.Mundo");}
        else if (id==61){textView.setText("Orianna");}
        else if (id==28){textView.setText("Evelynn");}
        else if (id==421){textView.setText("Rek’sai");}
        else if (id==99){textView.setText("Lux");}
        else if (id==92){textView.setText("Riven");}
        else if (id==31){textView.setText("Cho’Gath");}
        else if (id==266){textView.setText("Aatrox");}
        else if (id==78){textView.setText("Poppy");}
        else if (id==163){textView.setText("Taliyah");}
        else if (id==420){textView.setText("Illaoi");}
        else if (id==555){textView.setText("Pyke");}
        else if (id==74){textView.setText("Heimerdinger");}
        else if (id==12){textView.setText("Alistar");}
        else if (id==5){textView.setText("Xin Zhao");}
        else if (id==236){textView.setText("Lucian");}
        else if (id==106){textView.setText("Volibear");}
        else if (id==113){textView.setText("Sejuani");}
        else if (id==76){textView.setText("Nidalee");}
        else if (id==86){textView.setText("Garen");}
        else if (id==89){textView.setText("Leona");}
        else if (id==238){textView.setText("Zed");}
        else if (id==53){textView.setText("Blitzcrank");}
        else if (id==33){textView.setText("Rammus");}
        else if (id==161){textView.setText("Velkoz");}
        else if (id==51){textView.setText("Caitlyn");}
        else if (id==48){textView.setText("Trundle");}
        else if (id==203){textView.setText("Kindred");}
        else if (id==133){textView.setText("Quinn");}
        else if (id==245){textView.setText("Ekko");}
        else if (id==267){textView.setText("Nami");}
        else if (id==50){textView.setText("Swain");}
        else if (id==44){textView.setText("Taric");}
        else if (id==134){textView.setText("Syndra");}
        else if (id==497){textView.setText("Rakan");}
        else if (id==72){textView.setText("Skarner");}
        else if (id==201){textView.setText("Braum");}
        else if (id==45){textView.setText("Veigar");}
        else if (id==101){textView.setText("Xerath");}
        else if (id==42){textView.setText("Corki");}
        else if (id==111){textView.setText("Nautilus");}
        else if (id==103){textView.setText("Ahri");}
        else if (id==126){textView.setText("Jayce");}
        else if (id==122){textView.setText("Darius");}
        else if (id==23){textView.setText("Tryndamere");}
        else if (id==40){textView.setText("Janna");}
        else if (id==60){textView.setText("Elise");}
        else if (id==14){textView.setText("Sion");}
        else if (id==164){textView.setText("Camille");}
        else if (id==11){textView.setText("Master yi");}
        else if (id==13){textView.setText("Ryze");}
        else if (id==54){textView.setText("Malphite");}
        else if (id==34){textView.setText("Anivia");}
        else if (id==98){textView.setText("Shen");}
        else if (id==59){textView.setText("Jarvan IV");}
        else if (id==90){textView.setText("Malzahar");}
        else if (id==154){textView.setText("Zac");}
        else if (id==79){textView.setText("Gragas");}



        }

    private void decideMasteryBorder(int level, ImageView imageView) {
        if(level==7){imageView.setImageResource(R.drawable.masterylevelsevenborder);}
        else if(level==6){imageView.setImageResource(R.drawable.masterylevelsixborder);}
        else if(level==5){imageView.setImageResource(R.drawable.masterylevelfiveborder);}
        else if(level==4){imageView.setImageResource(R.drawable.masterylevelfourborder);}
    }

    public void decideChampionImage(long id, ImageView imageView){
        if (id==37){imageView.setImageResource(R.drawable.sonasquare);}
        else if (id==24){imageView.setImageResource(R.drawable.jaxsquare);}//for jax
        else if (id==18){imageView.setImageResource(R.drawable.tristanasquare);}
        else if (id==110){imageView.setImageResource(R.drawable.varussquare);}
        else if (id==145){imageView.setImageResource(R.drawable.kaisasquare);}
        else if (id==114){imageView.setImageResource(R.drawable.fiorasquare);}
        else if (id==27){imageView.setImageResource(R.drawable.singedsquare);}
        else if (id==223){imageView.setImageResource(R.drawable.tahmkenchsquare);}
        else if (id==7){imageView.setImageResource(R.drawable.leblancsquare);}
        else if (id==412){imageView.setImageResource(R.drawable.threshsquare);}
        else if (id==43){imageView.setImageResource(R.drawable.karmasquare);}
        else if (id==202){imageView.setImageResource(R.drawable.jhinsquare);}
        else if (id==68){imageView.setImageResource(R.drawable.rumblesquare);}
        else if (id==77){imageView.setImageResource(R.drawable.udyrsquare);}
        else if (id==83){imageView.setImageResource(R.drawable.yoricksquare);}
        else if (id==516){imageView.setImageResource(R.drawable.ornnsquare);}
        else if (id==141){imageView.setImageResource(R.drawable.kaynsquare);}
        else if (id==38){imageView.setImageResource(R.drawable.kassadinsquare);}
        else if (id==15){imageView.setImageResource(R.drawable.sivirsquare);}
        else if (id==21){imageView.setImageResource(R.drawable.missfortunesquare);}
        else if (id==119){imageView.setImageResource(R.drawable.dravensquare);}
        else if (id==157){imageView.setImageResource(R.drawable.yasuosquare);}
        else if (id==10){imageView.setImageResource(R.drawable.kaylesquare);}
        else if (id==35){imageView.setImageResource(R.drawable.shacosquare);}
        else if (id==58){imageView.setImageResource(R.drawable.renektonsquare);}
        else if (id==120){imageView.setImageResource(R.drawable.hecarimsquare);}
        else if (id==105){imageView.setImageResource(R.drawable.fizzsquare);}
        else if (id==96){imageView.setImageResource(R.drawable.kogmawsquare);}
        else if (id==57){imageView.setImageResource(R.drawable.maokaisquare);}
        else if (id==127){imageView.setImageResource(R.drawable.lissandrasquare);}
        else if (id==222){imageView.setImageResource(R.drawable.jinxsquare);}
        else if (id==6){imageView.setImageResource(R.drawable.urgotsquare);}
        else if (id==9){imageView.setImageResource(R.drawable.fiddlestickssquare);}
        else if (id==3){imageView.setImageResource(R.drawable.galiosquare);}
        else if (id==80){imageView.setImageResource(R.drawable.pantheonsquare);}
        else if (id==91){imageView.setImageResource(R.drawable.talonsquare);}
        else if (id==41){imageView.setImageResource(R.drawable.gangplanksquare);}
        else if (id==81){imageView.setImageResource(R.drawable.ezrealsquare);}
        else if (id==150){imageView.setImageResource(R.drawable.gnarsquare);}
        else if (id==17){imageView.setImageResource(R.drawable.teemosquare);}
        else if (id==1){imageView.setImageResource(R.drawable.anniesquare);}
        else if (id==82){imageView.setImageResource(R.drawable.mordekaisersquare);}
        else if (id==268){imageView.setImageResource(R.drawable.azirsquare);}
        else if (id==85){imageView.setImageResource(R.drawable.kennensquare);}
        else if (id==67){imageView.setImageResource(R.drawable.vaynesquare);}
        else if (id==63){imageView.setImageResource(R.drawable.brandsquare);}
        else if (id==104){imageView.setImageResource(R.drawable.gravessquare);}
        else if (id==16){imageView.setImageResource(R.drawable.sorakasquare);}
        else if (id==498){imageView.setImageResource(R.drawable.xayahsquare);}
        else if (id==30){imageView.setImageResource(R.drawable.karthussquare);}
        else if (id==8){imageView.setImageResource(R.drawable.vladimirsquare);}
        else if (id==26){imageView.setImageResource(R.drawable.zileansquare);}
        else if (id==142){imageView.setImageResource(R.drawable.zoesquare);}//for zoe
        else if (id==55){imageView.setImageResource(R.drawable.katarinasquare);}
        else if (id==102){imageView.setImageResource(R.drawable.shyvanasquare);}
        else if (id==19){imageView.setImageResource(R.drawable.warwicksquare);}
        else if (id==115){imageView.setImageResource(R.drawable.ziggssquare);}
        else if (id==240){imageView.setImageResource(R.drawable.kledsquare);}
        else if (id==121){imageView.setImageResource(R.drawable.khazixsquare);}
        else if (id==2){imageView.setImageResource(R.drawable.olafsquare);}
        else if (id==4){imageView.setImageResource(R.drawable.twistedfatesquare);}
        else if (id==20){imageView.setImageResource(R.drawable.nunusquare);}
        else if (id==107){imageView.setImageResource(R.drawable.rengarsquare);}
        else if (id==432){imageView.setImageResource(R.drawable.bardsquare);}
        else if (id==39){imageView.setImageResource(R.drawable.ireliasquare);}
        else if (id==427){imageView.setImageResource(R.drawable.ivernsquare);}
        else if (id==62){imageView.setImageResource(R.drawable.wukongsquare);}
        else if (id==22){imageView.setImageResource(R.drawable.ashesquare);}
        else if (id==429){imageView.setImageResource(R.drawable.kalistasquare);}
        else if (id==84){imageView.setImageResource(R.drawable.akalisquare);}
        else if (id==254){imageView.setImageResource(R.drawable.visquare);}
        else if (id==32){imageView.setImageResource(R.drawable.amumusquare);}
        else if (id==117){imageView.setImageResource(R.drawable.lulusquare);}
        else if (id==25){imageView.setImageResource(R.drawable.morganasquare);}
        else if (id==56){imageView.setImageResource(R.drawable.nocturnesquare);}
        else if (id==131){imageView.setImageResource(R.drawable.dianasquare);}
        else if (id==136){imageView.setImageResource(R.drawable.aurelionsolsquare);}
        else if (id==143){imageView.setImageResource(R.drawable.zyrasquare);}
        else if (id==112){imageView.setImageResource(R.drawable.viktorsquare);}
        else if (id==69){imageView.setImageResource(R.drawable.cassiopeiasquare);}
        else if (id==75){imageView.setImageResource(R.drawable.nasussquare);}
        else if (id==29){imageView.setImageResource(R.drawable.twitchsquare);}
        else if (id==36){imageView.setImageResource(R.drawable.drmundosquare);}
        else if (id==61){imageView.setImageResource(R.drawable.oriannasquare);}
        else if (id==28){imageView.setImageResource(R.drawable.evelynnsquare);}
        else if (id==421){imageView.setImageResource(R.drawable.reksaisquare);}
        else if (id==99){imageView.setImageResource(R.drawable.luxsquare);}
        else if (id==92){imageView.setImageResource(R.drawable.rivensquare);}
        else if (id==31){imageView.setImageResource(R.drawable.chogathsquare);}
        else if (id==266){imageView.setImageResource(R.drawable.aatroxsquare);}
        else if (id==78){imageView.setImageResource(R.drawable.poppysquare);}
        else if (id==163){imageView.setImageResource(R.drawable.taliyahsquare);}
        else if (id==420){imageView.setImageResource(R.drawable.illaoisquare);}
        else if (id==555){imageView.setImageResource(R.drawable.pykesquare);}
        else if (id==74){imageView.setImageResource(R.drawable.heimerdingersquare);}
        else if (id==12){imageView.setImageResource(R.drawable.alistarsquare);}
        else if (id==5){imageView.setImageResource(R.drawable.xinzhaosquare);}
        else if (id==236){imageView.setImageResource(R.drawable.luciansquare);}
        else if (id==106){imageView.setImageResource(R.drawable.volibearsquare);}
        else if (id==113){imageView.setImageResource(R.drawable.sejuanisquare);}
        else if (id==76){imageView.setImageResource(R.drawable.nidaleesquare);}
        else if (id==86){imageView.setImageResource(R.drawable.garensquare);}
        else if (id==89){imageView.setImageResource(R.drawable.leonasquare);}
        else if (id==238){imageView.setImageResource(R.drawable.zedsquare);}
        else if (id==53){imageView.setImageResource(R.drawable.blitzcranksquare);}
        else if (id==33){imageView.setImageResource(R.drawable.rammussquare);}
        else if (id==161){imageView.setImageResource(R.drawable.velkozsquare);}
        else if (id==51){imageView.setImageResource(R.drawable.caitlynsquare);}
        else if (id==48){imageView.setImageResource(R.drawable.trundlesquare);}
        else if (id==203){imageView.setImageResource(R.drawable.kindredsquare);}
        else if (id==133){imageView.setImageResource(R.drawable.quinnsquare);}
        else if (id==245){imageView.setImageResource(R.drawable.ekkosquare);}
        else if (id==267){imageView.setImageResource(R.drawable.namisquare);}
        else if (id==50){imageView.setImageResource(R.drawable.swainsquare);}
        else if (id==44){imageView.setImageResource(R.drawable.taricsquare);}
        else if (id==134){imageView.setImageResource(R.drawable.syndrasquare);}
        else if (id==497){imageView.setImageResource(R.drawable.rakansquare);}
        else if (id==72){imageView.setImageResource(R.drawable.skarnersquare);}
        else if (id==201){imageView.setImageResource(R.drawable.braumsquare);}
        else if (id==45){imageView.setImageResource(R.drawable.veigarsquare);}
        else if (id==101){imageView.setImageResource(R.drawable.xerathsquare);}
        else if (id==42){imageView.setImageResource(R.drawable.corkisquare);}
        else if (id==111){imageView.setImageResource(R.drawable.nautilussquare);}
        else if (id==103){imageView.setImageResource(R.drawable.ahrisquare);}
        else if (id==126){imageView.setImageResource(R.drawable.jaycesquare);}
        else if (id==122){imageView.setImageResource(R.drawable.dariussquare);}
        else if (id==23){imageView.setImageResource(R.drawable.tryndameresquare);}
        else if (id==40){imageView.setImageResource(R.drawable.jannasquare);}
        else if (id==60){imageView.setImageResource(R.drawable.elisesquare);}
        else if (id==14){imageView.setImageResource(R.drawable.sionsquare);}
        else if (id==164){imageView.setImageResource(R.drawable.camillesquare);}
        else if (id==11){imageView.setImageResource(R.drawable.masteryisquare);}
        else if (id==13){imageView.setImageResource(R.drawable.ryzesquare);}
        else if (id==54){imageView.setImageResource(R.drawable.malphitesquare);}
        else if (id==34){imageView.setImageResource(R.drawable.aniviasquare);}
        else if (id==98){imageView.setImageResource(R.drawable.shensquare);}
        else if (id==59){imageView.setImageResource(R.drawable.jarvanivsquare);}
        else if (id==90){imageView.setImageResource(R.drawable.malzaharsquare);}
        else if (id==154){imageView.setImageResource(R.drawable.zacsquare);}
        else if (id==79){imageView.setImageResource(R.drawable.gragassquare);}
    }
}

