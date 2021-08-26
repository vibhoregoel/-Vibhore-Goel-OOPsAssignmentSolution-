package com.vibhoregoel.superdept;

public class SuperDepartment {
	protected String a = "Super Department";
	protected String b = "No work as of now";
	protected String c = "Nik";
	protected String d = "Today is not a holiday";

	public String departmentName() {
		return a;
	}

	public String getTodaysWork() {
		return b;
	}

	public String getWorkDeadline() {
		return c;
	}

	public String isTodayAHoliday() {
		return d;
	}

}
