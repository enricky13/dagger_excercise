package com.example.dagger_sample_project.Car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels){
        this.engine = engine;
        this.wheels = wheels;
    }

    /**
     * Method injection, since the @Inject annotation is here, after the Car object is made, it checks the fields and sees if it
     * needs creation then it goes into the method and if an object needs to be created then it will repeat the process,
     * then it will do the stuff inside the method.
     *
     */
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener();
    }

    public void drive(){
        Log.d(TAG, "driving...");
        engine.start();
    }
}
