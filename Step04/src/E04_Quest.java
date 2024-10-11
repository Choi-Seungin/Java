import java.util.Scanner;

public class E04_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		int n = 0;
		while(n++ < 9) 
			System.out.printf("%d * %d = %d \n",dan ,n ,dan*n);
	}
}
