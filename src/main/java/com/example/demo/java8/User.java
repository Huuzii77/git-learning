 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.example.demo.java8;

 import lombok.AllArgsConstructor;
 import lombok.Data;
 import lombok.NoArgsConstructor;
 import lombok.ToString;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/3/29 10:58
  */
 @Data
 @ToString
 @AllArgsConstructor
 @NoArgsConstructor
 public class User {
     
     private String name;
    
     private Integer age;
    
     private Integer salary;
 }
