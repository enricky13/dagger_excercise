package com.example.dagger_sample_project;

import dagger.Binds;
import dagger.Module;

/**
 * Look up abstract class, but able to use this in the component to make the diesel engine if you are using interfaces
 */

@Module
public abstract class DieselEngineModule {
    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
