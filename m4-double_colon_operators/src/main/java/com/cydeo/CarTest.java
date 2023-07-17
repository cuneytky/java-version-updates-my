package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        //Zero Argument Constructor
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel()); // default "0" cktı bu gelir

        Supplier<Car> c2 = Car :: new;
        System.out.println(c2.get().getModel());

        //One Argument Constructor
        Function<Integer,Car> f1 = model -> new Car(model);
        Function<Integer,Car> f2 = Car::new;

        //Two Argument Constructor
        BiFunction<String,Integer,Car> a1 = Car :: new;
        Car honda = a1.apply("Honda",2015);
        System.out.println(honda.getMake() + " " + honda.getModel());

        /*
        interview Question:
        what is the difference constructor and method name?
        constructor is class name. call new keyword.
        method is a method name. call method name.
         */






    }
}