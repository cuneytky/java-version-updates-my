package com.cydeo;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>200;
            }
        };

        System.out.println("************PREDICATE***************");
        Predicate<Integer> lesserThan =  i -> i<18;
        System.out.println(lesserThan.test(20));               // false

        System.out.println("************CONSUMER***************");
        Consumer<Integer> display = i -> System.out.println(i);   // 10
        display.accept(10);

        System.out.println("************BI CONSUMER***************");
        BiConsumer<Integer,Integer> addTwo = (x,y) -> System.out.println(x+y); // 3
        addTwo.accept(1,2);

        System.out.println("************FUNCTION***************");
        Function<String,String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Cydeo"));         //Hello Cydeo

        System.out.println("************BI FUNCTION***************");
        BiFunction<Integer,Integer,Integer> func = (x1,x2) -> x1+x2;
        System.out.println(func.apply(2,3));        // 5


        System.out.println("************SUPPLIER***************");
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());            // 0.5487917068720444

/*

predicate returns boolean, method test.
consumer returns void, method accept,
function returns object, method apply.

PREDICATE: boolean çalışır. true -false döner
 */





































    }
}
