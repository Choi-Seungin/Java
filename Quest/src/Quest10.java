import java.util.Scanner;

public class Quest10 {
	//문제 10: 배열 요소 평균 계산
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("배열의 평균 값 : " + (sum/arr.length));
	}
}
