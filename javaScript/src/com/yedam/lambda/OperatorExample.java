package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

class IntBinaryClass implements IntBinaryOperator {

	@Override
	public int applyAsInt(int left, int right) {
		if (left >= right) {
			return left;
		} else {
			return right;
		}
	}
}

public class OperatorExample {
	static int[] scores = { 92, 95, 87 };

	public static int maxOrmin(IntBinaryOperator oper) {
		int result = scores[0];
		for (Integer score : scores) {
			result = oper.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		IntBinaryClass iclass = new IntBinaryClass();
		int result = maxOrmin(iclass);

		int result1 = maxOrmin(new IntBinaryOperator() {   //익명객체

			@Override
			public int applyAsInt(int left, int right) {
				if (left >= right) {
					return right;
				} else {
					return left;
				}
			}
		});
		
		int result2 = maxOrmin  (( left, right)-> {  //람다형식
			if(left>= right) {
				return right;
			}else {
				return left;
			}
		});
		System.out.println("최대값:" +result);
		System.out.println("최소값:" + result1);
	}
}
