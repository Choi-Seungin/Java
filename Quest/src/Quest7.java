import java.util.Scanner;

public class Quest7 {
	//문제 7: 구구단 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력(2~9) : ");
		int n = sc.nextInt();
		
		if(n >= 2 && n <= 9) {
			for(int i = 1; i <= 9; i++ ) {
				System.out.printf("%d * %d = %d\n",n,i,n*i);
			}
		}else {
			System.out.println("숫자를 잘못 입력하셨습니다.");
		}
	}
}
