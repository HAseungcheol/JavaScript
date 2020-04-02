package com.yedam.lambda;

interface MyInterfaceReturn {
	int getResult(int a, int b);
}

public class BasicExpressExmaple1 {
	public static void main(String[] args) {
		MyInterfaceReturn mir = new MyInterfaceReturn() {
			@Override
			public int getResult(int a, int b) {
				return a + b ; //재정의 해야하는 부분 
			}
		};
	 int result =mir.getResult(10, 20);
	System.out.println(result);
	
	mir = (num1, num2) -> { //람다 형식
		return num1*num2;
	};
  	int result1 = mir.getResult(10, 20);  //getResult는 맨위의 인터페스 안의 변수랑 똑같이 함
	System.out.println("result:"+result1);
	}
}
