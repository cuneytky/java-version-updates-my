package com.cydeo.tasks;
import java.util.Arrays;
import java.util.List;
public class CountTest {

    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
    }
    private static <T> int countIf(List<T> c, UnaryPredicate<T> p){

        int count = 0;
        for(T elem : c){
            if(p.test(elem)){
                ++count;
            }
        }
        return count;
    }
}
/*
what is interface responsibility? =>(providing one abstract method.)

public interface UnaryPredicate<T> {
public boolean test(T obj);
}
interface name:UnaryPredicate () bu hersey olabılır.
abstract method yapılacağını soyler ama nasıl yapılacağını soylemez.
burada test method: get an object and return boolean
bu da interfacein responsibility si.


*******
sıralama sana kolaylık sağlar
1-interface
2-class
3-implementation
*******


 */
/*

QQQQQ ==> why I need generic???? explain verbally

 */


/*
Question-2 :
Write a generic method to count the number of elements in a collection that
have a specific property (for example, odd integers, prime numbers).
Use following interface in your solution as well:

public interface UnaryPredicate<T> {
public boolean test(T obj);
}
Sample output:

List<Integer> ci = Arrays.asList(1, 2, 3, 4);
int count = countIf(ci, new OddPredicate());
System.out.println("Number of odd integers = " + count);
 */