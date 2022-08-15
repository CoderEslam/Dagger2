package com.doubleclick.dagger2;

import javax.inject.Inject;

/**
 * Created By Eslam Ghazy on 8/15/2022
 */
public class Farm {
    @Inject
    public Farm() {
    }

    public String getBeans() {
        return "beans";
    }
}
