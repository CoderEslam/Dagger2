package com.doubleclick.dagger2;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created By Eslam Ghazy on 8/25/2022
 */

@Module
public class CoffeeModule {

    @Provides
    River provideRiver() {
        return new River();
    }


    @Provides
    Farm provideFarm() {
        return new Farm();
    }


}
