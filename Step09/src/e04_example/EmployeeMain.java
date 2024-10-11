package e04_example;

import java.util.ArrayList;

public class EmployeeMain {
	
	public static void main(String[] args) {
		PermanentWorker pw = new PermanentWorker(3600, "김철수");
		pw.printEmployeeInfo();
		
		PartTimeWorker ptw = new PartTimeWorker("유다희", 100, 15000);
		ptw.printEmployeeInfo();
		
		ForeignWorker fw = new ForeignWorker(4500, "박영수", 2);
		fw.printEmployeeInfo();
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(pw);
		list.add(ptw);
		list.add(fw);
		list.add(new ForeignWorker(3600, "문수영", 1));
		
		//반복문 - 모든 직원의 정보를 출력
		for(Employee emp : list) {
			emp.printEmployeeInfo();
		}
		
		//전체 지출되는 급여 금액 출력
		int totalPay = 0;
		for(Employee e : list)
			totalPay += e.getPay();
		
		System.out.println("이번달 전체 지출되는 급여 비용 : " + totalPay);
	
	}

}
