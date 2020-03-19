package com.example.dagger_sample_project.Car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Since you are passing a horsePower variable at runtime, you can't use dagger since you don't know it ahead of time and
 * cant put the @Inject annotation
 */
public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;

    @Inject
    public DieselEngine(int horsePower){
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel Engine started, horsePower: "+ horsePower);
    }
}
