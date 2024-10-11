import java.util.Scanner;

public class Quest4 {
	//문제 4: 배열 요소 역순 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				System.out.print(arr[4] + " ");
			}else if(i == 1){
				System.out.print(arr[3] + " ");
			}else if(i == 2){
				System.out.print(arr[2] + " ");
			}else if(i == 3){
				System.out.print(arr[1] + " ");
			}else {
					System.out.print(arr[0] + " ");
			}
		}
	}
}