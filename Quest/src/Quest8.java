import java.util.Scanner;

public class Quest8 {
	//문제 8: 배열에서 최소값 찾기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최소값 : " + min);
	}
}
