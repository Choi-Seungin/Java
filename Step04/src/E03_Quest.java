import java.util.Scanner;

public class E03_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력 횟수 입력 : ");
		int ea = sc.nextInt();
		int i = 0;
		while(i++ < ea) {
			System.out.println("Hello World");
		}
		System.out.println("=================");
		
		while(ea-- > 0) {
			System.out.println("Hello World");
		}
	}
}
