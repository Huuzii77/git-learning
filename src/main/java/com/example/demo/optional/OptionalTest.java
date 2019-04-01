 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.example.demo.optional;

 import com.example.demo.java8.User;

 import javax.swing.text.html.Option;
 import java.util.Optional;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/4/1 9:45
  */
 public class OptionalTest {
     public static void main(String[] args) {
         
         String str = "Hello World";
         Optional<String> strOpt = Optional.of(str);
         String orElseResult = strOpt.orElse("Hello Shanghai");
         String orElseGet = strOpt.orElseGet(() -> "Hello Shanghai");
         String orElseThrow = strOpt.orElseThrow(
                 () -> new IllegalArgumentException("Argument 'str' cannot be null or blank."));
         System.out.println(strOpt);
         System.out.println(orElseResult);
         System.out.println(orElseGet);
         System.out.println(orElseThrow);
         
         
         
         Optional<String> optional = Optional.of("lw900925@163.com");
         optional = optional.filter(s ->s.contains("164"));
         System.out.println(optional);
    
         User user = new User("chen",14,9000);
         Optional<User> userOpt = Optional.ofNullable(user);
         String userName = userOpt.map(User::getName)
                 .map(String::toUpperCase)
                 .orElse(null);
         System.out.println(userName);
         
     }
 }