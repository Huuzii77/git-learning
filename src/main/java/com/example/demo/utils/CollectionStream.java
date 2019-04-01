 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.example.demo.utils;

 import com.example.demo.java8.User;

 import java.util.Arrays;
 import java.util.List;
 import java.util.Map;
 import java.util.Objects;
 import java.util.function.Function;
 import java.util.stream.Collectors;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/3/29 11:04
  */
 public class CollectionStream {
    
    
     public static void main(String[] args) {
         List<User> users = Arrays.asList(new User("张三", 19, 1000),
                 new User("张三", 58, 2000),
                 new User("李四", 38, 3000),
                 new User("赵五", 48, 4000)
         );
         Map<Integer, Integer> map = listToMap(users, x -> x.getAge(), x -> x.getSalary());
         System.out.println(map);
     }
 
     
     
     /**
      * @Description list 转map key不能相同 ，如果相同会报错。 方法对 源数据，key，value过滤null。
      * @Date 9:27 2019/2/19
      * @param source 源数据
      * @param key
      * @param value
      * @return java.util.Map<K,V>
      **/
     public static <DTO, K, V> Map<K, V> listToMap(List<DTO> source, Function<? super DTO, ? extends K> key, Function<? super DTO, ? extends V> value) {
         Objects.requireNonNull(source, "source not null");
         Objects.requireNonNull(key, "key not null");
         Objects.requireNonNull(value, "value not null");
         Map<K, V> map = source.stream()
                 .filter(dto -> dto != null)
                 .filter(dto -> key.apply(dto) != null)
                 .filter(dto -> value.apply(dto) != null)
                 .collect(Collectors.toMap(key, value));
         return map;
     }
    

 }
