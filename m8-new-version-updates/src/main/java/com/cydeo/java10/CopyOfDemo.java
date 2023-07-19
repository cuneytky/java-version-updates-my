package com.cydeo.java10;
import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {
    public static void main(String[] args) {
        /*
        Java 10 has added a copyOf method to all the Collection interfaces. You can
use this to create an unmodifiable Collection
         */
        List<Integer> numberList = Arrays.asList(2,4,6,8);

        List<Integer> unmodifiableList2= List.of(2,4,6,8);
        List<Integer> unmodifiableList = List.copyOf(numberList);
    }
}
