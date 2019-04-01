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
 import java.util.Map;
 import java.util.Set;
 import java.util.stream.Collectors;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/3/29 10:59
  */
 public class Lambda4 {
     public static void main(String[] args) {
         
         List<User> users = Arrays.asList(new User("王五", 20, 1000),
                 new User("张三", 20, 2000),
                 new User("李四", 36, 3000),
                 new User("赵五", 48, 4000)
         );

         
         
         
         List<String> collect = users.stream().map(x -> x.getName()).collect(Collectors.toList());
         Set<String> collect1 = users.stream().map(x -> x.getName()).collect(Collectors.toSet());
         Map<Integer, String> collect2 = users.stream().collect(Collectors.toMap(x -> x.getAge(), x -> x.getName()));
         System.out.println(collect);
         System.out.println(collect1);
         System.out.println(collect2);
    
         Map<String, List<User>> collect3 = users.stream().collect(Collectors.groupingBy(x -> x.getName()));
         System.out.println(collect3);
    
       
         
         
     }

 }
