import java.util.Scanner;

public class E14_Quest {
/*
 * q1 숫자 하나를 입력 받아서, 입력 받은 숫자가 완전수 인지 판단하는 코드
 * 실행 예시 >
 * 숫자 입력 : 6
 * 입력하신 숫자는 완전수 입니다.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int n = sc.nextInt(), sum = 0;
		
		for(int i = 1; i < n; i++) {
			if(n % i == 0) 
				sum += i;
		}
		System.out.println(sum == n ? "입력하신 숫자는 완전수 입니다." : "입력하신 숫자는 완전수가 아닙니다.");
	}
}
