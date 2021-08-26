package com.vibhoregoel.HRdept;

import com.vibhoregoel.superdept.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	protected String a = "Hr Department";
	protected String b = "Fill today's worksheet and mark your attendance";
	protected String c = "Complete by EOD";
	protected String d = "Team lunch";

	public String departmentName() {
		return a;
	}

	public String getTodaysWork() {
		return b;
	}

	public String getWorkDeadline() {
		return c;
	}

	public String doActivity() {
		return d;
	}
}
