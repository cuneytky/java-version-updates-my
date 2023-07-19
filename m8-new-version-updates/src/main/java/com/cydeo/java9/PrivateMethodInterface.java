package com.cydeo.java9;
import java.time.LocalDate;
public interface PrivateMethodInterface {

    /*
    private Methods in an interface
In Java 7 and earlier versions, an interface can have only two things : Constant
variables, and abstract methods. These interface methods MUST be
implemented by classes which choose to implement the interface.
In Java 8 version, default methods and static methods features added. In Java
8, an interface can have 4 types : Constant variables, Abstract methods, Default
methods, Static methods
In Java 9 version, private methods and private static method feature added. In
Java 9 and later versions, an interface can have : Constant variables, Abstract
methods, Default methods, Static methods, Private methods, Private Static
methods
     */
    boolean isHoliday(LocalDate date);

    default boolean isBusinessDay(LocalDate date){
        validate(date);
        return !isHoliday(date);
    }

    default LocalDate nextDay(LocalDate date){
        validate(date);
        /*
         if(date.isBefore(LocalDate.of(2001,1,1))){
            throw new IllegalArgumentException();
        }
        j9 oncesi burasını boyle yazmak zorunda idik. private gelince bunu ayrıca yazıp
        validate(date) ile kullanabılır olduk
         */
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(nextDate) ? nextDay(nextDate): nextDate;
    }

    private void validate(LocalDate date){
        if(date.isBefore(LocalDate.of(2001,1,1))){
            throw new IllegalArgumentException();
        }
    }
    /*
    neden private yerine dfault yazmadık bu sadece burada kullanabılır olduk
     */

}
