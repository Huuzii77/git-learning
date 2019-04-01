 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.example.demo.java8;

 import lombok.AllArgsConstructor;
 import lombok.Builder;
 import lombok.Data;
 import lombok.NoArgsConstructor;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/3/28 11:10
  */
 @Data
 @NoArgsConstructor
 @AllArgsConstructor
 @Builder
 public class Employee {
     private String name;
     private String sex;
     private int age;
 }
