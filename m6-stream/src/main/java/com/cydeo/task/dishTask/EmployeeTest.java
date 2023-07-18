package com.cydeo.task.dishTask;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        // Print all emails
        EmployeeData.readAll()
               // .map(employee -> employee.getEmpEmail()) bu da asagıdaki de olur
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("------------------------------------");

        // Print all Phone Numbers-1
        EmployeeData.readAll()
               // .map(employee -> employee.getEmpPhoneNumbers())
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);
        /*
         [2022028765, 7038763425]
         [4122028765, 8998763425]
         [5162028765, 6198763425] bunun cıktısı map kullandığımız için
         */

        System.out.println("------------------------------------");

        // Print all Phone Numbers-2
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);
        /*
        2022028765 7038763425 4122028765 8998763425 5162028765 6198763425
        alt alt bu cıktıyı verecek flatMap kullandık 1 den fazla tel no var
         */

        System.out.println("------------------------------------");

        //Print All Phone Numbers-2 with Double Colon
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);




    }
}
