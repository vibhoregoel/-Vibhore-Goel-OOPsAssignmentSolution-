package com.vibhoregoel.mains;

import com.vibhoregoel.HRdept.HrDepartment;
import com.vibhoregoel.admindept.AdminDepartment;
import com.vibhoregoel.techdept.TechDepartment;

public class MainsDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment obj1 = new AdminDepartment();
		HrDepartment obj2 = new HrDepartment();
		TechDepartment obj3 = new TechDepartment();
		System.out.println("Welcome to " + obj1.departName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		System.out.println();
		System.out.println();
		System.out.println("Welcome to " + obj2.departmentName());
		System.out.println(obj2.doActivity());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		System.out.println();
		System.out.println();
		System.out.println("Welcome to " + obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getTechStackInformation());
		System.out.println(obj3.isTodayAHoliday());

	}

}
