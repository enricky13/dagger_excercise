package com.example.dagger_sample_project;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    PetrolEngine(){}

    @Override
    public void start() {
        Log.d(TAG, "Petrol Engine started");
    }
}
