package e04_example;

public class Employee {
	//연봉
	protected int salary;
	//이름
	protected String name;
	
	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}

	//연봉 계산해서 리턴하는 메서드
	public int getPay() {
		return salary;
	}
	
	//이름 / 연봉정보 출력
	public void printEmployeeInfo() {
		System.out.println(name + " / " + getPay());
	}
	
	//직원이 할일
	public void work() {
		System.out.println("직언이 일을 합니다.");
	}

}
