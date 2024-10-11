import java.util.Scanner;

public class E16_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//q2 사람 나이를 입력 받아서 성인이면 true, 미성년자면 false 출력
		System.out.print("나이 입력 > ");
		int age = sc.nextInt();
		System.out.println(age > 19);
	}
}
