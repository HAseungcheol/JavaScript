package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student1 {
   private String name;
   private int englishScore;
   private int mathScore;

   public Student1() {}

   public Student1(String name, int englishScore, int mathScore) {
      super();
      this.name = name;
      this.englishScore = englishScore;
      this.mathScore = mathScore;
   }

   public String getName() {return name;}
   public int getEnglishScore() {return englishScore;}
   public int getMathScore() {return mathScore;}

}

public class FunctionExample {
   private static List<Student1> list = Arrays.asList(new Student1("홍길동", 90, 96), new Student1("신용권", 95, 93));

   public static void printString(Function<Student1, String> function) {
      for (Student1 Student1 : list) {System.out.print(function.apply(Student1) + " ");}
      System.out.println();
   }

   public static void printInt(ToIntFunction<Student1> function) {
      for (Student1 Student1 : list) {System.out.print(function.applyAsInt(Student1) + " ");}
      System.out.println();
   }

   public static void main(String[] args) {
      System.out.println("[학생 이름]");
      printString(t -> t.getName());

      System.out.println("[영어 점수]");
      printInt(t -> t.getEnglishScore());

      System.out.println("[수학 점수]");
      printInt(t -> t.getMathScore());
   }
}