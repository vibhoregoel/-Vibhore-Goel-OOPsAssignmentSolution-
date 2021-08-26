package com.vibhoregoel.techdept;

import com.vibhoregoel.superdept.SuperDepartment;

public class TechDepartment extends SuperDepartment {
	protected String a = "Tech Department";
	protected String b = "Complete coding of module 1";
	protected String c = "Complete by EOD";
	protected String d = "Core Java";

	public String departmentName() {
		return a;
	}

	public String getTodaysWork() {
		return b;
	}

	public String getWorkDeadline() {
		return c;
	}

	public String getTechStackInformation() {
		return d;
	}
}
