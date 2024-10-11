package e01_object;

public class StudentMain {

	public static void main(String[] args) {
		Student std1 = new Student("1234", "김철수", "컴공", 3.4);
		Student std2 = new Student("1234", "김철수", "컴공", 3.4);
		Student std3 = std2;
		
		System.out.println(std1.equals(std2));
		System.out.println(std1.equals(std3));
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
	}

}
