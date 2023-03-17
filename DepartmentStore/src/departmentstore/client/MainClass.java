/*
 * @author--AmanRaj
 * Department Store Project
 * Object of Different Class Initialized under Driver Main Class
 */
package departmentstore.client;

import departmentstore.model.SuperDepartment;
import departmentstore.model.AdminDepartment;
import departmentstore.model.HrDepartment;
import departmentstore.model.TechDepartment;

public class MainClass {
	public static void main(String[] args) {
		SuperDepartment myDept=new SuperDepartment();
		AdminDepartment myDept01=new AdminDepartment();
		HrDepartment myDept02=new HrDepartment();
		TechDepartment myDept03=new TechDepartment();
		
		System.out.println(myDept.departmentName());
		System.out.println(myDept01.departmentName());
		System.out.println(myDept02.departmentName());
		System.out.println(myDept03.departmentName());
		
		System.out.println(myDept.getTodaysWork());
		System.out.println(myDept01.getTodaysWork());
		System.out.println(myDept02.getTodaysWork());
		System.out.println(myDept03.getTodaysWork());
		
		System.out.println(myDept.getWorkDeadline());
		System.out.println(myDept01.getWorkDeadline());
		System.out.println(myDept02.getWorkDeadline());
		System.out.println(myDept03.getWorkDeadline());
		
	}

}
