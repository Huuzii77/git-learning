 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.example.demo.method;

 import org.apache.coyote.OutputBuffer;

 import java.util.function.Supplier;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/4/8 13:32
  */
 public class Car {
     public static Car Car(final Supplier<Car> supplier) {
         return supplier.get();
     }
     public static void collide(Car car){
         System.out.println("collided"+car.toString());
     }
     public void follow(Car another){
         System.out.println("Following the"+another.toString());
     }
     public void repaire(){
         System.out.println("Repaired"+this.toString());
     }
    
     public static void main(String[] args) {
         
         
     }
 }
