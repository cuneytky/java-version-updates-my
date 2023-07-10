package com.cydeo.review;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {


        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Adam", 103));


        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher("Albus", 201));
        teacherList.add(new Teacher("Severus", 202));

       // printInfo(studentList);
      //  printInfo(teacherList);

        printInfo2(studentList);
        printInfo2(teacherList);

        System.out.println("----------------------");

        System.out.println(getLastItem(studentList));
        System.out.println(getLastItem(teacherList));

        System.out.println("----------------------");

        MyUtils<Student> obj1 = new MyUtils<>();
        obj1.printInfo2(studentList);
        System.out.println(obj1.getLastItem(studentList));

     //   obj1.printInfo2(teacherList); bu calışmadı myUtils istedi
        MyUtils<Teacher> obj2 = new MyUtils<>();
        obj2.printInfo2(teacherList);
        System.out.println(obj2.getLastItem(teacherList));

        System.out.println("----------------------");

       // MyUtils<String> obj3 = new MyUtils();

    }

    // Write a method that takes a list of students, prints each student and the total student count
    public static void printInfo(List<Student> students){
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("Total student: "+students.size());
    }
             // buradaki T return type
    public static <T extends Person> void printInfo2(List<T> personList){ // buradaki T class
        for (T person : personList) {
            System.out.println(person);
        }
        System.out.println("Total student: "+personList.size());
    }

    // listenin son elemanını getir
    // buradaki I herşey olabilir IT yaptım.
                     // bunu void yapınca da olmaz

    public static <IT> IT getLastItem(List<IT> list){
        return list.get(list.size()-1);
    }

    //buradak T ve I generic.



}
