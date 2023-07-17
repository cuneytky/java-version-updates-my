package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


        public class Main {
            public static void main(String[] args) {

                Calculate sum = (x,y) -> System.out.println(x+y);
                Calculate s1 = (x,y) -> Calculator.findSum(x,y);

                //Method references => (double column ::)
                /*
                - not mandatory but shorter
                - interview perspective:
                   * what change the java 8
                   * how write a different
                 */
                // RULE 1: Static method ise direk class name ile kullan(ClassName :: staticMethod)
                //Reference to a Static Method
                //formula ==>  ClassName :: staticMethod
                Calculate s2 = Calculator::findSum;
                s2.calculate(10,20);   // Sum: 30

                // RULE 2: if instance method ise (new keyword :: instanceMethod) ya da
                //                                        (obj :: instanceMethod)
                //Reference to a instance Method
                Calculator obj = new Calculator();
                Calculate s3 = obj ::findMultiply;
                Calculate s4 = new Calculator() ::findMultiply;

                //---------------------------------------------

                BiFunction<String,Integer,String> func = (str,i) -> str.substring(i);

                BiFunction<String,Integer,String> func2 = String :: substring;

                //---------------------------------------------
            //Function interface <method paramet, return type>
                Function   <Integer,Double>          b = new MyClass()::method;
                BiFunction <MyClass,Integer,Double> b1 = MyClass::method;

                //---------------------------------------------
               // bu ikisi aynı :1.sinde highlight olması alternatifi olmasından ve yapınca olmadı
                Consumer<Integer> display = i -> System.out.println(i);
                Consumer<Integer> display2 = System.out::println;

                /*
                substring() is not static, how can you call directly?
                 */
                /*
                what is functional prg maining?  =>lmabda-double column- ....

                 */
                /*
                 double column (::) 2 part:
                1- implementation with the method (yukarıdaki methodlar)
                2- implementation with the constructor
                 */




            }
        }

       /*
       Predicate<Integer> pred = (p) -> p%2 == 0? true:false;
       Bu ifade lambdanın basit açıklamasıdır.
       <> this generic => interface except generic
       interview question: How lambda expression works?
       - what is functional interface? (except in a abstract method)
        */

