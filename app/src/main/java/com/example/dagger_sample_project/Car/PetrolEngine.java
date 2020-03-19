package com.example.dagger_sample_project.Car;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;

    @Inject
    PetrolEngine(int horsePower){
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol Engine started, HorsePower: "+horsePower);
    }
}
