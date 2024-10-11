package service;

import java.util.Scanner;

import dto.Student;

/*
 * 	학생 데이터를 배열로 관리
 * 	작업 배열에 학생 데이터 추가, 삭제, 검색, 수정
 * 
 */
public class StudentService {
	//학생정보 저장할 배열
	private Student[] arr;
	//배열을 관리할 인덱스
	private int idx;
	
	public StudentService() {
		arr = new Student[5];
		arr[0] = new Student("S001", "홍길동", "컴퓨터공학과", 3.5);
        arr[1] = new Student("S002", "김철수", "전자공학과", 3.8);
        arr[2] = new Student("S003", "이영희", "수학과", 4.0);
        idx = 3;
	}
	
	//추가
	//		학번, 이름, 학과명, 점수를 입력받아서
	//		배열에 추가
	public void insertStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 추가를 진행합니다........");
		//1. 학번, 이름, 학과명, 점수를 입력
		System.out.print("등록할 학번 입력 : ");
		String studentNo = sc.nextLine();
		System.out.print("등록할 학생이름 입력 : ");
		String studentName = sc.nextLine();
		System.out.print("등록할 학과명 입력 : ");
		String majorName = sc.nextLine();
		System.out.print("등록할 학생 평점 입력 : ");
		double score = sc.nextDouble();
		//2. Student 객체 생성
		//Student student = new Student(studentNo, studentName, majorName, score);
		//3. 배열에 등록
		//arr[idx] = student;
		//4. idx 증가
		//idx++;
		//배열 길이 늘리기
		if(idx == arr.length) {
			Student[] temp = new Student[arr.length+5];
			System.arraycopy(arr, 0, temp, 0, arr.length);
			arr = temp;
		}
		arr[idx++] = new Student(studentNo, studentName, majorName, score);
		
	}//insertStudent
	
	//삭제
	public void deleteStudent() {
		Scanner sc = new Scanner(System.in);
		String studentNo;
		//학번 입력 받음
		System.out.println("학생 정보 삭제를 시작합니다.....");
		System.out.print("삭제할 학번 입력 : ");
		studentNo = sc.nextLine(); 
		
		int index = searchStudent(studentNo);
		
		if(index == -1) {
			System.out.println("해당 학생 정보가 없습니다.");
			return;
		}
		for(int i = index; i < idx-1; i++) {
			arr[i] = arr[i+1];
		}
		idx--;
		System.out.println("삭제가 완료되었습니다.");
	}
	
	//수정
	public void updateStudent() {
		Scanner sc = new Scanner(System.in);
		String studentNo;
		//학번 입력 받음
		System.out.println("학생 정보 수정을 시작합니다.....");
		System.out.print("수정할 학번 입력 : ");
		studentNo = sc.nextLine(); 
		
		int index = searchStudent(studentNo);
		
		if(index == -1) {
			System.out.println("해당 학생 정보가 없습니다.");
			return;
		}
		System.out.print("수정할 이름 입력 : ");
		String studentName = sc.nextLine();
		arr[index].setStudentName(studentName);
		System.out.print("수정할 학과명 입력 : ");
		String majorName = sc.nextLine();
		arr[index].setMajorName(majorName);
		System.out.print("수정할 학생 평점 입력 : ");
		double score = sc.nextDouble();
		arr[index].setScore(score);
		
		System.out.println("학생정보 수정이 완료되었습니다.");
		
	}
	
	//검색
	private int searchStudent(String studentNo) {
		//반복문 이용해서 동일 학번을 찾음
		for(int i=0;i<idx;i++) {
			//찾으면 해당 인덱스 번호 리턴
			if(arr[i].getStudentNo().equals(studentNo))
				return i;
		}
		//검색 결과가 없으면 -1
		return -1;
	}
	public void searchStudent() {
		Scanner sc = new Scanner(System.in);
		String studentNo;
		//학번 입력 받음
		System.out.println("학생 정보 검색을 시작합니다.....");
		System.out.print("검색할 학번 입력 : ");
		studentNo = sc.nextLine(); 
		
		int index = searchStudent(studentNo);
		
		if(index == -1)
			System.out.println("해당 학생 정보가 없습니다.");
		else
			System.out.println(arr[index]);
	}
	
	
	//전체 출력
	public void printAllStudent() {
		//idx 전까지 모든 학생정보를 출력
		System.out.println("전체 학생정보를 출력합니다.....");
		for(int i=0;i<idx;i++)
			System.out.println(arr[i].toString());
		
	}
	//학생 정보 이름 일부를 검색하여 일부가 일치하면 출력
	public void searchStudentName() {
		System.out.println("학생 이름 일부로 검색을 시작합니다.");
		Scanner sc = new Scanner(System.in);
		//학생 이름 일부 입력
		System.out.print("학생 이름 일부 : ");
		String name = sc.nextLine();
		
		int count = 0;
		//반복문
		for(int i=0;i<idx;i++) {
			//입력한 검색어가 학생 이름에 있는지 확인 후 출력
			if(arr[i].getStudentName().indexOf(name) != -1) {
				System.out.println(arr[i]);
				count++;
			}
		}
			
		//검색 결과가 없으면, '해당 검색결과가 없습니다.' 메세지 출력
		if(count == 0) System.out.println("해당 검색 결과가 없습니다.");
		else System.out.println(count +"건이 검색 되었습니다.");
		}
		
		
	}