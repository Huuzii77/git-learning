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

 import java.lang.reflect.Type;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/3/29 16:57
  */
 @Data
 @AllArgsConstructor
 @NoArgsConstructor
 @Builder
 public class Dish {
     private String name;
     private boolean vegetarian;
     private int calories;
     private Type type;
     public enum Type { MEAT, FISH, OTHER }
 }
