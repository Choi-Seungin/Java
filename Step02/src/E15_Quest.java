import java.util.Scanner;

public class E15_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//q1 정수 하나 입력 받은 후 짝수면 true, 홀수면 false 출력
		System.out.print("숫자 입력 > ");
		int num = sc.nextInt();
		System.out.println(num % 2 == 0);
	}
}
