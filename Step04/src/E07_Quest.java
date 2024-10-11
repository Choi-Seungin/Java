import java.util.Scanner;

public class E07_Quest {
/*
 * 양수 하나를 입력 받아서
 * 1부터 입력받은 숫자까지의 합을 출력
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int i = sc.nextInt(), n = 0, sum = 0;
		int sum1 = 0;
		
		while (n++ < i) 
			sum += n;
		System.out.println(sum);
		 
		while(i > 0)
			sum1 += i--;
		System.out.println(sum1);
	}
}
