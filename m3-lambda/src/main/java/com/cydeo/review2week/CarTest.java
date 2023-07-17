package com.cydeo.review2week;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {

        List<Car> carList=new ArrayList<>();

        carList.add(new Car("toyota",140,1998));
        carList.add(new Car("audi",200,2008));
        carList.add(new Car("BMW",210,2020));
        carList.add(new Car("Nissan",150,2018));

        // Without Behaviour Parameterization
        System.out.println(filterFastCars(carList));//[Car(make=audi, topSpeed=200, year=2008), Car(make=BMW, topSpeed=210, year=2020)]
        System.out.println(filterNewCars(carList)); //[Car(make=BMW, topSpeed=210, year=2020), Car(make=Nissan, topSpeed=150, year=2018)]
        System.out.println("-----------------------------------");
        // With Behaviour Parameterization
        System.out.println("Fast Cars:");
        System.out.println(filter(carList,new CarFastPredicate()));
        System.out.println("New Cars:");
        System.out.println(filter(carList,new CarNewPredicate()));
        System.out.println("-----------------------------------");

        // Fat Arrow : ->

        CarPredicate fastCarPredicate = car -> car.getTopSpeed()>160;
        System.out.println("Fast Cars:");
        System.out.println(filter(carList,fastCarPredicate));

        System.out.println("New Cars:");
        System.out.println(filter(carList,car -> car.getYear()>200));





    }

    // Without Behaviour Parameterization

    private static List<Car> filterFastCars(List<Car> cars){
        List<Car> filteredCars = new ArrayList<>();

        for (Car car:cars){
            if(car.getTopSpeed()>160){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterNewCars(List<Car> cars){
        List<Car> filteredCars = new ArrayList<>();

        for (Car car:cars){
            if(car.getYear()>2015){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    //***********************************************************

    // With Behaviour Parameterization
    /*
    bu yontemle bir kez yazıyoruz.
     Cağırırken ne istiyorsak onu çağırıyoruz.
     */

    private static List<Car> filter(List<Car> cars,CarPredicate carPredicate){
        List<Car> filteredCars = new ArrayList<>();

        for (Car car:cars){
            if(carPredicate.test(car)){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

}
