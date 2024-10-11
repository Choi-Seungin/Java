package service;

import java.util.ArrayList;
import java.util.Scanner;

import dto.Student;

public class StudentService {
	//싱글톤 패턴 적용
	private static StudentService instance;
	private ArrayList<Student> list;
	
	private StudentService() {
		list = new ArrayList<Student>();
		//샘플데이터
		list.add(new Student("S001", "홍길동", "컴공과", 3.5));
		list.add(new Student("S002", "김철수", "국문학", 3.8));
		list.add(new Student("S003", "이영희", "수학과", 4.0));
	}

	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}

	//학생정보를 학번으로 검색
	private Student searchStudent(String studentNo) {
		//매개변수로 받은 학번과 동일한 학번이 있으면 해당 객체를 student에 저장
		//for(int i=0;i<list.size();i++) {
		//if(list.get(i).getStudentNo().equals(studentNo))
		//return list.get(i);
		//}
		for(Student std : list) {
			if(std.getStudentNo().equals(studentNo)) {
				return std;//검색 결과가 있을때 해당 객체 리턴
			}
		}		
		return null;//검색 결과 없을때
	}
	
	public void searchStudent() {
		Scanner sc = new Scanner(System.in);
		String studentNo;
		//학번 입력 받음
		System.out.println("학생 정보 검색을 시작합니다.....");
		System.out.print("검색할 학번 입력 : ");
		studentNo = sc.nextLine(); 
		
		Student std = searchStudent(studentNo);
		
		if(std == null)
			System.out.println("해당 학생 정보가 없습니다.");
		else
			System.out.println(std);
	}
	
	public void insertStudent() {
		//학생정보 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 추가를 진행합니다........");
		//학번, 이름, 학과명, 점수를 입력
		String studentNo = "";
		while(true) {
			System.out.print("등록할 학번 입력 : ");
			studentNo = sc.nextLine();
		//학번 중복 체크
			if(searchStudent(studentNo) != null) {
				System.out.println("학번이 중복되었습니다. 다시 입력해 주세요.");
				continue;
			}
			break;
		}
		System.out.print("등록할 학생이름 입력 : ");
		String studentName = sc.nextLine();
		System.out.print("등록할 학과명 입력 : ");
		String majorName = sc.nextLine();
		System.out.print("등록할 학생 평점 입력 : ");
		double score = sc.nextDouble();
		sc.nextLine();
		
		
		//리스트에 학생정보 추가
		list.add(new Student(studentNo, studentName, majorName, score));
	
	}

	public void deleteStudent() {
		Scanner sc = new Scanner(System.in);
		String studentNo;
		//학번 입력 받음
		System.out.println("학생 정보 삭제를 시작합니다.....");
		System.out.print("삭제할 학번 입력 : ");
		studentNo = sc.nextLine();
		Student std = searchStudent(studentNo);
		
		if(std == null) {
			System.out.println("해당 학생 정보가 없습니다.");
		}else {
			list.remove(std);
			System.out.println("삭제가 완료되었습니다.");
		}
	}

	public void updateStudent() {
		Scanner sc = new Scanner(System.in);
		String studentNo;
		//학번 입력 받음
		System.out.println("학생 정보 수정을 시작합니다.....");
		System.out.print("수정할 학번 입력 : ");
		studentNo = sc.nextLine();
		Student std = searchStudent(studentNo);

		if(std == null) {
			System.out.println("해당 학생 정보가 없습니다.");
			return;
		}else {
			System.out.print("수정할 이름 입력 : ");
			String studentName = sc.nextLine();
			std.setStudentName(studentName);
			System.out.print("수정할 학과명 입력 : ");
			String majorName = sc.nextLine();
			std.setMajorName(majorName);
			System.out.print("수정할 학생 평점 입력 : ");
			double score = sc.nextDouble();
			std.setScore(score);
			
			System.out.println("학생정보 수정이 완료되었습니다.");
		}
		
	}

	public void printAllStudent() {
		//전체 학생정보 출력
		for(Student std : list) {
			System.out.println(std);
		}
	}

	public void searchStudentName() {
		System.out.println("학생 이름 검색을 시작합니다.");
		Scanner sc = new Scanner(System.in);
		//학생 이름 일부 입력
		System.out.print("학생 이름 일부 : ");
		String name = sc.nextLine();
		
		int count = 0;
		//반복문
		for(Student std : list) {
			//입력한 검색어가 학생 이름에 있는지 확인 후 출력
			if(std.getStudentName().indexOf(name) != -1) {
				System.out.println(std);
				count++;
			}
		}
		//검색 결과가 없으면, '해당 검색결과가 없습니다.' 메세지 출력
		if(count == 0) System.out.println("해당 검색 결과가 없습니다.");
		else System.out.println(count +"건이 검색 되었습니다.");
	}

}
