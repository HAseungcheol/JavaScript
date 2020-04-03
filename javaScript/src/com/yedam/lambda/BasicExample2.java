package com.yedam.lambda;

class Students {
	String name;
	int age;
	
	public void getInfo() {
	     System.out.println("이름은: " + this.name + ", 나이는: " + this.age);
	}
}

@FunctionalInterface // 타입체크 해주는 거
interface MyInterface1<T> {
	void get(Object t); // MyInterface 를 구현하는 것이 get
}

@FunctionalInterface // 타입체크 해주는 거
interface MyInterface2 {
	String get(String str, String str1); // MyInterface 를 구현하는 것이 get
}

interface Consumer<T> {
	void get(T t);
}

class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	void getInfo() {
		System.out.println("Name:"+this.name+", Age:"+this.age);
	}
}
//class ConsumerClass<T> implements Consumer<T> {
//
//	@Override
//	public void get(T t) {
//
//	}
//}

//class MyInterClass implements MyInterface1{ 
//
//	@Override
//	public void get() {
//	System.out.println("Hello");
//		
//	}	
//}
public class BasicExample2 {

	public static void main(String[] args) {
		MyInterface1<Students> mi = (s) -> {
			System.out.println("Hello" + s);
		};
		mi.get(new Students());
	

		MyInterface2 mi2 = new MyInterface2() { //익명객체 선언

			@Override
			public String get(String str, String str1) {
				return str.concat(str1);
			}

		};
		String result = mi2.get("Hello", "World");
		System.out.println(result);
		
	
		Consumer<String> mi3=(String s)->{
			System.out.println(s);
		};
		mi3.get("tttt");
	
	
	
	}

}


