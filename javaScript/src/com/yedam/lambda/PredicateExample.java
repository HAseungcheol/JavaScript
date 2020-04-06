package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static final Student Student1 = null;
	static List<Student1> list = Arrays.asList(new Student1("홍길동", "남자", 90, 80), new Student1("김순희", "여자", 90, 85),
			new Student1("김자바", "남자", 95, 85), new Student1("박한나", "여자", 92, 85));

	static double avg(Predicate<Student1> pred) {
		int sum = 0, cnt = 0;
		for (Student1 student : list) {
			if (pred.test (student)) { // return 타입 : boolean
				sum += student.getEnglishScore();
				cnt++;
			} else {
			}

		}

		return (double) sum / cnt;
	}

	public static void main(String[] args) {
		double result = avg(new Predicate<Student1>() {

			@Override
			public boolean test(Student1 t) {
				if(t.getSex().equals("남자"))  //"여자"하면 여자값 나옴 (equals 문자 읽기 위해서 사용)
					return true;
				else
				return false;
			}
			
		});
		System.out.println("남자평균:"+ result);
		
		result = avg(t -> t.getSex().equals("여자"));
		System.out.println("여자평균:" + result);
	}	
}
