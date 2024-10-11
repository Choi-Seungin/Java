import java.util.Scanner;

public class E15_Quest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int n1 = sc.nextInt();
		
		System.out.print("숫자 입력 : ");
		int n2 = sc.nextInt();
		int sum = 0;
		
		if(n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		while(n1 <= n2) {
			sum += n1++;
		}
		System.out.println("작은 숫자부터 큰 숫자까지의 합 : " + sum);
	}
}

