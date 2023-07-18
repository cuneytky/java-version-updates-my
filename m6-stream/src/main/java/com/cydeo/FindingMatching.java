package com.cydeo;

import com.cydeo.task.dishTask.DishData;
import com.cydeo.task.dishTask.Dish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {
    public static void main(String[] args) {

        /*
        Finding and Matching
anyMatch : Checks if there is an element in the stream matching the given predicate
allMatch : Checks if all the elements of the stream match the given predicate.
noneMatch : Ensures no elements in the stream match the given predicate.
findAny : Returns any element from a Stream.
         */
        //ALL MATCH
        System.out.println("ALL MATCH");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);       // true

        //ANY MATCH
        System.out.println("ANY MATCH");
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");  //The menu is vegetarian friendly
        }

        //NONE MATCH
        System.out.println("NONE MATCH");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);  //true

        System.out.println("-------------------------------------------");

        //FIND ANY
        System.out.println("FIND ANY");
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish);    //Optional[Dish(name=fries, vegetarian=true, calories=530, type=OTHER)]
        System.out.println(dish.get());      // Dish(name=fries, vegetarian=true, calories=530, type=OTHER)

        //FIND FIRST
        System.out.println("FIND FIRST");
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());  // Dish(name=fries, vegetarian=true, calories=530, type=OTHER)

        /*
        Interview Question: (day60 38:38)
        What is the difference between findAny and findFirst ?
        Sorusuna cevap olarak paralell streamsi açıkladı:
        synchronize x asynchronize
        java is synchronized
         */

        System.out.println("===============================================");

        //PARALLEL STREAMS (Async)
        System.out.println(IntStream.range(0,100).parallel().findAny());   //OptionalInt[62]
        System.out.println(IntStream.range(0,100).parallel().findFirst()); //OptionalInt[0]

        System.out.println("-------------------------------------------");

        List<String> list1 = Arrays.asList("Jonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");
        List<String> list2 = Arrays.asList("Jonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");

        /*
        With parallelStream()
        Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.parallelStream().filter(s -> s.startsWith("J")).findAny();

        System.out.println(findFirst.get()); //David
        System.out.println(findAny.get());   //Jıll

         */
        System.out.println("-------------------------------------------");

        //With stream()
        Optional<String> findFirst = list1.stream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.stream().filter(s -> s.startsWith("J")).findAny();

        System.out.println(findFirst.get()); //David
        System.out.println(findAny.get());   //Jack

        System.out.println("===============================================");

        System.out.println("Min");
        Optional<Dish> dMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin.get()); //Dish(name=fruit, vegetarian=true, calories=120, type=OTHER)

        System.out.println("Max");
        Optional<Dish> dMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax); // Optional[Dish(name=pork, vegetarian=false, calories=800, type=MEAT)]

    }
}
