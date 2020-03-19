package com.example.dagger_sample_project.Dagger;

import com.example.dagger_sample_project.Car.Engine;
import com.example.dagger_sample_project.Car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

/**
 * Look up abstract class, but able to use this in the component to make the diesel engine if you are using interfaces
 */

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
