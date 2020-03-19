package com.example.dagger_sample_project.Dagger;

import com.example.dagger_sample_project.Car.Rims;
import com.example.dagger_sample_project.Car.Tires;
import com.example.dagger_sample_project.Car.Wheels;

import dagger.Module;
import dagger.Provides;

/**
 * If all fields are static, you should make the class abstract, no new instances need to be created during compile time
 */

@Module
public abstract class WheelsModule {

    /**
     * This creates a new Rim Object without the Rim constructor needing to be annoted, useful if you have no control over which
     * class is being created and how it is created
     *
     */
    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    /**
     * While creating the object, you can also trigger methods from the object on what to do if more setup is required.
     * If no instance dependancy is used, then make the fields static, adds control to your class
     *
     */

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    /**
     * Since Dagger knows how to create both rims and tires, it will use both those methods to create them when making
     * a new wheels object
     */

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims, tires);
    }
}
