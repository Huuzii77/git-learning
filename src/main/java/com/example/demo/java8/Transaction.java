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
 import lombok.experimental.NonFinal;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/3/29 18:11
  */
 @Data
 @AllArgsConstructor
 @NoArgsConstructor
 @Builder
 public class Transaction {
     private  Trader trader;
     private  int year;
     private  int value;
 }
