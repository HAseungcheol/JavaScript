package com.yedam.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LoopingEcample {

	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5, };
		IntStream intStream = Arrays.stream(intArr);
		int sum = intStream.filter(n -> n % 2 == 0) // test()메소드를 구현하는 객체가 오면
				.peek(s -> System.out.println(s)) // peek 중간처리 결과가 안나옴
				.sum();
		System.out.println("결과값:" + sum);
		
		intStream = Arrays.stream(intArr);
		intStream.filter(n -> n %2==0)
			.forEach(s -> System.out.println(s)); //forEach 최종 처리(최종은 다음은 스트림을 처리 할 수 없다)
	}

}
