package com.cydeo;

import com.cydeo.task.dishTask.DishData;
import com.cydeo.task.dishTask.Dish;
import com.cydeo.task.dishTask.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        //toCollection(Supplier) : is used to create a Collection using Collector
        List<Integer> numberList = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);   //[4, 6, 6]

        System.out.println("----------------------------------------");

        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);  // [4, 6] set not duplicate

        System.out.println("----------------------------------------");

        //toList() : returns a Collector interface that gathers the input data into a new list
        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toList());
        System.out.println(numberList2); //[4, 6, 6]

        System.out.println("----------------------------------------");

        //toSet() : returns a Collector interface that gathers the input data into a new set
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);  //[4, 6] set not duplicate

        System.out.println("----------------------------------------");

        //toMap(Function,Function) : returns a Collector interface that gathers the input data into a new map
        Map<String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));

        System.out.println(dishMap); //{chicken=400, pizza=550, fruit=120, salmon=450, fries=530, beef=700, pork=800, rice=350, prawns=300}

        System.out.println("----------------------------------------");

        //summingInt(ToIntFunction) : returns a Collector that produces the sum of a Integer-valued func
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum); // 4200

        System.out.println("----------------------------------------");

        //counting() : returns a Collector that counts the number of the elements
        Long evenCount = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.counting());

        System.out.println(evenCount); // 3

        System.out.println("----------------------------------------");

        //averagingInt(ToIntFunction): returns the average of the integers passed values
        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println(calorieAverage); //466.6666666666667

        System.out.println("----------------------------------------");

        //joining(): is used to join various elements of a character or string array into a single object
        List<String> courses = Arrays.asList("Java","JS","TS");
        String str = courses.stream()
                .collect(Collectors.joining("--"));
        System.out.println(str); //Java--JS--TS

        System.out.println("----------------------------------------");

        //partitioningBy(): is used to partition a stream of objects (or a set of elements) based on a given predicate.
        Map<Boolean,List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(veggieDish);

        System.out.println("----------------------------------------");

        //groupingBy(); is used for grouping objects by some property and storing results in a Map instance
        Map<Type,List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(dishType);
        /*
         Interview Question: (day60 2:17)
   What is the difference between partitioningBy() and groupingBy() ?
partitioningBy(): cıktısı
        {false=[Dish(name=pork, vegetarian=false, calories=800, type=MEAT),
Dish(name=beef, vegetarian=false, calories=700, type=MEAT),
Dish(name=chicken, vegetarian=false, calories=400, type=MEAT),
Dish(name=prawns, vegetarian=false, calories=300, type=FISH),
Dish(name=salmon, vegetarian=false, calories=450, type=FISH)],

true=[Dish(name=fries, vegetarian=true, calories=530, type=OTHER),
 Dish(name=rice, vegetarian=true, calories=350, type=OTHER),
Dish(name=fruit, vegetarian=true, calories=120, type=OTHER),
Dish(name=pizza, vegetarian=true, calories=550, type=OTHER)]}

---
groupingBy(); cıktısı
{FISH=[Dish(name=prawns, vegetarian=false, calories=300, type=FISH),
 Dish(name=salmon, vegetarian=false, calories=450, type=FISH)],

OTHER=[Dish(name=fries, vegetarian=true, calories=530, type=OTHER),
Dish(name=rice, vegetarian=true, calories=350, type=OTHER),
Dish(name=fruit, vegetarian=true, calories=120, type=OTHER),
Dish(name=pizza, vegetarian=true, calories=550, type=OTHER)],

MEAT=[Dish(name=pork, vegetarian=false, calories=800, type=MEAT),
 Dish(name=beef, vegetarian=false, calories=700, type=MEAT),
Dish(name=chicken, vegetarian=false, calories=400, type=MEAT)]}
         */

    }

}
