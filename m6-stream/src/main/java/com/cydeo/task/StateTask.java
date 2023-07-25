package com.cydeo.task;

import com.cydeo.task.employeeTask.Employee;
import com.cydeo.task.employeeTask.EmployeeData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StateTask {
    private List<String> cities = new ArrayList<>();
    public void addCity(String city){
        cities.add(city);
    }
    public List<String> getCities(){
        return this.cities;
    }

    public class Main{
        public void main(String[] args) {
            List<StateTask> state =new ArrayList<>();

            StateTask state1 = new StateTask();
            state1.addCity("a");
            state1.addCity("b");
            state1.addCity("c");

            StateTask state2 = new StateTask();
            state2.addCity("d");
            state2.addCity("e");
            state2.addCity("f");

            //solution-1;
          /*  for (StateTask s : state) {
                List<String> cities = s.getCities();
                for (String city : cities) {
                    System.out.println(city);
                }
            }*/

            //solution-2;
            state.stream()
                    .flatMap(states->states.getCities().stream())
                    .forEach(System.out::println);



        }
    }

}
/*
TASK:
Suppose we have a State class that contains list of cities.
 Create a list
of States and print all the cities
public class State {
private List<String> cities = new ArrayList<>();
public void addCity(String city){
cities.add(city);
}
public List<String> getCities(){
return this.cities;
}
}
 */