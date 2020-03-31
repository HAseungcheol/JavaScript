package com.yedam.departments;

public class Departments {
	int depatmentId;
	String departmentName;
	int managerId;
	int locationId;
	
	public int getDepatmentId() {
		return depatmentId;
	}
	public void setDepatmentId(int depatmentId) {
		this.depatmentId = depatmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	@Override
	public String toString() {
		return "Departments [depatmentId=" + depatmentId + ", departmentName=" + departmentName + ", managerId="
				+ managerId + ", locationId=" + locationId + "]";
	}
}