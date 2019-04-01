 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.example.demo.optional;

 import com.example.demo.java8.User;

 import java.util.Optional;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/4/1 10:45
  */
 public class OptionalTest2 {
     public static void main(String[] args) {
         /*User user = new User("chen",18,8000);
         User user1 = null;
         Optional<User> op1 = Optional.of(user);
         Optional<User> op2 = Optional.ofNullable(user1);
         System.out.println(op1.isPresent());
         System.out.println(op1.orElse(user1));
         System.out.println(op1.get());*/
         User user = new User();
         user.setName("Java3y");
         System.out.println(test(user));
         
     }
    
     // 现在的代码
     public static String test(User user) {
         return Optional.ofNullable(user)
                 .map(user1 -> user1.getName())
                 .map(s -> s.toUpperCase()).orElse(null);
     }
    
     // 以前的代码v1
     public static String test2(User user) {
         if (user != null) {
             String name = user.getName();
             if (name != null) {
                 return name.toUpperCase();
             } else {
                 return null;
             }
         } else {
             return null;
         }
     }
     // 以前的代码v2
     public static String test3(User user) {
         if (user != null && user.getName() != null) {
             return user.getName().toUpperCase();
         } else {
             return null;
         }
     }

     
     
     
 }
