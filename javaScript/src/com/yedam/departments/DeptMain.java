package com.yedam.departments;

import java.util.List;

public class DeptMain {
	public static void main(String[] args) {
		// 전체 조회
		DeptDAO d = new DeptDAO();
		List<Departments> dlist = d.getDepartmentsList();
		for (Departments dept : dlist) {
			System.out.println(dept);
		}
	}
}