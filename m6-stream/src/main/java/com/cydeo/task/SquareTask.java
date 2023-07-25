package com.cydeo.task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareTask {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        List<Integer> squareNum = squareNum(numbers);
        System.out.println(squareNum);

    }
    public static List<Integer> squareNum(List<Integer> numbers){
        return numbers.stream()
                .map(n->n*n)
                .collect(Collectors.toList());
    }
}
/*
TASK:
 Given a list of numbers how would you return a list of the square of each
number? For example, given [1,2,3,4,5] you should return [1,4,9,16,25]

List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");
        words.stream()
                .map(str->str.length())
                .forEach(System.out::println);
 */
