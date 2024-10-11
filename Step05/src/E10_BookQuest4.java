import java.util.Scanner;

public class E10_BookQuest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			//공백 찍는 부분
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			//별 찍는 부분
			for (int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
