package com.cydeo;

import java.util.function.Predicate;
import java.util.function.BiFunction;


        public class Main {
            public static void main(String[] args) {

                Calculate sum = (x,y) -> System.out.println(x+y);
                Calculate s1 = (x,y) -> Calculator.findSum(x,y);

            }
        }

       /*
       Predicate<Integer> pred = (p) -> p%2 == 0? true:false;
       Bu ifade lambdanın basit açıklamasıdır.
       <> this generic => interface except generic
       interview question: How lambda expression works?
       - what is functional interface? (except in a abstract method)
        */

