import java.util.Scanner;

public class Quest5 {
	//문제 5: 특정 값 찾기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("찾는 숫자 : ");
		int n = sc.nextInt();
		int f = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == n) 
				f = 1;
		} 
		System.out.println(f == 1 ? "찾는 숫자가 배열에 존재합니다" : "찾는 숫자가 배열에 존재하지 않습니다.");
	}
}
