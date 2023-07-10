package com.cydeo;

public class Main {
    public static void main(String[] args) {
      //  Apple a = new Apple(5);

        System.out.println("How to access a constant");// nasıl erişeceğim

        Currency c = Currency.DIME;         // DİME is an object of currency class
        System.out.println(c);              // DİME -CIKTISI GELİR //where is the overriding method
        System.out.println(Currency.PENNY); // PENNY -direk bu şekilde cıktısı gelir

        System.out.println("---------------------------------");

        System.out.println("How to get all constant");
        Currency[] currencies = Currency.values(); // where is the values method?

        for(Currency currency : currencies){
            System.out.println(currency); //PENNY-NICKLE-DIME-QUARTER alt alta gelir
        }
        /*
        where sorularının cevabı:
        Enum may implement many interfaces but can not extend any class because it
        internally extends Enum class(java.lang.Enum).
         */

        System.out.println("---------------------------------");

        System.out.println("How to use switch-case with enums");

        Currency myCurrency = Currency.QUARTER; // bu iki satır yerine= switch(Currency.DİME) ya da
        switch(myCurrency){                     // switch(c) yazabiliriz
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;
        }
        System.out.println("---------------------------------");

        System.out.println("Operation Task");
        calculate(3,5,Operation.PLUS);

        System.out.println("How top retrieve the constant value");
        System.out.println(Currency.PENNY.getValue());
        System.out.println(Currency.QUARTER.getValue());
        System.out.println(Currency.QUARTER.ordinal()); //3 cıktısı verir bu index tir
    }
    private static void calculate(double x, double y,Operation operation){
        switch(operation){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;
        }
    }
}
