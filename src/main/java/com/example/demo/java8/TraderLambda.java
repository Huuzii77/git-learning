 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.example.demo.java8;

 import java.util.Arrays;
 import java.util.Comparator;
 import java.util.List;
 import java.util.stream.Collectors;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/3/29 18:10
  */
 public class TraderLambda {
     public static void main(String[] args) {
         
         Trader raoul = new Trader("Raoul", "Cambridge");
         Trader mario = new Trader("Mario","Milan");
         Trader alan = new Trader("Alan","Cambridge");
         Trader brian = new Trader("Brian","Cambridge");
         List<Transaction> transactions = Arrays.asList(
                 new Transaction(brian, 2011, 300),
                 new Transaction(raoul, 2012, 1000),
                 new Transaction(raoul, 2011, 400),
                 new Transaction(mario, 2012, 710),
                 new Transaction(mario, 2012, 700),
                 new Transaction(alan, 2012, 950)
         );
         //1
         List<Transaction> transactions1 = transactions.stream().filter((t)->t.getYear()==2011).sorted((t1,t2)->t1.getValue()-t2.getValue()).collect(Collectors.toList());
         System.out.println(transactions1);
         
         List<Transaction> tr2011 = transactions.stream().filter(transaction -> transaction.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
         
         //2
         List<String> cities = transactions.stream().map(transaction -> transaction.getTrader().getCity()).distinct().collect(Collectors.toList());
         
         
     }
 }
