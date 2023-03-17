package departmentstore.model;

public class AdminDepartment extends SuperDepartment{
	public String departmentName() {
		return "Admin Department";
	}
	public String getTodaysWork() {
		return "Complete your Documents Submission";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
