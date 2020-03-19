package com.example.dagger_sample_project.Dagger;

import com.example.dagger_sample_project.Car.DieselEngine;
import com.example.dagger_sample_project.Car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Since when making the DieselEngine object there is a variable that is only included in runtime, you will need to
 * use Provides annotation and cannot make this abstract
 * <p>
 * Also if you wanna pass variables at runtime it needs to match the module as well so you can pass it on to the
 * method that is creating the object
 */

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    /**
     * For Dagger, whenever you call this method, it will provide you with an int. This can be a problem if this module uses more than
     * 1 int and wouldn't know which one to return.
     *
     */
    @Provides
    int provideHorsePower(){
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine) {
        return engine;
    }
}
