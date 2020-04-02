package com.yedam.study;

import java.util.List;

public class StudentServiceImpl implements StudentService{

	EmpDAO dao = new EmpDAO();
	
	@Override //전체 조회
	public List<Student> getStudlist() {	
		return dao.getEmpList();
	}

	@Override //한건 조회
	public Student getStudent(int id) {
	
		return dao.getBoardInfo(id);
	}

}
