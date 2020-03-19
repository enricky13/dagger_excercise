package com.example.dagger_sample_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger_sample_project.Car.Car;
import com.example.dagger_sample_project.Car.Remote;
import com.example.dagger_sample_project.Car.Wheels;
import com.example.dagger_sample_project.Dagger.CarComponent;
import com.example.dagger_sample_project.Dagger.DaggerCarComponent;
import com.example.dagger_sample_project.Dagger.DieselEngineModule;

import javax.inject.Inject;

/**
 * Dagger{NameComponent} .create() is used if the modules don't require any arguments
 * .builder() is used if arguments are needed instead
 */

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

        CarComponent carComponent = DaggerCarComponent.builder()
                .horsePower(100)
                .build();
        //Injects main activity to dagger's CarComponent interface, and fills every annotated @Inject field with the proper
        carComponent.inject(this);
        car.drive();
        wheels.readyToGo();
        }
}
