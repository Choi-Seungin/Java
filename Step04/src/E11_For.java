import java.util.Scanner;

public class E11_For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt(); 
		for(int n = 1; n < 10; n++) 
			System.out.printf("%d * %d = %d \n",dan ,n ,dan*n);
	}
}