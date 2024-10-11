package e01_object;

import java.util.Objects;

public class Student {
	//학번
	private String studentNo;
	//이름
	private String studentName;
	//학과
	private String majorName;
	//점수
	private double score;
	
	public Student(String studentNo, String studentName, String majorName, double score) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.majorName = majorName;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", studentName=" + studentName + ", majorName=" + majorName
				+ ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		System.out.println(super.hashCode());
		return Objects.hash(majorName, score, studentName, studentNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return Objects.equals(majorName, other.majorName)
				&& Double.doubleToLongBits(score) == Double.doubleToLongBits(other.score)
				&& Objects.equals(studentName, other.studentName) && Objects.equals(studentNo, other.studentNo);
	}

	
}
