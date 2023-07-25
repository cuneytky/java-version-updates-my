package com.cydeo.java9;
import java.util.*;
public class FactoryMethodsDemo {
    public static void main(String[] args) {
        /*
        Factory Methods For List, Set, Map
Oracle introduced some convenient factory methods to create immutable List,Set, Map.
In Java 8 and earlier versions, we can use Collections class utility methods like
unmodifiableXXX to create immutable Collection objects. However, these
methods are verbose approach.
To overcome those shortcomings, Oracle has added a couple of utility methods
to List, Set and Map interfaces
         */
        //Creating unmodifiable List before Java9
        List<String> courses  = Collections.unmodifiableList(Arrays.asList("Java","Spring","Agile"));
      // courses.add("TS"); --> hata verdi
        System.out.println(courses);

        //Creating unmodifiable List after Java9
        List<String> myCourses = List.of("Java","Spring","Agile");

        //Creating unmodifiable Set after Java9
        Set<String> myProducts = Set.of("Milk","Bread","Butter");

        //Creating unmodifiable Map after Java9
        Map<String,Integer> myCart = Map.ofEntries(
                Map.entry("Samsung TV",1),
                Map.entry("PSP",1),
                Map.entry("Chair",5)
        );
    }
}
