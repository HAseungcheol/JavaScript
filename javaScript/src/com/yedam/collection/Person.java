package com.yedam.collection;

public class Person implements Comparable<Person> {
	
	private String name;
	 private int age;
	

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Person o) {     //comparable 인터페이스 구현하면 우선순위르 정해야 한다.
	//	return this.age - o.age; 
//		if(this.age>o.age) {
//			return 1;
//		}else if(this.age<o.age) {
//			return -1;
//		}else {
//			return 0;
//		}
	return this.name.compareTo(o.name); //이름으로 
	}
	
	
}
