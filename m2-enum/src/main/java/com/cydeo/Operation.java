package com.cydeo;

public enum Operation {
    PLUS,MINUS,MULTIPLY,DIVIDE; //each constant is object(new) of Operation
                               // constructor 4 kez çalışacağı için main çalışınca 4 tane constructor getirir? tam anlamadım
    private Operation() { // constructor can not be public (sebebini anlamadım)
        System.out.println("Constructor");
    }
}
