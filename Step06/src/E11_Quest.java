import java.util.Scanner;

public class E11_Quest {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("홀수 : ");
		for(int n : arr) {
			if(n % 2 == 1)
				System.out.print(n+ " ");
		}
		System.out.println();
		System.out.print("짝수 : ");
		for(int n : arr) {
			if(n % 2 == 0)
				System.out.print(n+ " ");
		}
		System.out.println();
		String n1 = "홀수 : ";
		String n2 = "짝수 : ";
				
		for(int n : arr) {
			if(n % 2 == 1)
				n1 += n + " ";
			else
				n2 += n + " ";
		}
		System.out.println(n1);
		System.out.println(n2);
	}
}
