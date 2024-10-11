import java.util.Scanner;

public class E18_Quest1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력(0보다 큰값을 입력하세요) : ");
		int age = sc.nextInt();
		
		while(age <= 0) {
			System.out.println("나이를 잘못 입력하셨습니다.");
			System.out.print("나이 입력(0보다 큰값을 입력하세요) : ");
			age = sc.nextInt();
		}
		System.out.println(age > 19 ? "성인 입니다." : "미성년자 입니다.");
	}
}