package com.yedam.lambda;



public class BasicExpressExmaple {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("runnable call.");
			}
		};
		runnable.run();
		
		Runnable runnable1 = () -> {  //람바 형식 /필요없는 것들은 뺌 / 위와 다르게 오버라이드 안함 /
				System.out.println("runnable lambda call."); //한개 이상의 인터페이스에서는 람다 사용x
		};
		runnable1.run();
		
	} //메인 끝
}
