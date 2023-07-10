package com.cydeo.task;

import com.cydeo.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Orange {
    private int weight;
    private Color color;
}
/*
QUESTİON-1 (Lambda Expression Tasks)
Write a prettyPrintApple method that takes aList of Apples and that can be
parameterized with multiple ways to generate a String output from an apple
public static void prettyPrintApple(List<Apple> inventory, ???){
    for(Apple apple : inventory){
        String output = ???.???(apple);
        System.out.println(output);
    }
}
   Sample Output :           Sample Output :
A Light GREEN apple         An apple of 80g
A Heavy RED apple           An apple of 155g
A Light GREEN apple         An apple of 120g

 */