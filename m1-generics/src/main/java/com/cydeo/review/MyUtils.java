package com.cydeo.review;

import java.util.List;

public class MyUtils<T extends Person> {

    // static olmadan bu şekilde de yapabilirz
    public void printInfo2(List<T> list){ // buradaki T class
        for (T person : list) {
            System.out.println(person);
        }
        System.out.println("Total student: "+list.size());
    }


    public T getLastItem(List<T> list){
        return list.get(list.size()-1);
    }

}
