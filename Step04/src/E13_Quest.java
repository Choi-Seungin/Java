import java.util.Scanner;

public class E13_Quest {
/*
 * 숫자 하나 입력 받아서
 * 입력한 숫자의 모든 약수를 출력
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int n = sc.nextInt(); //입력받는 숫자
		
		System.out.print(n + "의 약수는 : ");
		for(int i = 1; i <= n; i++) { //1부터 입력한 숫자 까지 반복
			if(n % i == 0) //약수를 구하는 조건식
			System.out.print(i + " "); //약수 출력
		}
	}
}
