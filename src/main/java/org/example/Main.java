package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> integerList =  new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(integerList);
        // Find out the even numbers sum using map
       System.out.println(integerList.stream().filter(x->(x%2)==0).reduce(0,(a,b)->a+b));

       // Group the String by the starting letter of it
        List<String> stringList = new ArrayList<>(Arrays.asList("Bhavin","Bhavik","Preet","Pooja","Dharuv","Dhairya"));
        System.out.println(stringList.stream().collect(Collectors.groupingBy(x->x.charAt(0))));
    }
}