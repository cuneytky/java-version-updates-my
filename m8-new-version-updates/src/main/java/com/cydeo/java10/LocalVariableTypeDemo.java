package com.cydeo.java10;
import java.util.Arrays;
import java.util.List;
public class LocalVariableTypeDemo {
    public static void main(String[] args) {

        // Type Inference ?
        /*
        Local Variable Type Inference
Local Variable Type Inference is one of the most evident change to language
available from Java 10 onwards. It allows to define a variable using var and
without specifying the type of it. The compiler infers the type of the variable
using the value provided. This type inference is restricted to local variables.

No type inference in case of member variable(static instance), method parameters, return values.
Local variable should be initialized at time of declaration otherwise compiler will not be
infer and will throw error.
Local variable inference is available inside initialization block of loop statements.
No dynamic type change. Once type of local variable is inferred it cannot be changed.
Complex boilerplate code can be reduced using local variable type inference
         */

        String s ;
        s = "Ozzy";  // var ile bu yapılamaz

        var str = "Cydeo";
        var number = 5;
        /*
        var ==> local variable, not instance variable (belong the class)
         can not use inside the class
         */

        byte x = 1;
        var y = 1; //int
        var price = 12.50;

        var numbers = Arrays.asList(3,4,5,6);

        var sum = 0;
        for(var eachNumber : numbers){
            sum = sum+eachNumber;
        }
    }
}
