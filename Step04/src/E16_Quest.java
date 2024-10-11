import java.util.Scanner;

public class E16_Quest {
/*
 * 정수 하나를 입력 받은 후에
 * 입력 받은 정수의 약수가 몇개인지 출력
 * 실행 예
 * 숫자 입력 > 6
 * 약수의 개수 : 4
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int n = sc.nextInt(), c = 0;
		
		for(int i = 1; i <= n; i++ ) {  //1부터 n까지 반복
			if(n % i == 0)   			//약수 구하기
				c++;         			//약수를 구할때마다 1씩 증감
		}
		System.out.println("약수의 개수 : " + c);
	}
}
