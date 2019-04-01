 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.example.demo.java8;

 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.IntSummaryStatistics;
 import java.util.List;
 import java.util.stream.Collectors;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/3/28 11:10
  */
 public class Lambda1 {
     public static void main(String[] args) {
    
         List<Employee> employees = new ArrayList<>();
         employees.add(new Employee("张三", "男", 25));
         employees.add(new Employee("李四", "女", 24));
         employees.add(new Employee("王五", "女", 23));
         employees.add(new Employee("周六", "男", 22));
         employees.add(new Employee("孙七", "女", 21));
         employees.add(new Employee("刘八", "男", 20));
         //打印所有员工
         employees.forEach(e -> System.out.println(e));
         //或者
         employees.stream().forEach(e -> System.out.println(e));
         
         
         //按年龄排序
         employees.stream().sorted((e1,e2)->e1.getAge()-e2.getAge()).forEach(e-> System.out.println(e));
         //或者
         Collections.sort(employees,(e1,e2)->e1.getAge()-e2.getAge());
         employees.forEach(e-> System.out.println(e));
    
    
         //打印年龄最大的女员工
         Employee maxAgeFemaleEmployer = employees.stream().filter(employee -> "女".equals(employee.getSex())).max((e1,e2)->e1.getAge()-e2.getAge()).get();
         System.out.println(maxAgeFemaleEmployer);
         
         //打印出年龄大于20 的男员工
         employees.stream().filter(e->e.getAge()>20&&"男".equals(e.getSex())).forEach(e-> System.out.println(e));
         //打印出年龄最大的2名男员工
         employees.stream().filter(e->"男".equals(e.getSex())).sorted((e1,e2)->(e2.getAge()-e1.getAge())).limit(2).forEach(e-> System.out.println(e));
         //打印出所有男员工的姓名，使用 , 分隔。map 将 Stream 中所有元素的执行给定的函数后返回值组成新的 Stream
         String maleEmployeesNames = employees.stream().filter(e->"男".equals(e.getSex())&&e.getAge()>22).map(e->e.getName()).collect(Collectors.joining(","));
         System.out.println(maleEmployeesNames);
         
         //统计信息
         IntSummaryStatistics statistics = employees.stream().mapToInt(Employee::getAge).summaryStatistics();
         System.out.println("员工总数：" + statistics.getCount());
         System.out.println("最高年龄：" + statistics.getMax());
         System.out.println("最小年龄：" + statistics.getMin());
         System.out.println("平均年龄：" + statistics.getAverage());
         
     }
 }
