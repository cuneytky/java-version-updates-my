package com.cydeo;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        // intermediate operation:

        List<Integer> list = Arrays.asList(1,2,3,4);
        list.forEach(System.out::println);  // 1 2 3 4
        /*
        .forEach(System.out::println); ==> normalde burası terminal operator.
              ancak her intermed.op. anlamak için ayrı ayrı ornekle streamı anlamaya çalıştık.
          UNUTMA:  forEach aynı zamanda "Iterable interface".
          bunch of oper. var ancak aşagıdaki birkaçı yeterli olacak!!!
         */

        System.out.println("---------------------------------");

        //What kind of functional interface does this filter accept?  ==> predicate
        //foreach belongs to which interface? => Stream interface (buna dökümandan bak)
       /*
       Filtering a Stream:
          Filtering with a predicate : The stream interface supports a filter method.
      This operation takes as argument a predicate (a function returning a boolean) and
      returns a stream including all elements that matches the predicate
        */
        System.out.println("Filter");
        list.stream()                                   //--> stream started
                .filter(i -> i%2==0)
                .forEach(System.out::println); // 2 4  // --> stream closed

        System.out.println("---------------------------------");

        /*
        Filtering a Stream:
           Filtering unique elements : The stream interface supports a distinct method. This
        operation returns a stream with unique elements
         */
        System.out.println("Distinct");
        Stream<Integer> str = list.stream()
                .filter(i -> i%2==0)
                .distinct();
        str.forEach(System.out::println); // 2 4

        System.out.println("---------------------------------");

        /*
        Truncating a Stream (Bir Akışı Kesmek):
        The stream interface supports a limit(n) method. This operation returns
        a stream that’s no longer than a given size.
         */
        System.out.println("Limit");
        list.stream()
                .filter(i -> i%2==0)
                .limit(1)
                .forEach(System.out::println); // 2

        System.out.println("---------------------------------");

        /*
        Skipping Elements:
        The stream interface supports a skip(n) method. This operation returns
        a stream that discards the first n element.
        If the stream has fewer than n elements, an empty stream is returned
         */
        System.out.println("Skip");
        list.stream()
                .filter(i -> i%2==0)
                .skip(1)
                .forEach(System.out::println); // 4

        System.out.println("---------------------------------");

        /*
        Mapping:
    The stream interface supports a map method. This operation takes a
    function as argument. The function is applied to each element,
    mapping it to a new element
         */
        System.out.println("Map");
        list.stream()
                .map(number -> number*2)
                .filter(i -> i%3==0)
                .forEach(System.out::println); // 6



    }
}
