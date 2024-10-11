package e01_class;

public class Student {
	//클래스 안에 선언된 변수는 해당 객체가 일을 할 때 사용되는 변수인데
	//이것을 field(필드) 라고 함
	//학번
	String studentNo;
	//이름
	String studentName;
	//학과명
	String majorName;
	//평점
	double score;
	
	/*
	 * 메서드(method)
	 * 		특정 기능에 해당하는 코드를 묶어서 나타내는 것을 메서드라고 함
	 * 		클래스가 수행할 특정 기능 1개를 표현
	 * 		메서드를 만들때는 반드시 하나의 기능만 담당하게끔 만듦
	 * 리턴타입 메서드명([매개변수...]){
	 * 		실행문...
	 * 		[return [값];]
	 * }
	 * 
	 */
	//리턴 x, 매개변수x
	void printStudentInfo() {
		System.out.println(studentNo + " " + studentName + " " +
					majorName + " " + score);
	}
	//리턴 x, 매개변수 o
	void init(String no, String name, String major, double s) {
		//학생데이터 초기화
		studentNo = no;
		studentName = name;
		majorName = major;
		if(s >= 0 && s <= 4.5)
			score = s;
		
	}

}
