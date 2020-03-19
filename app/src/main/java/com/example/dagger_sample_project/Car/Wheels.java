package com.example.dagger_sample_project.Car;

import android.util.Log;

public class Wheels {
    private static final String TAG = "Car";
    //Imagine this is a third party library, can't edit
    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }

    public void readyToGo(){
        Log.d(TAG, "readyToGo: Car is ready to go");
    }
}
