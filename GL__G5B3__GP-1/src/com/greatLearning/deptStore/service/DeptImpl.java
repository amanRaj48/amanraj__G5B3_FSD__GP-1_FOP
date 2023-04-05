package com.greatLearning.deptStore.service;

import com.greatLearning.deptStore.model.AdminDept;
import com.greatLearning.deptStore.model.HrDept;
import com.greatLearning.deptStore.model.SuperDept;
import com.greatLearning.deptStore.model.TechDept;

public class DeptImpl implements DeptFunctions {

	public void displayAdminDepartment(AdminDept adminDepartment) {
		System.out.println(adminDepartment.getDepartmentName());
		System.out.println(adminDepartment.getGetTodaysWork());
		System.out.println(adminDepartment.getGetWorkDeadline());
		System.out.println(adminDepartment.getIsTodayAHoliday());
	}

	@Override
	public void displayHRDepartment(HrDept hrDepartment) {
		System.out.println(hrDepartment.getDepartmentName());
		System.out.println(hrDepartment.getDoActivity());
		System.out.println(hrDepartment.getGetTodaysWork());
		System.out.println(hrDepartment.getGetWorkDeadline());
		System.out.println(hrDepartment.getIsTodayAHoliday());
	}

	@Override
	public void displayTechDepartment(TechDept techDepartment) {
		System.out.println(techDepartment.getDepartmentName());
		System.out.println(techDepartment.getGetTodaysWork());
		System.out.println(techDepartment.getGetWorkDeadline());
		System.out.println(techDepartment.getGetTechStackInformation());
		System.out.println(techDepartment.getIsTodayAHoliday());

	}

	public void displaySuperDepartment(SuperDept superDepartment) {
		System.out.println(superDepartment.getDepartmentName());
		System.out.println(superDepartment.getGetTodaysWork());
		System.out.println(superDepartment.getGetWorkDeadline());
		System.out.println(superDepartment.getIsTodayAHoliday());

	}


}