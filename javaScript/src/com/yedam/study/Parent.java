package com.yedam.study;

interface EmpService {
	void getEmployee(int empId);
}

//class Child extends Parent {
//	int age;
//
//	int getAge() {
//		return age;
//	}
//
//	@Override
//	String getName() {	
//		return super.getName() + ", age:"+ this.age;
//	}

//}

public class Parent {
	String name;

	String getName() { // 메소드정의
		return name; // getName이 위의 name을 받음
	}

	void setName(String name) {
		this.name = name;
	}
}
