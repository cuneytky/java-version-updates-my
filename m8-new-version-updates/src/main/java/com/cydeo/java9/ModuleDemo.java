package com.cydeo.java9;

import java.util.List;
import java.util.Scanner;

public class ModuleDemo {
    public static void main(String[] args) {

        /*
        Modules

Classes + Interfaces + Enum -> Packages (Groups of .class files)-> Jar
File(Group of packages)
Module (Group of packages) . It contains configuration information inside the
special file(module-info.java)

  -----
   Scanner --> library de oldugundan import edebiliriz.
   Apple isimli class olsa farklı modulden import edemiyoruz cunku bu jar. Bunu maven gibi dependencies edebiliyoruz.
   problem1: fakat bu durumda tüm modulu eklemıs oluyoruz java 9 a kadar boyle ıdı.
   problem2: eklenen dosyada hata olunca diğer dosya fark etmiyordu. şimdi all err

         */
        System.out.println(String.class.getModule());//module java.base
        System.out.println(List.class.getModule());  //module java.base
        System.out.println(Scanner.class.getModule()); //module java.base

    }
}
