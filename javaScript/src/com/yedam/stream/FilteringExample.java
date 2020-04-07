package com.yedam.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FilteringExample {
	public static void main(String[] args) {
	List<String> list=Arrays.asList("홍길동","신용권","김자바","신용권","신민철");
	
	Stream<String>stream = list.stream();
	stream.distinct()  //distinct 중복 제거,중간처리
	.filter(s -> s.startsWith("신")) //중간처리("신"으로 시작하는 요소만들고옴)
//	.forEach(s -> System.out.println(s)); 
	.forEach(new Consumer<String>() {

		@Override
		public void accept(String t) {
			System.out.println(t.toString());  //람다 풀어서 정의
			
		}
		
	});
	
	}
}
