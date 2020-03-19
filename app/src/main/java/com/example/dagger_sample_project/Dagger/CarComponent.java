package com.example.dagger_sample_project.Dagger;

import com.example.dagger_sample_project.Car.Car;
import com.example.dagger_sample_project.MainActivity;

import dagger.BindsInstance;
import dagger.Component;

// Must have the @Component annotation for dagger to be ready and construct objects
// When using modules, if an object depends on that module for its object creations then use the parenthese () along with which modul is used
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    //When you have a return type, it looks for @Inject annotiation for that type and follows the constructors way of making the object
    //If it contains objects, then those other objects must have their constructor with the @Inject annotation
    Car getCar();

    /**
     * If don't return anything and put in the argument and object, then it looks at the object for fields with the @Inject annotation
     * and creates objects without you needing to make them manually
     */
    void inject(MainActivity mainActivity);

    /**
     * You are now overriding the builder pattern / method from dagger and have to call even the build() method but just state the return
     */
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(int horsePower);

        CarComponent build();
    }
}
