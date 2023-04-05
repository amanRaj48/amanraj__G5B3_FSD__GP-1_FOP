package com.greatLearning.deptStore.model;

public class SuperDept {

	protected String departmentName;
	protected String getTodaysWork;
	protected String getWorkDeadline;
	protected String isTodayAHoliday;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getGetTodaysWork() {
		return getTodaysWork;
	}

	public void setGetTodaysWork(String getTodaysWork) {
		this.getTodaysWork = getTodaysWork;
	}

	public String getGetWorkDeadline() {
		return getWorkDeadline;
	}

	public void setGetWorkDeadline(String getWorkDeadline) {
		this.getWorkDeadline = getWorkDeadline;
	}

	public String getIsTodayAHoliday() {
		return isTodayAHoliday;
	}

	public void setIsTodayAHoliday(String isTodayAHoliday) {
		this.isTodayAHoliday = isTodayAHoliday;
	}
}