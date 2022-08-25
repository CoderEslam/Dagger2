package com.doubleclick.dagger2;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created By Eslam Ghazy on 8/15/2022
 */
public class Farm {

    private static final String TAG = "Farm";

//    @Inject
    public Farm() {
        Log.e(TAG, "Farm: ");
    }

    public String getBeans() {
        return "beans";
    }
}
