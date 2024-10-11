package service;

import java.util.ArrayList;
import java.util.Scanner;

import dto.Student;
import exception.StudentException;

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
	
	public ArrayList<Student> getList() {
		return list;
	}
	
	public boolean insertStudent(Student student) throws StudentException {
		if(searchStudent(student.getStudentNo()) != null) {
			throw new StudentException("학번이 중복되었습니다. 학생 정보 추가 실패");
		}
		//리스트에 학생정보 추가
		return list.add(student);
		
	}

	public Student searchStudent(String studentNo) {
		int idx = list.indexOf(new Student(studentNo, null, null, 0));
		
		if(idx == -1)
			return null;
		else
			return list.get(idx); //검색 결과 인덱스 번호로 데이터 뽑아서 전달
	}

	public boolean deleteStudent(String studentNo) throws StudentException {
		if(searchStudent(studentNo) == null) {
			throw new StudentException("학생 정보가 없습니다, 학생 정보 삭제 실패");
		}
		return list.remove(new Student(studentNo, null, null, 0));
	}

	public ArrayList<Student> searchStudentName(String name) throws StudentException {
		ArrayList<Student> result = new ArrayList<Student>();
		//반복문
		for(int i=0;i<list.size();i++) {
		//	입력한 검색어가 학생 이름에 있는지 확인 후 출력
			if(list.get(i).getStudentName().indexOf(name) != -1) {
				result.add(list.get(i));
			}
		}
		if(result.isEmpty())
			throw new StudentException("학생 정보 검색 결과가 없습니다."); 
		return result;
	}
}