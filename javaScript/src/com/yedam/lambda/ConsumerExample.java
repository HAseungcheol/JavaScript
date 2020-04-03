package com.yedam.lambda;

import java.util.function.BiConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		BiConsumer<Student, String> biCon = null;
//				(std, str) -> {
//			System.out.println(str + " ");
//			std.getInfo();
//		};
		Student s1 = new Student("Hwang", 20);
		String s2 = "안녕하세요";
//		biCon.accept(s1, s2);
		printAccept(biCon, s1, s2); // 매개값으로도 할수 있다.

		BiConsumer<String, String> biStr = (str1, str2) -> {
			System.out.println(str1 + " " + str2);
		};
		biStr.accept("람다는", "헷갈려!");
	}

	static void printAccept(BiConsumer<Student, String> biCon, Student std, String str) {
		biCon = (s1, s2) -> {
			System.out.println(str + " ");
			s1.getInfo();
		};
		biCon.accept(std, str);
	}
}
