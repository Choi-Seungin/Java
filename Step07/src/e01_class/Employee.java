package e01_class;

import java.util.Scanner;

public class Employee {
	String employeeNo;
	String employeeName;
	String departmentName;
	boolean employeeGender;
	String positionName;
	int employeeSalary;
	
	//사원 정보 출력
	void employeeInfo() {
        System.out.printf("%s %s(%s) %s %s %d\n", employeeNo, employeeName, checkGender(), 
        		positionName, departmentName, employeeSalary);
    }
	
	//사원 정보
	void employeeDate(String no, String name, String department, boolean gender, 
			String position, int salary) {
        employeeNo = no;
        employeeName = name;
        employeeGender = gender; 
        departmentName = department;
        positionName = position;
        employeeSalary = salary;
    }
	
	//성별 체크하는 메서드
	String checkGender() {
		String result = "여";
		if(employeeGender)
			result = "남";
		return result;
	}
	
	//연봉 정보 수정하는 메서드
	//연봉값은 2400이상인 값이 들어와야 합니다.
	boolean updateSalary(int salary) {
		if(salary >= 2400) {
			employeeSalary = salary;
			return true;
		}
		return false;
	}
}
