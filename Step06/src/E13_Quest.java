import java.util.Scanner;

public class E13_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int sum = 0, max = 0, min = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		max = min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.println("배열의 최대값 : " + max);
		System.out.println("배열의 최소값 : " + min);
	}
}
