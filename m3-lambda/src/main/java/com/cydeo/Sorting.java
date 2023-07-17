package com.cydeo;
import java.lang.FunctionalInterface;
@FunctionalInterface
/* aynı isimde class var o yüzden hata verdi (hangi functionalInterface kullanacak bilmiyor)
   cozum için:
   1- yukarıdakini import ederiz. "import java.lang.FunctionalInterface"
   2- @java.lang.FunctionalInterface yaparız.
   3- class ismini değiştir.(tercıh edilen bu ama biz burada yapmadık. 1.cözümü kullandık)

 */

public interface Sorting {
    public void sort();
}
