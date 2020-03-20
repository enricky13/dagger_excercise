package com.example.dagger_sample_project.Car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;
    private int engineCapacity;

    @Inject
    PetrolEngine(@Named("horsePower")int horsePower,
                 @Named("engineCapacity")int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol Engine started," +
                "\nHorsePower: " + horsePower +
                "\nEngineCapacity: " + engineCapacity);
    }
}
