package service;

import java.util.ArrayList;
import java.util.Scanner;

import dto.Student;

public class StudentService {
	private static StudentService instance;
	private ArrayList<Student> list;
	
	private StudentService() {
		list = new ArrayList<Student>();
		//샘플데이터 3~4건
		list.add(new Student("S001", "홍길동", "컴퓨터공학과", 3.5));
		list.add(new Student("S002", "김철수", "전자공학과", 3.8));
		list.add(new Student("S003", "이영희", "수학과", 4.0));
	}

	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
			return instance;
	}
	
	
	public void insertStudent() {
		//학생정보 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 추가를 진행합니다........");
		//1. 학번, 이름, 학과명, 점수를 입력
		String studentNo = "";
		while(true) {
			System.out.print("등록할 학번 입력 : ");
			studentNo = sc.nextLine();
			//학번 중복 체크
			//list에서 contains, indexOf에서 실행되는 equals는 
			//리스트 요소의 equals가 아니라 
			//비교할 대상의 equals를 쓰기 때문에 String으로 검색 할 수 없다.
			if(list.contains(new Student(studentNo, null, null, 0))) {
				System.out.println("학번이 중복되었습니다. 다시 입력해 주세요");
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

	public void searchStudent() {
		Scanner sc = new Scanner(System.in);
		String studentNo;
		//학번 입력 받음
		System.out.println("학생 정보 검색을 시작합니다.....");
		System.out.print("검색할 학번 입력 : ");
		studentNo = sc.nextLine(); 
		
		int idx = list.indexOf(new Student(studentNo, null, null, 0));
		
		if(idx == -1)
			System.out.println("해당 학생 정보가 없습니다.");
		else
			System.out.println(list.get(idx));
	}

	public void deleteStudent() {
		Scanner sc = new Scanner(System.in);
		String studentNo;
		//학번 입력 받음
		System.out.println("학생 정보 삭제를 시작합니다.....");
		System.out.print("삭제할 학번 입력 : ");
		studentNo = sc.nextLine(); 
		
		if(list.remove(new Student(studentNo, null, null, 0)))
			System.out.println("학생 정보를 삭제하였습니다.");
		else
			System.out.println("삭제할 학생 정보가 없습니다.");
		
	}

	public void updateStudent() {
		Scanner sc = new Scanner(System.in);
		String studentNo;
		//학번 입력 받음
		System.out.println("학생 정보 수정을 시작합니다.....");
		System.out.print("수정할 학번 입력 : ");
		studentNo = sc.nextLine(); 
		
		int idx = list.indexOf(new Student(studentNo, null, null, 0));
		if(idx == -1) {
			System.out.println("수정할 학생 정보가 없습니다.");
			return;
		}
		
		Student std = list.get(idx);
		
		System.out.print("수정할 이름 입력 : ");
		String studentName = sc.nextLine();
		list.get(idx).setStudentName(studentName);
		System.out.print("수정할 학과명 입력 : ");
		String majorName = sc.nextLine();
		std.setMajorName(majorName);
		System.out.print("수정할 학생 평점 입력 : ");
		double score = sc.nextDouble();
		std.setScore(score);
		
		System.out.println("학생정보 수정이 완료되었습니다.");
		
	}

	public void printAllStudent() {
		//전체 학생 정보 출력
		for(Student std : list) {
			System.out.println(std);
		}
		
	}

	public void searchStudentName() {
		System.out.println("학생 이름 일부로 검색을 시작합니다.");
		Scanner sc = new Scanner(System.in);
		//학생 이름 일부 입력
		System.out.print("학생 이름 일부 : ");
		String name = sc.nextLine();
		
		int count = 0;
		//반복문
		for(int i=0;i<list.size();i++) {
		//	입력한 검색어가 학생 이름에 있는지 확인 후 출력
			if(list.get(i).getStudentName().indexOf(name) != -1) {
				System.out.println(list.get(i));
				count++;
			}
		}
		
		//검색 결과가 없으면, '해당 검색결과가 없습니다.' 메세지 출력
		if(count == 0) System.out.println("해당 검색 결과가 없습니다.");
		else System.out.println(count +"건이 검색 되었습니다.");
	}

	
	
}