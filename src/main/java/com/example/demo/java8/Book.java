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
  * @since 2019/3/29 11:08
  */
 @Data
 @AllArgsConstructor
 @NoArgsConstructor
 @Builder
 public class Book {
     private String author;
     private String publisher;
     private Integer price;
     private String publishDate;
 }
