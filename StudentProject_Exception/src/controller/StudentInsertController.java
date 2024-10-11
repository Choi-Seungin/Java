package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import dto.Student;
import exception.StudentException;
import service.StudentService;

public class StudentInsertController implements Controller {

	@Override
	public void execute() {
		StudentService service = StudentService.getInstance();
		// 사용자로부터 데이터 입력
		// 학생정보 입력
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("학생 정보 추가를 진행합니다........");
			// 1. 학번, 이름, 학과명, 점수를 입력
			System.out.print("등록할 학번 입력 : ");
			String studentNo = sc.nextLine();
			System.out.print("등록할 학생이름 입력 : ");
			String studentName = sc.nextLine();
			System.out.print("등록할 학과명 입력 : ");
			String majorName = sc.nextLine();
			System.out.print("등록할 학생 평점 입력 : ");
			double score = sc.nextDouble();
			sc.nextLine();

			// 서비스 클래스로 입력받은 데이터를 전달
			boolean result = service.insertStudent(new Student(studentNo, studentName, majorName, score));
			System.out.println("학생정보 추가 완료");
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("평점은 숫자로 입력해주세요");
		}
	}
}