import java.util.Scanner;

public class E10_Quest {
	/*
	 * 숫자 하나를 입력 받아서
	 * 입력 받은 숫자가 소수인지 아닌지 출력
	 * 소수는 1과 자기 자신 약수만 존재하는 숫자
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt(), c = 0;
		boolean flag = n < 2 ? true:false;
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) 
				c++;
		}
		System.out.println(c == 2 ? "입력한 숫자는 소수 입니다." : "입력한 숫자는 소수가 아닙니다.");
		
		for(int i = 2; i < n / 2; i++) {
			if(n % i == 0) {
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("입력한 숫자는 소수가 아닙니다.");
		else
			System.out.println("입력한 숫자는 소수 입니다.");
	}
}
