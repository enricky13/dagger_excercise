package com.example.dagger_sample_project;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    DieselEngine(){}

    @Override
    public void start() {
        Log.d(TAG, "Diesel Engine started");
    }
}
