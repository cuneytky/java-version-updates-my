package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,4,2,10,23);

        //empty() - isPresent()

        Optional<String> empty = Optional.empty();
        System.out.println(empty);               //Optional.empty
        System.out.println(empty.isPresent());   //false
        System.out.println(Optional.of(number).isPresent()); //true

        System.out.println("-----------------------");

        //ifPresent
        Optional<Integer> bigNumber = number.stream().filter(x -> x>100).findAny();
        bigNumber.ifPresent(System.out::println);
        /*
        100 den buyuk deger olmadıgı için çıktı vermedi.
       condition not true. ama hata vermedi. ifPresent in özelliğinden.
        optional boolean.ifPresent de boolean.
         */
        System.out.println("-----------------------");

        //get
        System.out.println(bigNumber.get());

        /*
        no value present--> cıktısı verdı.
        100 den kucuk olsa ikise de 2 cıktısı verırdı

         */

        System.out.println("-----------------------");

        //orElse
        System.out.println(bigNumber.orElse(5));
        // srtlar oluşmadıysa default olarak 5 ata dedik cıktı 5 verdi
        // x<100 ile çelışınca 2 cıktısı verıyor???

       // FactoryMethodsDemo f1 = new FactoryMethodsDemo();

    }
}