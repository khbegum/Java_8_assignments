package com.training.myapp;

public class EmployeeInformation {
	private int empID;
	private String empName;
	private String empDesignation;
	private double empSalary;
	private String empCommunications;
	
	
	public EmployeeInformation(int empID, String empName, String empDesignation, double empSalary,
			String empCommunications) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
		this.empCommunications = empCommunications;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public double getEmpSalary() {
		System.out.println(empSalary);
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpCommunications() {
		return empCommunications;
	}

	public void setEmpCommunications(String empCommunications) {
		this.empCommunications = empCommunications;
	}

	public static void main(String[] args) {
		
	}

}
