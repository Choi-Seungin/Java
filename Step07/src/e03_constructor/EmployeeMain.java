package e03_constructor;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee("1111", "김철수", "부장", "총무부", 8000);
		Employee emp2 = new Employee("2222", "김영희", "과장", "총무부", 6000);
		Employee emp3 = new Employee("3333", "유다희", "대리", "총무부", 4000);
		
		emp1.printEmployeeInfo();
		emp2.printEmployeeInfo();
		emp3.printEmployeeInfo();
		
	}

}
