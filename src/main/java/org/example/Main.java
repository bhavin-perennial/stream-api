package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(integerList);
        // Find out the even numbers sum using map
        System.out.println(integerList.stream().filter(x -> (x % 2) == 0).reduce(0, (a, b) -> a + b));

        // Group the String by the starting letter of it
        List<String> stringList = new ArrayList<>(Arrays.asList("Bhavin", "Bhavik", "Preet", "Pooja", "Dharuv", "Dhairya", "Zack", "zeel"));
        System.out.println(stringList.stream().collect(Collectors.groupingBy(x -> x.charAt(0))));

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(1, 5000));
        employeeList.add(new Employee(2, 35000));
        employeeList.add(new Employee(3, 8000));
        employeeList.add(new Employee(4, 25000));
        employeeList.add(new Employee(5, 60000));
        employeeList.add(new Employee(6, 500));
        employeeList.add(new Employee(1, 12000));


        //sort the employeeList based on the salary in reverse order
        List<Employee> sortedList = employeeList.stream().sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary())).collect(Collectors.toList());
        //System.out.println(sortedList);
        for (Employee e : sortedList) {
            System.out.print(e.getId() + " ");
        }
        System.out.println();
        //top 3 employee out of this list
        sortedList = employeeList.stream().sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary())).limit(3).collect(Collectors.toList());
        for (Employee e : sortedList) {
            System.out.print(e.getId() + " ");
        }
        System.out.println();
         
        // fetch all the employees having salary less then thired highest salary
       sortedList = employeeList.stream().sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary())).skip(3).collect(Collectors.toList());
        for (Employee e : sortedList) {
            System.out.print(e.getId() + " ");

        }
    }
}