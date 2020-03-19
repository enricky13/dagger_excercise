package com.example.dagger_sample_project;

import android.util.Log;

public class Tires {
    //Imagine this is a third party library, can't edit
    private static final String TAG = "Car";

    public void inflate(){
        Log.d(TAG, "inflate: Tires inflated");
    }
}
