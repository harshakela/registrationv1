package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
        //----------03-09-24-----------------------------//
        //Predicate Functional Interface
        // It takes input & produces boolean value output
        //-----------------------------------------------------------------------//
//        Predicate<Integer> val = x ->x>300;
//        boolean result = val.test(100);
//        System.out.println(result);
        //-----------------------------------------------------------------------//
//        Predicate<String> val = x->x.equals("mike");
//        boolean result = val.test("mike");
//        System.out.println(result);
        //-----------------------------------------------------------------------//
//        List<Integer> data = Arrays.asList(100,10,35,2,55,500,700);
//        List<Integer> newData = data.stream().filter(x->x>100).collect(Collectors.toList());
//        System.out.println(newData);
        //-----------------------------------------------------------------------//
//        List<String> data = Arrays.asList("mike","madam","bike","me","adam");
//        List<String> newData = data.stream().filter(x->x.startsWith("m")).collect(Collectors.toList());
//        System.out.println(newData);
        //-----------------------------------------------------------------------//
//        List<Integer> data = Arrays.asList(10,11,13,14,16,19);
//        List<Integer> newData = data.stream().filter(t -> t % 2 == 0).collect(Collectors.toList());
//        System.out.println(newData);
        //-----------------------------------------------------------------------//
//        List<Integer> data = Arrays.asList(10,11,13,14,16,19);
//        List<Integer> newData = data.stream().filter(t -> t % 2 != 0).collect(Collectors.toList());
//        System.out.println(newData);
//--------------------------------------------------------------------------------------------------------------//
        //----------06-09-24-----------------------------//

        //Function Functional Interface
        //It takes input & produces boolean value output
//        Function<String,Integer>x = s->s.length();
//        Integer val = x.apply("mike");
//        System.out.println(val);
        //--------------------------------------------------------------------------------------//
//        Function<Integer,Integer>x = s->s*s;
//        Integer val = x.apply(100);
//        System.out.println(val);
        //--------------------------------------------------------------------------------------//
        //give all given inputs square---------
//        List<Integer> data = Arrays.asList(10,20,35,12,14);
//        List<Integer> newData = data.stream().map(x -> x * x).collect(Collectors.toList());
//        System.out.println(newData);
        //--------------------------------------------------------------------------------------//
        //it gives all inputs with addding +5-------
//        List<Integer> data = Arrays.asList(10,20,35,12,14);
//        List<Integer> newData = data.stream().map(x -> x + 5).collect(Collectors.toList());
//        System.out.println(newData);
        //--------------------------------------------------------------------------------------//
//        List<String> data = Arrays.asList("mike","stallin","krishna");
//        List<String> newData = data.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
//        System.out.println(newData);
        //--------------------------------------------------------------------------------------//
        //give me the length of all the words------
//        List<String> data = Arrays.asList("mike","stallin","krishna");
//        List<Integer> newData = data.stream().map(x -> x.length()).collect(Collectors.toList());
//        System.out.println(newData);
        //--------------------------------------------------------------------------------------//
        //sort the given inputs----
//        List<String> data = Arrays.asList("mike","stallin","krishna");
//        List<String> newData = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData);
        //--------------------------------------------------------------------------------------//
        //stream api code for removing duplicate strings
//        List<String> data = Arrays.asList("mike","stallin","krishna","mike","krishna");
//        List<String> newData = data.stream().distinct().collect(Collectors.toList());
//        System.out.println(newData);
        //--------------------------------------------------------------------------------------//
        //length is more than 4 give me those names---------
//        List<String> data = Arrays.asList("mike","stallin","krishna","mike","krishna");
//        List<String> newData = data.stream().filter(s->s.length()>4).collect(Collectors.toList());
//        System.out.println(newData);
        //--------------------------------------------------------------------------------------//

        //Consumer Functional Interface
        //It takes one input & produces no output
//        Consumer<String> x = s-> System.out.println(s);
//        x.accept("mike");
        //--------------------------------------------------------------------------------------//
        List<String>names = Arrays.asList("Laxman","Bharat","Ram");
        Consumer<String> val = s-> System.out.println(s);
        names.forEach(val);
    }
}
