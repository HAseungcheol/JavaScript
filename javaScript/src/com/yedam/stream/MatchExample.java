package com.yedam.stream;

import java.util.Arrays;

public class MatchExample {

	public static void main(String[] args) {
		int[] intArr = { 2, 4, 6,5 };
		boolean isTrue = Arrays.stream(intArr).noneMatch(n -> n % 2 == 0); // allMatch 최종 처리 리턴값은 true false
		if (isTrue) {													//nonMatch 모든조건 만족하는지 확인
			System.out.println("전체 짝수");
		} else {
			System.out.println("전체 홀수 아님");
		}

	}

}
