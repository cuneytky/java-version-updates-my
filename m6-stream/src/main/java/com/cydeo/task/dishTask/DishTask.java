package com.cydeo.task.dishTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DishTask {
    public static void main(String[] args) {

        // Print all dish’s name that has less than 400 calories
        DishData.getAll().stream()     // DishData.getAll() --> Array list bunu aldık stream e cevırıp kullanmaya basladık
                .filter(i->i.getCalories()<400)
            //    .map(i->i.getName())   --> burası highlight olur asağıdaki gibi yapınca gider
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("------------------------------------");

        // Print the length of the name of each dish
        DishData.getAll().stream()
                .map(Dish::getName)
                //.map(dish->dish.length())     //  highlight change down
                .map(String::length)
                .forEach(System.out::println);
        /*
        each dish ==> .map demek unutma
        ben aşagıdaki gibi yaptım Ozzy yukarıdakini aynı sonucu aldım.
        farkı ne olur bak

        DishData.getAll().stream()
                .map(i->i.getName().length())
                .forEach(System.out::println);
         */

        System.out.println("------------------------------------");

        // Print three high caloric dish name(>300)
        DishData.getAll().stream()
                .filter(dish->dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("------------------------------------");

        // Print all dish name that are below 400 calories in sorted
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);

        /*
        ben aşagıdaki gibi yaptım Ozzy yukarıdakini yaptı aynı sonucu aldım.
        farkı ne olur bak

        DishData.getAll().stream()
                .filter(i->i.getCalories()<400)
                .map(i->i.getName())
                .forEach(System.out::println);

         */

    }
}
