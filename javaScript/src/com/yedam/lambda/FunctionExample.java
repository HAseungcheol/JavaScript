package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student1 {
	 String name;
	String sex;
	 int englishScore;
	int mathScore;
	
	public Student1() {
	}

	
	
	public Student1(String name, int englishScore, int mathScore) {
		super();
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}



	public Student1(String name, String sex, int englishScore, int mathScore) { // 생성자
		super();
		this.name = name;
		this.sex = sex;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
		
	}

	public String getName() {
		return name;
	} // get 메소드

	public int getEnglishScore() {
		return englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}



	public String getSex() {
		return sex;
	}


}

public class FunctionExample {
	private static List<Student1> list = Arrays.asList(new Student1("홍길동", 90, 96), new Student1("신용권", 95, 93));

	public static void printString(Function<Student1, String> function) { // function 인터페이스
		for (Student1 Student1 : list) {
			System.out.print(function.apply(Student1) + " ");
		}
		System.out.println();
	}

	public static void printInt(ToIntFunction<Student1> function) {
		for (Student1 Student1 : list) {
			System.out.print(function.applyAsInt(Student1) + " ");
		}
		System.out.println();
	}

	public static double avg(ToIntFunction<Student1> func) {
		double avg = 0;
		int sum = 0;
		for (Student1 sudent : list) {
			sum += func.applyAsInt(new Student1());
		}
		avg = (double) sum * list.size();
		return avg;
	}

	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		printString(t -> t.getName());

		System.out.println("[영어 점수]"); // 익명객체를 람다 형식으로
		printInt(t -> t.getEnglishScore());

		System.out.println("[수학 점수]"); // 익명객체 사용
		printInt(new ToIntFunction<Student1>() {
			@Override
			public int applyAsInt(Student1 value) {
				return value.getMathScore();
			}
		});
	}

	// ToIntFunction<Student>를 구현하는 MathIntClass 정의
	class MathIntClass <T> implements ToIntFunction<T>{

		@Override
		public int applyAsInt(T value) {
			Student1 s = (Student1) value;
			return s.getEnglishScore();
		}

	}
}