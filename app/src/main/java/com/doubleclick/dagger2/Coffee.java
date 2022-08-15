package com.doubleclick.dagger2;

import javax.inject.Inject;

/**
 * Created By Eslam Ghazy on 8/15/2022
 */
public class Coffee {

    // dagger not support privet field
    @Inject
    /*private*/ Farm farm;
    @Inject
    /*private*/ River river;


  /*  @Inject
    // method -> constractur injection
    public Coffee(Farm farm, River river) {
        this.farm = farm;
        this.river = river;
    }*/

    @Inject
    public Coffee() {
        this.farm = farm;
        this.river = river;
    }

    public String getCoffeeCup() {
        return farm.getBeans() + "+" + river.getWater();
    }

}
