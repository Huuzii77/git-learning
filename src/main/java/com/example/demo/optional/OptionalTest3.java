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
  * @since 2019/4/1 14:02
  */
 public class OptionalTest3 {
     public static void main(String[] args) {
         User user = new User("chen",18,9000);
         Optional<User> optional = Optional.ofNullable(user);
         Optional<String> str = optional.map(User::getName);
         System.out.println(str.get());
         String str1 = "Hello world！";
         Optional<String> strOpt = Optional.of(str1);
         System.out.println(strOpt);
         String orElseResult = strOpt.orElse("Hello shanghai");
         System.out.println(orElseResult);
         String orElseGet = strOpt.orElseGet(()->"Hello shanghai");
         System.out.println(orElseGet);
         String orElseThrow = strOpt.orElseThrow(
                 () -> new IllegalArgumentException("Argument 'str' cannot be null or blank."));
         System.out.println(orElseThrow);
         
     }
 }
