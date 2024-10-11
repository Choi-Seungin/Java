package e03_constructor;

public class Employee {
	//사번
	String employeeNo;
	//사원명
	String employeeName;
	//직급명
	String positionName;
	//부서명
	String departmentName;
	//급여
	int employeeSalary;
	//모든 필드 초기화하는 생성자
	public Employee(String employeeNo, String employeeName, String positionName, 
			String departmentName, int employeeSalary) {
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.positionName = positionName;
		this.departmentName = departmentName;
		this.employeeSalary = employeeSalary;
	}
	//사원정보 출력하는 메서드
	void printEmployeeInfo() {
		System.out.printf("%s %s %s %s %d\n", employeeNo, employeeName, positionName, 
				departmentName, employeeSalary);
	}
	//EmployeeMain 클래스 작성해서 작성한 Employee 클래스 생성해서 테스트
}
