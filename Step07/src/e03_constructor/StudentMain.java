package e03_constructor;

public class StudentMain {

	public static void main(String[] args) {
		Student st1 = new Student("20240910", "김철수", "컴공과", 3.4);
		Student st2 = new Student("20240910", "김영희", "연극과", 4.9);
		
		st1.printStudentInfo();
		st2.printStudentInfo();
	}

}
