 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.example.demo.java8;

 import javax.swing.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.util.Arrays;
 import java.util.IntSummaryStatistics;
 import java.util.List;
 import java.util.function.Predicate;
 import java.util.stream.Collectors;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/3/28 11:39
  */
 public class Lombda2 {
    
     public static void filter(List names, Predicate condition) {
         for(Object name: names)  {
             if(condition.test(name)) {
                 System.out.println(name + " ");
             }
         }
     }
     public static void filter2(List names, Predicate condition) {
         names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
             System.out.println(name + " ");
         });
     }
     
     
     public static void main(String[] args) {
         // Java 8之前：
         new Thread(new Runnable() {
             @Override
             public void run() {
                 System.out.println("Before Java8, too much code for too little to do");
             }
         }).start();
         //Java 8方式：
         new Thread(()-> System.out.println("In Java8, Lambda expression rocks !!")).start();
    
    
         // Java 8之前：
         List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
         for (Object feature : features) {
             System.out.println(feature);
         }
         // Java 8之后：
         features.forEach(e-> System.out.println(e));
         // 使用Java 8的方法引用更方便，方法引用由::双冒号操作符标示，
         // 看起来像C++的作用域解析运算符
         features.forEach(System.out::println);
    
         
         List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
    
         Predicate<String> startsWithJ = (n) -> n.startsWith("J");
         Predicate<String> fourLetterLong = (n) -> n.length() == 4;
         languages.stream()
                 .filter(startsWithJ.and(fourLetterLong))
                 .forEach((n) -> System.out.print("nName, which starts with 'J' and four letter long is : " + n));
    
    
         // 不使用lambda表达式为每个订单加上12%的税
         List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
         for (Integer cost : costBeforeTax) {
             double price = cost + .12*cost;
             System.out.println(price);
         }
         costBeforeTax.stream().map((cost) -> cost + .12*cost).forEach(System.out::println);
    
         // 为每个订单加上12%的税
         // 老方法：
         List<Integer> costBeforeTax2 = Arrays.asList(100, 200, 300, 400, 500);
         double total = 0;
         for (Integer cost : costBeforeTax2) {
             double price = cost + .12*cost;
             total = total + price;
         }
         System.out.println("Total : " + total);
         
         double bill = costBeforeTax2.stream().map((cost) -> cost + .12*cost).reduce((sum,cost)->sum+cost).get();
         System.out.println("Total : " +bill);
    
         // 创建一个字符串列表，每个字符串长度大于2
         List<String> stringList = Arrays.asList("hello","what","w","p");
         stringList.stream().filter((s)->s.length()>2).forEach((p)-> System.out.println(p));
    
         // 将字符串换成大写并用逗号链接起来
         List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
         String hello = G7.stream().map((s)->s.toUpperCase()).collect(Collectors.joining(","));
         System.out.println(hello);
    
         // 用所有不同的数字创建一个正方形列表
         List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
         List<Integer> num = numbers.stream().map((i)->i*i).distinct().collect(Collectors.toList());
         System.out.println("Original List"+numbers+"Square Without duplicates"+num);
    
         //获取数字的个数、最小值、最大值、总和以及平均值
         List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
         IntSummaryStatistics stats = primes.stream().mapToInt((x)->x).summaryStatistics();
         System.out.println("Highest prime number in List : " + stats.getMax());
         System.out.println("Lowest prime number in List : " + stats.getMin());
         System.out.println("Sum of all prime numbers : " + stats.getSum());
         System.out.println("Average of all prime numbers : " + stats.getAverage());
    
    
     }
     
 }
