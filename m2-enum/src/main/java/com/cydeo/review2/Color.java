package com.cydeo.review2;

public enum Color implements Printable{
    RED("RED"),
    GREEN("GREEN"),
    BLUE("BLUE");
    public String value;
    Color(String value){
        this.value=value;
    }
    public void print(){
        System.out.println(this.value);
    }
    // Anonymous Class
    /*
    bunu aşagıdaki gibi yapailiriz ya da yukarıdaki gibi
           interface kullanıp (Printable) yapabiliriz.
           * bu ENUM quizinde 14. sorunun neden true olduğunu da açıklar
           -Enum types can have abstract methods==> true.
    RED{
        @Override
        public void print(){
            System.out.println("RED");
        }
    },
    GREEN{
        @Override
        public void print(){
            System.out.println("GREEN");
        }
    },
    BLUE{
        @Override
        public void print(){
            System.out.println("BLUE");
        }
    };

    public abstract void print();
     */
}
