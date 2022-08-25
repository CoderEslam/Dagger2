package com.doubleclick.dagger2;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created By Eslam Ghazy on 8/15/2022
 */
@Component(modules = CoffeeModule.class)
public interface CoffeeComponent {

    Coffee getCoffee();

    void injectActivity(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder sugar(@Sugar int sugar);

        @BindsInstance
        Builder milk(@Milk int milk);

        CoffeeComponent build();

    }
}
