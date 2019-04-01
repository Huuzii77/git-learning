 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.example.demo.java8;

 import com.google.common.collect.Lists;

 import java.util.Arrays;
 import java.util.List;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/3/29 11:10
  */
 public class BookLambda {
     
     public List<Book> filter(List<Book> books,BookPredicate bookPredicate){
         List<Book> bookList = Lists.newArrayList();
         for (Book book:books){
             if (bookPredicate.test(book)){
                 bookList.add(book);
             }
             
         }
         return bookList;
     }
    
     List<Book> books = Arrays.asList(new Book("张三","z",34,"h"),
             new Book("张四","z",34,"h"),
             new Book("张五","z",38,"h"),
             new Book("张六","z",34,"h")
     );
    
     // 根据作者过滤
     final String author = "张三";
     List<Book> result = filter(books, new BookPredicate() {
         @Override
         public boolean test(Book book) {
             return author.equals(book.getAuthor());
         }
     });
     
     // 根据图书价格过滤
     final Integer price = 40;
     List<Book> result2 = filter(books, new BookPredicate() {
         @Override
         public boolean test(Book book) {
             return price>book.getPrice();
         }
     });
    
     
     //使用lambda表达式
     List<Book> getResult = filter(books,book->author.equals(book.getAuthor()));
     
     List<Book> getResult2 = filter(books,book->price>book.getPrice());
    
     
 }
