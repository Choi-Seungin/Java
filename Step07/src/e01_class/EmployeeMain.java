package e01_class;

public class EmployeeMain {

	 public static void main(String[] args) {
	        Employee emp1 = new Employee();
	        emp1.employeeDate("20210909", "김철수", "총무부", true, "부장", 9000);
	        emp1.employeeInfo();
	        System.out.println(emp1.updateSalary(7000));
	        System.out.println(emp1.updateSalary(1000));
	        
	        Employee emp2 = new Employee();
	        emp2.employeeDate("20230910", "김영희", "총무부", false, "과장", 6000);
	        emp2.employeeInfo();
	        
	 }
}