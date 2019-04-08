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
 import java.util.Optional;
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
         
         
         //1找出2011年发生的所有交易，并按交易额排序
         List<Transaction> transactions1 = transactions.stream().filter((t)->t.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue).reversed()).collect(Collectors.toList());
         System.out.println(transactions1);
         
         List<Transaction> tr2011 = transactions.stream().filter(transaction -> transaction.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
         System.out.println(tr2011);
         //2交易员都在哪些不同的城市工作过
         List<String> cities = transactions.stream().map(transaction -> transaction.getTrader().getCity()).distinct().collect(Collectors.toList());
         System.out.println(cities);
         //3查找所有来自于剑桥的交易员，并按姓名排序
         List<Trader> traders = transactions.stream().map(Transaction::getTrader).filter(trader -> "Cambridge".equals(trader.getCity())).distinct().sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
         System.out.println(traders);
         
         //4返回所有交易员的姓名字符串，按字母顺序排序
         String tradeStr = transactions.stream().map(transaction -> transaction.getTrader().getName()).distinct().sorted().reduce("",(n1,n2)->n1+n2);
         System.out.println(tradeStr);
         //5有没有交易员是在米兰工作过的
         List<Trader> traders1 = transactions.stream().map(Transaction::getTrader).filter(t->"Milan".equals(t.getCity())).distinct().collect(Collectors.toList());
         System.out.println(traders1);
         
         boolean milanBased = transactions.stream().anyMatch(transaction -> "Milan".equals(transaction.getTrader().getCity()));
         System.out.println(milanBased);
         
         //6打印生活在剑桥的交易员的所有交易额
         List<Integer> valueList = transactions.stream().filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity())).map(Transaction::getValue).collect(Collectors.toList());
         System.out.println(valueList);
         transactions.stream().filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity())).map(Transaction::getValue).forEach(System.out::println);
         
         //7所有交易中，交易额最高的交易是？
         Optional<Integer> highestValue = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
         System.out.println(highestValue);
         
         //8找到交易额最小的交易
         Optional<Transaction> transaction = transactions.stream().min(Comparator.comparing(Transaction::getValue));
         System.out.println(transaction);
         
     }
 }
