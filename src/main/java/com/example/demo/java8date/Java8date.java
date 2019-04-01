 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.example.demo.java8date;

 import java.time.*;
 import java.time.format.DateTimeFormatter;
 import java.time.temporal.ChronoUnit;
 import java.util.Locale;
 import java.util.Set;

 import static java.time.temporal.TemporalAdjusters.*;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/3/29 11:42
  */
 public class Java8date {
     public static void main(String[] args) {
         LocalDate localDate = LocalDate.of(2017, 1, 4);
         int year = localDate.getYear();
         Month month = localDate.getMonth();
         int dayOfMonth = localDate.getDayOfMonth();
         DayOfWeek dayOfWeek = localDate.getDayOfWeek();
         int length = localDate.lengthOfMonth();
         boolean leapYear = localDate.isLeapYear();
    
         Instant instant = Instant.ofEpochSecond(120, 100000);
    
    
         LocalDate date = LocalDate.of(2017, 1, 5);
         LocalDate date1 = date.withYear(2016);
         LocalDate date2 = date.plusYears(1);
         LocalDate date3 = date.minusMonths(2);
         LocalDate date4 = date.plus(5,ChronoUnit.DAYS);
         
         LocalDate date5 = date.with(nextOrSame(DayOfWeek.SUNDAY));
         LocalDate date6 = date.with(lastInMonth(DayOfWeek.SATURDAY));
    
    
         LocalDateTime dateTime = LocalDateTime.now();
         String strDate1 = dateTime.format(DateTimeFormatter.BASIC_ISO_DATE);
         String strDate2 = dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
         String strDate3 = dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
         String strDate4 = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
         String strDate5 = dateTime.format(DateTimeFormatter.ofPattern("今天是：YYYY年 MMMM DD日 E", Locale.CHINESE));
    
         String strDate6 = "2017-01-05";
         String strDate7 = "2017-01-05 12:30:05";
         LocalDate localDate1 = LocalDate.parse(strDate6,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
         LocalDateTime dateTime1 = LocalDateTime.parse(strDate7, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
         
         ZoneId shanghaiZoneId = ZoneId.of("Asia/Shanghai");
         ZoneId systemZoneId = ZoneId.systemDefault();
         Set<String> zoneIds = ZoneId.getAvailableZoneIds();
         System.out.println("zongIds:"+zoneIds);
    
         LocalDateTime localDateTime = LocalDateTime.now();
         ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, shanghaiZoneId);
         System.out.println(zonedDateTime);
     }
 }
