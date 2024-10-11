package e05_class_array;

public class Student {
	private String studentName;
	private String studentNo;
	private String majorName;
	private double score;
	
	public Student(String studentName, String studentNo, String majorName, double score) {
		this.studentName = studentName;
		this.studentNo = studentNo;
		this.majorName = majorName;
		this.score = score;
	}

	public String getName() {
		return studentName;
	}

	public void setName(String studentName) {
		this.studentName = studentName;
	}

	public String getNumber() {
		return studentNo;
	}

	public void setNumber(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getMajor() {
		return majorName;
	}

	public void setMajor(String majorName) {
		this.majorName = majorName;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "이름 : " + studentName + " / 학번 : " + studentNo + " / 학과 : " + majorName + " / 점수 : " + score;
	}
	
}
