 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.example.demo.java8;

 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.Iterator;
 import java.util.List;
 import java.util.stream.Collectors;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/3/29 17:00
  */
 public class DishLambda {
     public static void main(String[] args) {
         List<Dish> menu = Arrays.asList(
                 new Dish("pork", false, 800, Dish.Type.MEAT),
                 new Dish("beef", false, 700, Dish.Type.MEAT),
                 new Dish("chicken", false, 400, Dish.Type.MEAT),
                 new Dish("french fries", true, 530, Dish.Type.OTHER),
                 new Dish("rice", true, 350, Dish.Type.OTHER),
                 new Dish("season fruit", true, 120, Dish.Type.OTHER),
                 new Dish("pizza", true, 550, Dish.Type.OTHER),
                 new Dish("prawns", false, 300, Dish.Type.FISH),
                 new Dish("salmon", false, 450, Dish.Type.FISH) );
    
         List<String> three = menu.stream()
                 .filter((m)->m.getCalories()>300)
                 .map(Dish::getName)
                 .limit(3)
                 .collect(Collectors.toList());
         System.out.println(three);
         

     
         
         List<String> names = menu.stream().map(Dish::getName).collect(Collectors.toList());
         System.out.println(names);
         
         
         
     }
     
    
     
     
     
 }
