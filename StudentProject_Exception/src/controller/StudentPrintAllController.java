package controller;

import java.util.ArrayList;

import dto.Student;
import service.StudentService;

public class StudentPrintAllController implements Controller {

	@Override
	public void execute() {
		ArrayList<Student> list = StudentService.getInstance().getList();
		
		if(list.isEmpty()) {
			System.out.println("학생정보가 없습니다.");
		}
		else {
			System.out.println("전체 학생정보가 출력됩니다.");
			for(Student std : list) {
				System.out.println(std);
			}
		}
	}
}
