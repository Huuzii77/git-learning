 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.example.demo.java8;

 import java.util.Arrays;
 import java.util.Comparator;
 import java.util.List;
 import java.util.function.Function;
 import java.util.function.IntPredicate;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/3/29 14:17
  */
 public class Lambda5 {
     
     public static void process(Runnable r){
         r.run();
     }
     public static void main(String[] args) {
          process(()-> System.out.println("hello"));
          List<String> str = Arrays.asList("a","b","A","B");
          str.sort(String::compareToIgnoreCase);
    
          System.out.println("list"+str);
          Comparator<Book> c = Comparator.comparing(Book::getPrice);
    
          Function<Integer,Integer> f = x->x+1;
          Function<Integer,Integer> g = x->x*2;
          Function<Integer,Integer> h=f.andThen(g);
          int result = h.apply(1);
          System.out.println(result);
    
         char a ='a';
         char b ='b';
         System . out .println(Math . max(a , b));
         
         
         
     }
 }
