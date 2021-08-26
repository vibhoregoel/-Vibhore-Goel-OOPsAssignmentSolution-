package com.vibhoregoel.admindept;

import com.vibhoregoel.superdept.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	protected String a = "Admin Department";
	protected String b = "Complete your Documents Submission";
	protected String c = "Complete by EOD";

	public String departName() {
		return a;
	}

	public String getTodaysWork() {
		return b;
	}

	public String getWorkDeadline() {
		return c;
	}

}
