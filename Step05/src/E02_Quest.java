import java.util.Scanner;

public class E02_Quest {
	/*
	 * 숫자를 0 입력 할때까지 숫자 입력을 받는 반복문
	 * 반복문이 끝나면 입력받은 숫자들의 합을 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int sum = 0;
		
		do {
			System.out.print("숫자 입력(0입력 시 종료) : ");
			n = sc.nextInt();
			sum += n;
		} while(n != 0);
		System.out.println("입력한 숫자의 합 : " + sum);
	}
}
