import java.util.Scanner;

public class Quest2 {
	//문제 2: 배열 요소 합계
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("배열의 총 합 : " + sum);
	}

}
