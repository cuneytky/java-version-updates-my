package com.cydeo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;


public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

        Comparator<Apple> sortApple = comparing((Apple apple) -> apple.getWeight());
        inventory.sort(sortApple);
        System.out.println(inventory);// [Apple(weight=50, color=RED), Apple(weight=100, color=RED), Apple(weight=200, color=GREEN), Apple(weight=300, color=GREEN)]

        inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);// [Apple(weight=50, color=RED), Apple(weight=100, color=RED), Apple(weight=200, color=GREEN), Apple(weight=300, color=GREEN)]

        //Reversed
        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory); //[Apple(weight=300, color=GREEN), Apple(weight=200, color=GREEN), Apple(weight=100, color=RED), Apple(weight=50, color=RED)]

        //Chaining
        inventory
                .sort(comparing(Apple::getWeight)
                        .reversed().thenComparing(Apple::getColor));
    }
}