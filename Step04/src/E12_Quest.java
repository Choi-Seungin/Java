import java.util.Scanner;

public class E12_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int i = sc.nextInt(),f = 1; 
		for(int n = 1; n <= i; n++) { 
			f *= n;
		}
		System.out.printf("%d 의 팩토리얼 값 : %d \n",i ,f);
	}
}
