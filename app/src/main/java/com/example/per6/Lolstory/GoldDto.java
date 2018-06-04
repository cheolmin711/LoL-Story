package com.example.per6.Lolstory;

/**
 * Created by per6 on 3/27/18.
 */

public class GoldDto {

    //LOL STATIC DATA

    private int sell, total, base;
    private boolean purchaseable;

    public int getSell() {
        return sell;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public boolean isPurchaseable() {
        return purchaseable;
    }

    public void setPurchaseable(boolean purchaseable) {
        this.purchaseable = purchaseable;
    }
}
