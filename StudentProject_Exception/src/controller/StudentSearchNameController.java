package controller;

import java.util.ArrayList;
import java.util.Scanner;

import dto.Student;
import exception.StudentException;
import service.StudentService;

public class StudentSearchNameController implements Controller {

	@Override
	public void execute() {
		try {
			System.out.println("학생 이름 일부로 검색을 시작합니다.");
			Scanner sc = new Scanner(System.in);
			// 학생 이름 일부 입력
			System.out.print("학생 이름 일부 : ");
			String name = sc.nextLine();

			ArrayList<Student> list;
			list = StudentService.getInstance().searchStudentName(name);
			for (Student student : list)
				System.out.println(student);
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		} 

	}

}
