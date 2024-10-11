import java.util.Scanner;

public class E10_BookQuest4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int line = sc.nextInt();
		int space = line/2+1;
		int star = 1;
		
		for(int i = 0; i < line; i++) {
			for(int j = 0; j <= space; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < star; j++) {
				System.out.print("*");
			}
			space -= 1;
			star += 2;
			System.out.println();
		}
	}
}
