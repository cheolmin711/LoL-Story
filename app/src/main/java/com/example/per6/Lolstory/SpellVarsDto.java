package com.example.per6.Lolstory;

import java.util.List;

/**
 * Created by per6 on 3/27/18.
 */

public class SpellVarsDto {
    private String ranksWith,dyn,link,key;
    private List<Double>coeff;

    public String getRanksWith() {
        return ranksWith;
    }

    public void setRanksWith(String ranksWith) {
        this.ranksWith = ranksWith;
    }

    public String getDyn() {
        return dyn;
    }

    public void setDyn(String dyn) {
        this.dyn = dyn;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<Double> getCoeff() {
        return coeff;
    }

    public void setCoeff(List<Double> coeff) {
        this.coeff = coeff;
    }
}
