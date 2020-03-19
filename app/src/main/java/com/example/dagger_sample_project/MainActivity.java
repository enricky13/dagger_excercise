package com.example.dagger_sample_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
   @Inject
   Car car;

   @Inject
   Remote remote;

   @Inject
   Wheels wheels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        //Injects main activity to dagger's CarComponent interface, and fills every annotated @Inject field with the proper
        carComponent.inject(this);
        car.drive();
        wheels.readyToGo();
        }
}
