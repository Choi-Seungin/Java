import java.util.Scanner;

public class Quest9 {
	//문제 9: 사용자 입력을 통한 배열 요소 교체
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("바꿀 인덱스1 : ");
		int n1 = sc.nextInt();
		System.out.print("바꿀 인덱스2 : ");
		int n2 = sc.nextInt();
		int temp = arr[n1];
		arr[n1] = arr[n2];
		arr[n2] = temp;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
