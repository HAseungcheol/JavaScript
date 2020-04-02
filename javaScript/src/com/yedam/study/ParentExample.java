package com.yedam.study;

public class ParentExample {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.name = "hong";

		showInfo(new Parent() { //익명객체 한번만 사용할 목적으로 
			int age;

			int getAge() {
				return age;
			}

			@Override
			String getName() {
				String newName = "Hwang";
				return super.getName();
			}

		});
		EmpService empService = new EmpServiceImpl();
//		getEmp(empService);
		
		getEmp(new EmpService() { //중괄호 안에 정의 해준다
			@Override
			public void getEmployee(int empId) {
				System.out.println("empId:"+empId);
				
			}
		
		});
		showInfo (new Parent());
	}
	static void getEmp(EmpService emp) {
		emp.getEmployee(101);
	};
	static void showInfo(Parent p) {
		System.out.println(p.getName());
	}
}
