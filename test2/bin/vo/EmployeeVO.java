package vo;

import java.util.Objects;

public class EmployeeVO {
	private String employeeNo;
	private String name;
	private String position;
	private String department;
	private int salary;

	public EmployeeVO(String employeeNo, String name, String position, String department, int salary) {
		super();
		this.employeeNo = employeeNo;
		this.name = name;
		this.position = position;
		this.department = department;
		this.salary = salary;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeNo);
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void printEmployeeInfo() {
		System.out.println(employeeNo + " " + name + " " + department + " " + salary);
	}
}