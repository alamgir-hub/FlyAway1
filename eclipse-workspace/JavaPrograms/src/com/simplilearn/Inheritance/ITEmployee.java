package com.simplilearn.Inheritance;

public class ITEmployee extends ITDeptA{

	public void showEmployee( String dept) {
		System.out.println("Employee of " + dept);
	}
	
	public static void main(String[] args) {
		ITEmployee emp = new ITEmployee();
		String dept = emp.showDept();
		emp.getCompany();
		emp.showEmployee(dept);
	}
}
