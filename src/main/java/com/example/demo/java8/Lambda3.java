 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.example.demo.java8;

 import java.util.Arrays;
 import java.util.List;
 import java.util.function.Consumer;
 import java.util.function.Function;
 import java.util.function.Predicate;
 import java.util.function.Supplier;
 import java.util.stream.Collectors;
 import java.util.stream.Stream;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/3/29 10:33
  */
 public class Lambda3 {
    
     public static String test(String str,Supplier<String> supplier){
         return str + supplier.get();
     }
     public static String test2(String str , Function<String,String> function){
         return function.apply(str);
     }
    
     public static boolean test3(String str, Predicate<String> predicate){
         return predicate.test(str);
     }
     
     public static void main(String[] args) {
         List<Integer> list = Arrays.asList(1, 2, 3, 5, 7, 9, 10)
                 .stream()
                 .filter(i -> i >= 5)
                 .collect(Collectors.toList());
    
         System.out.println("List:"+list);
    
         Arrays.asList("tony", "cafe", "aaron")
                 .stream()
                 .map(str -> str.toUpperCase())
                 .forEach(System.out::println);
    
    
         Consumer consumer = x-> System.out.println(x);
         consumer.accept(1);
    
         String hello = test("hello ", () -> "word!");
         System.out.println(hello);
    
         String test2 = test2("hello", x -> x.toUpperCase());
         System.out.println(test2);
    
         boolean hello3 = test3("hello", x -> x.length() > 6);
         System.out.println(hello3);
    
         Stream<Integer> stream = Stream.of(1, 2, 3);
         stream.filter(x->x != 2).forEach(x-> System.out.println(x));
    
         Stream<Integer> stream2 = Stream.of(1, 2, 3);
         stream2.map(x->x*2).forEach(System.out::println);
    
         Stream<Integer> stream3 = Stream.of(1, 2, 3);
         stream3.sorted().forEach(System.out::println);
    
         List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
         Integer reduce = list1.stream().reduce(11, (x, y) -> x + y);
         System.out.println(reduce);
    
         
         
         
     }
 }
