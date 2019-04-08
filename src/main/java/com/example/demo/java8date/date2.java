 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.example.demo.java8date;

 import java.time.Duration;
 import java.time.LocalDateTime;
 import java.time.Month;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/4/8 13:48
  */
 public class date2 {
     public static void main(String[] args) {
         
         final LocalDateTime from = LocalDateTime.of(2014,Month.APRIL,16,0,0,0);
         final LocalDateTime to = LocalDateTime.of(2015,Month.APRIL,16,23,59,59);
         final Duration duration = Duration.between(from,to);
         System.out.println("duration in days:"+duration.toDays());
         System.out.println("duration in hours:"+duration.toHours());
     }
 }
