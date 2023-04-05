package com.greatLearning.deptStore.service;

import com.greatLearning.deptStore.model.AdminDept;
import com.greatLearning.deptStore.model.HrDept;
import com.greatLearning.deptStore.model.TechDept;

public interface DeptFunctions {

	public void displayAdminDepartment(AdminDept adminDepartment);

	public void displayHRDepartment(HrDept hrDepartment);

	public void displayTechDepartment(TechDept techDepartment);
}