package com.yedam.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class LambdaExpressionExample {
   public static void main(String[] args) {
      List<Student> list = Arrays.asList(new Student("Hong", 90), new Student("Hwang", 80));
      Stream<Student> stream = list.stream();
//      stream.forEach(s -> {
//         String name = s.getName();
//         int score = s.getScore();
//         System.out.println(name + ", " + score);
//      });
      list.parallelStream().forEach(s ->{ //위를 더 쉽게 표현하기
         String name = s.getName();
         int score = s.getScore();
         System.out.println(name + ", " + score);  
      });
   }
}