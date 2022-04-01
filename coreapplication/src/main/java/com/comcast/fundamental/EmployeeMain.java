package com.comcast.fundamental;

class Employee {
	int empId;
	String empName;
	String designation;
	public Employee() {		
		this(1201);						// perform to invoke a constructor method 		
		System.out.println("Default - Emplyee constructor method.");
	}
	public Employee(int empId) {
		this(empId, "Rahul");			// present first line in that method	
	}
	public Employee(int empId, String empName) {
		this(empId, empName, "Consultant");		
	}
	public Employee(int empId, String empName, String designation) {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
	}	
}

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employeeDef = new Employee();
//		Employee employeeOne = new Employee(1201);
//		Employee employeeTwo = new Employee(1201, "Rahul");
//		Employee employeeThree = new Employee(1201, "Rahul", "Consultant");
		
		System.out.println(employeeDef.empId+"|"+employeeDef.empName+"|"+employeeDef.designation);
//		System.out.println(employeeOne.empId+"|"+employeeOne.empName+"|"+employeeOne.designation);
//		System.out.println(employeeTwo.empId+"|"+employeeTwo.empName+"|"+employeeTwo.designation);
//		System.out.println(employeeThree.empId+"|"+employeeThree.empName+"|"+employeeThree.designation);
	}
}
