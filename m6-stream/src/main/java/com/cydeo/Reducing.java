package com.cydeo;

import com.cydeo.task.dishTask.DishData;
import com.cydeo.task.dishTask.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        int sum1 = 0;
        for(int number : numbers){
           sum1 = sum1 + number;
        }
        System.out.println(sum1); //21

        System.out.println("--------------------------------------");
        /*
        STREAM.REDUCE()
The stream interface supports a reduce method. This operation allows
us to produce one single result from a sequence of elements
It takes 2 arguments:
An initial value
A BinaryOperator<T> to combine two elements and produce a new value
         */

        int result = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println(result); //21

        System.out.println("--------------------------------------");

        /*
        No Initial Value --> STREAM.REDUCE()
There is also an overloaded variant of reduce that does not take an
initial value, but it returns an Optional object
         */
        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a+b);
        System.out.println(result2.get());  // 21

        System.out.println("--------------------------------------");

        System.out.println("Dish calories total:");
        int calTotal1= DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce((a,b)-> a+b)
                .get(); //reduce return optional o yüzden get yazarak int kullanabildik yada asağıdaki gibi yaparız.

        Optional<Integer> calTotal = DishData.getAll().stream()
                .map(Dish::getCalories)
//                .reduce((a,b) -> a+b)
                .reduce(Integer::sum);

        System.out.println(calTotal1);      //4200
        System.out.println(calTotal.get()); //4200

        System.out.println("--------------------------------------");

        /*
        Maximum and Minumum
        There is also an overloaded variant of reduce that does not take an
         initial value, but it returns an Optional object
         */
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("Min:" + min.get()); //Min:3
        System.out.println("Max:" + max.get()); //Max:9
        System.out.println("Sum:" + sum.get()); //Sum:21

        System.out.println("--------------------------------------");

        System.out.println("COUNT");
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);  // 9


    }
}
