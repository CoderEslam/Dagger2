package com.doubleclick.dagger2;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created By Eslam Ghazy on 8/15/2022
 */
public class Coffee {

    private static final String TAG = "Coffee";

    // dagger not support privet field
    @Inject
    /*private*/ Farm farm;
    @Inject
    /*private*/ River river;

    int suger;

    int milk;


  /*  @Inject
    // method -> constractur injection
    public Coffee(Farm farm, River river) {
        this.farm = farm;
        this.river = river;
    }*/

    @Inject
    public Coffee(@Sugar int suger, @Milk int milk) {
        this.suger = suger;
        this.milk = milk;
    }

    @Inject
    public void connectElectricity() {
        Log.d(TAG, "connectElectricity connecting...");
    }

    public String getCoffeeCup() {
        Log.d(TAG, "getCoffeeCup" + farm.getBeans() + "+" + river.getWater() + "+" + suger);
        return farm.getBeans() + "+" + river.getWater() + "+" + suger + "+" + milk;
    }

}
