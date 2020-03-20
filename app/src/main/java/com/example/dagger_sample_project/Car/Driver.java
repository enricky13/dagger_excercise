package com.example.dagger_sample_project.Car;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * When annotating with the singleton annotation it informs the injector (Car component that this is a singleton class)
 * Component class must also have the singleton annotation if it using a singleton class
 */
@Singleton
public class Driver {
    @Inject
    public Driver(){}

}
