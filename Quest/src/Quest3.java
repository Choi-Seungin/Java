import java.util.Scanner;

public class Quest3 {
	//문제 3: 짝수와 홀수 개수 세기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int c1 = 0, c2 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) 
				c1++;
			else 
				c2++;
		}
		System.out.println("짝수의 개수 : " + c1);
		System.out.println("홀수의 개수 : " + c2);
	}
}
