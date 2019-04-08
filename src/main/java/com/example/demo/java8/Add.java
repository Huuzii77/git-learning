 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.example.demo.java8;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/4/1 17:31
  */
 public class Add {
     public static int add(int a,int b){
         return a+b;
     }
    
     public static void main(String[] args) {
         long startTime = System.currentTimeMillis();
         try {
             Thread.sleep(10*1000);
         }catch (Exception e){
             e.printStackTrace();
         }
         long nowTime = System.currentTimeMillis();
         System.out.println((nowTime-startTime)/1000);
         
     }
 }
