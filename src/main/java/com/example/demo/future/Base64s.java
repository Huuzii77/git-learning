 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.example.demo.future;

 import java.nio.charset.StandardCharsets;
 import java.util.Base64;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/4/8 13:55
  */
 public class Base64s {
     public static void main(String[] args) {
         final String text="Base64 finally in Java 8!";
         final String encoded = Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
         System.out.println(encoded);
         
         final String decoded = new String(Base64.getDecoder().decode(encoded),StandardCharsets.UTF_8);
         System.out.println(decoded);
     }
 }
