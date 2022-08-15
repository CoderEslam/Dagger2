package com.doubleclick.dagger2;

import dagger.Component;

/**
 * Created By Eslam Ghazy on 8/15/2022
 */
@Component
public interface CoffeeComponent {

    Coffee getCoffee();

    void injectActivity(MainActivity mainActivity);

}
