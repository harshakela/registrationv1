package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class B {
    public static void main(String[] args) {
       /* List<Employee> data = Arrays.asList(
                new Employee(1, "mike", 5000),
                new Employee(2, "stallin", 4000),
                new Employee(3, "adam", 5000)
                );
//        List<Employee> newData = data.stream().filter(e->e.getSal()>4000).collect(Collectors.toList());
//        for (Employee emp:newData){
//            System.out.println(emp.getId());
//            System.out.println(emp.getName());
//            System.out.println(emp.getSal());
//        }
        Map<Integer, List<Employee>> newData = data.stream().collect(Collectors.groupingBy(e -> e.getSal()));
        System.out.println(newData);*/

        //method reference----------------------------
//        List<Integer> data  = Arrays.asList(10,20,13,15);
//        int result = data.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(result);

        //find min max number in the list--------------------------
        List<Integer> numbers = Arrays.asList(3,5,7,2,8,10);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        System.out.println(max.get());

    }
}
