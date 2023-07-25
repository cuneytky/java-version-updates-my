package com.cydeo.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PairNumTask {
    public static void main(String[] args) {

        List<Integer> numbers1 = Arrays.asList(1,2,3);
        List<Integer> numbers2 = Arrays.asList(3,4);
        List<Pair<Integer,Integer>> pairs= allPairs(numbers1 , numbers2);
        System.out.println(pairs);

        }

        public static List<Pair<Integer,Integer>> allPairs(List<Integer> numbers1, List<Integer> numbers2){
            // use stream flatmap
         return numbers1.stream()
                       .flatMap(num1->numbers2.stream().map(num2->new Pair<>(num1,num2)))
                       .collect(Collectors.toList());

            //use nested loops
         /*   List<Pair<Integer, Integer>> pairs = new ArrayList<>();
            for (Integer num1 : numbers1) {
                for (Integer num2 : numbers2) {
                    pairs.add(new Pair<>(num1, num2));
                }
            }
            return pairs;
         */

        }
}

class Pair<T,U>{
    private final T first;
    private final U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + ")";
    }
}
/*
TASK:
Given two lists of numbers, how would you return all pairs of numbers? For
example, given a list [1,2,3] and a list [3,4] you should return [(1,3),(1,4),(2,3),
(2,4),(3,3),(3,4)]
• List<Integer> numbers1 = Arrays.asList(1,2,3);
• List<Integer> numbers2 = Arrays.asList(3,4);
• List<int[]> pairs = ?????
 */
