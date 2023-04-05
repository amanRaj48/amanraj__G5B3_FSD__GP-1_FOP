package com.greatLearning.deptStore.client;

import com.greatLearning.deptStore.model.AdminDept;
import com.greatLearning.deptStore.model.HrDept;
import com.greatLearning.deptStore.model.SuperDept;
import com.greatLearning.deptStore.model.TechDept;
import com.greatLearning.deptStore.service.DeptImpl;

public class Main {

	public static void main(String[] args) {

		SuperDept superDepartment = new SuperDept();
		AdminDept adminDepartment = new AdminDept();
		DeptImpl departmentImpl = new DeptImpl();
		HrDept hrDepartment = new HrDept();
		TechDept techDepartment = new TechDept();

		superDepartment.setDepartmentName("Super Department");
		superDepartment.setGetTodaysWork("Complete your documents Submission");
		superDepartment.setGetWorkDeadline("Nil");
		superDepartment.setIsTodayAHoliday("Today is not a holiday");
		// departmentImpl.displaySuperDepartment(superDepartment);
		// System.out.println();

		adminDepartment.setDepartmentName("Welcome to Admin Department");
		adminDepartment.setGetTodaysWork("Complete your documents Submission");
		adminDepartment.setGetWorkDeadline("Complete by EOD");
		adminDepartment.setIsTodayAHoliday("Today is not a holiday");
		departmentImpl.displayAdminDepartment(adminDepartment);
		System.out.println();

		hrDepartment.setDepartmentName("Welcome to HR Department");
		hrDepartment.setDoActivity("team Lunch");
		hrDepartment.setGetTodaysWork("Fill today\'s timesheet and mark your attendance");
		hrDepartment.setGetWorkDeadline("Complete by EOD");
		hrDepartment.setIsTodayAHoliday("Today is not a holiday");
		departmentImpl.displayHRDepartment(hrDepartment);
		System.out.println();

		techDepartment.setDepartmentName("Welcome to Tech Department");
		techDepartment.setGetTodaysWork("Complete coding of Module 1");
		techDepartment.setGetWorkDeadline("Complete by EOD ");
		techDepartment.setGetTechStackInformation("Core Java");
		techDepartment.setIsTodayAHoliday("Today is not a holiday");
		departmentImpl.displayTechDepartment(techDepartment);

	}

}