import java.util.Scanner;

public class E18_Quest {
	/*
	 *사용자로부터 나이를 입력 받아서
	 *입력 받은 나이가 미성년자인지 성인인지 출력
	 *단, 나이는 0보다 큰 값을 받아야됨.
	 *0 이하의 값이 들어오면 다시 입력 받게끔 처리
	 *
	 *실행 예시>
	 *	나이 입력(0보다 큰값을 입력하세요) : -5
	 *	나이를 잘못 입력하셨습니다.
	 *	나이 입력(0보다 큰값을 입력하세요) : 20
	 *	성인 입니다.
	 * 
 	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		
		do {
			System.out.print("나이 입력(0보다 큰값을 입력하세요) : ");
			age = sc.nextInt();
			
			if(age <= 0)
				System.out.println("나이를 잘못 입력하셨습니다.");
			else
				System.out.println(age > 19 ? "성인 입니다." : "미성년자 입니다.");
		}while(age <= 0);
	}
}
