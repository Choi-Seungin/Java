import java.util.Scanner;

public class Quest6 {
	//문제 6: 1부터 n까지의 합계
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		int s = 0;
		
		for(int i = 1; i <= n; i++) {
			s += i;
		}
		System.out.println(s);
	}
}
