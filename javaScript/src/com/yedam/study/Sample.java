package com.yedam.study;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static int sum(int a, int b) {
		return a + b;
	}

	public static int minus(int a, int b) {
		return a - b;
	}
	
	
	public static void main(String[] args) {
	//	int result = sum(3,9);
	//	Sample s = new Sample(); //마이너스 메소드 사용하기위해 인스턴스 하나 생성(메소드 정의할때 static사용하면 할 필요x)
	//	int result1 = minus(6,2);
//		EmpDAO dao = new EmpDAO();
//		List<Student> list = dao.getEmpList();
//		for(Student s : list) {
//			System.out.println(s.toString());
//		}
		
	StudentService service = new StudentServiceImpl();
//	 List<Student> list =  service.getStudlist();
//	 for (Student s : list) {
//		 System.out.println(s.toString());
//	 }
	Student std = service.getStudent(100);
	System.out.println(std);	
		
//		Person p1 = new Person();
//		p1.setName("Hong");
//		p1.setAge(10);
//		Person p2 = new Person("Hwang",20);
//		
//		String n = p1.getName(); //좌우 타입 잘 맞추기
//		int a = p1.getAge();
//		
//		System.out.println(p2.getName()+","+p2.getAge());
//		
//		Student s1 = new Student();
//		s1.setName("Park");
//		s1.setAge(20);
//		s1.setSchool("yedam");
//		Student s2 = new Student("Kim",22,"yedam");
//		
//		
//		
//		Person[] persons = new Person[5];
//		persons[0] = p1;
//		persons[1] = s1;
//		persons[2] = new Student();
//		persons[3] = new Person("Lee",25);
//		persons[4] = new Person();
//		String searchName = "park";
//		for(Person p : persons) {
//			if(p.getName() != null && p.getName().contentEquals(searchName))
//			System.out.println("찾을이름:"+searchName+"=>결과:"+p.toString());
//		
//	List<Person> list = new ArrayList<>();	
//		list.add(p1);
//		list.add(p2);
//		list.add(s1);
//		list.add(s2);
//		list.remove(1);
//		for(Person f : list) {
//			System.out.println(p.toString());
//		}
//		}
	}
}
