package com.doubleclick.dagger2;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created By Eslam Ghazy on 8/15/2022
 */
/*
 * this class for view only now ....
 * */
public class River {
    private static final String TAG = "River";
//    @Inject

    public River() {
        Log.e(TAG, "River: ");
    }

    public String getWater() {
        return "water";
    }
}
