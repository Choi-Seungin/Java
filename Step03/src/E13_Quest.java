import java.util.Scanner;

public class E13_Quest {

	public static void main(String[] args) {
		//q1 사용자로부터 연도를 입력 받음
		//입력받은 연도가 윤년인지 아닌지 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도를 입력 : ");
		
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "윤년입니다.");
		} else {
			System.out.println(year + "윤년이 아닙니다.");
		}
		
		System.out.println((year % 4 == 0 && year % 100 != 0) || 
			year % 400 == 0 ? (year + "윤년입니다.") : (year + "윤년이 아닙니다."));
	}
}
