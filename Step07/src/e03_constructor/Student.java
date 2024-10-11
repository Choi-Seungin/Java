package e03_constructor;

public class Student {
	String studentNo;
	String studentName;
	String majorName;
	double score;
	
	Student(String studentNo, String name, String major, double s){
		//this 자기 자신 객체를 나타내는 키워드
		this.studentNo = studentNo;
		studentName = name;
		majorName = major;
		score = s;
	}
	void printStudentInfo() {
		System.out.printf("%s %s %s %.2f\n", studentNo, studentName, majorName, score);
	}
}
