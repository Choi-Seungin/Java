package e01_class;

public class StudentMain {

	public static void main(String[] args) {
		Student std1 = new Student();//학생 데이터 저장할 인스턴스 생성
		
		//std1.studentNo = "20121218";
		//std1.studentName = "최승인";
		//std1.majorName = "게임기획과";
		//std1.score = 3.14;
		std1.init("20121218", "최승인", "게임기획과", 3.14);
		
		std1.printStudentInfo();
		
		Student std2 = new Student();
		
		//std2.studentNo = "20131218";
		//std2.studentName = "김철수";
		//std2.majorName = "컴퓨터공학과";
		//std2.score = 3.15;
		std2.init("20131218", "김철수", "컴퓨터공학과", 3.15);
				
		std2.printStudentInfo();
	}

}
