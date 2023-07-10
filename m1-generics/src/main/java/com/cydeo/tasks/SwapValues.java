package com.cydeo.tasks;

import java.util.Arrays;

public class SwapValues {

    public static void main(String[] args) {

        // soru bu 3 satır ve bu çıktı isteniyor.use generic and think why?
        Integer[] a = {1,2,3,4};
        swap(a,0,2);
        System.out.println(Arrays.toString(a)); //[3, 2, 1, 4]
    }

    private static <T> void swap(T[] a,int i,int j){

        T temp = a[i]; // generic kullanmadan mantık aşagıdaki gibi-->" Integer temp = a[i];""
        a[i] = a[j];
        a[j] = temp;
    }
}
/*
  private static void swap(Integer[] a,int i,int j){

        Integer temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    Burada  neden generic kullanmak zorundasın?
    - diğer type lar kullanılamaz .
     örneğin String a-b-c olsa kullanamazdık çünkü bu sadece integer da calışır

    - bu yüzden generic yapmak için Integer yerine değer girdik: "T" ve
        <T> methodunu ekledik
 */
/*
Question-1 :
Write a generic method to exchange the positions of two different elements in array.
Sample output:
Integer[] a = {1,2,3,4};
swap(a,0,2);
System.out.println(Arrays.toString(a)); //[3,2,1,4]
 */