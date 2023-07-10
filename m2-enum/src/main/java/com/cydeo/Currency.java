package com.cydeo;

public enum Currency {
    PENNY(1),NICKLE(5),DIME(10),QUARTER(25);

    /* bunu nasıl okumalıyım: (bunlar constant objecttir unutma)
       PENNY is an object of currency class
       NICKLE is an object of currency class
       -----
       sonuna ; getirmeyebilirsin bu halde iken=>PENNY,NICKLE,DIME,QUARTER
       ------
       unutma:
       Java enum constants are static and final implicitly.
       Because they are constants, the names of an enum type's fields are in
       uppercase letters.
       ---
       how I'm going to access? (nasıl erişeceğim)
       class name ile--> (Currency.PENNY)
       ----
       ENUM zengin bir yapısı var içine:
        -constructor ekleyebilrsin
        -method ekleyebilirsin
        - içine absrturct method koyamayız, abstract class ister. enum is static final
     */
    private int value;
    Currency(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
