import java.util.Arrays;
import java.util.Scanner;

public class E21_Quest {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		for(i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
			
			if(arr[i] == -1) break;
			
			if(i == arr.length-1) {
				int[] temp = new int[arr.length + 3];
				System.arraycopy(arr, 0, temp, 0, arr.length);
				arr = temp;
			}
		}
		int sum = 0;
		for(int j = 0; j < i; j++) {
			sum += arr[j];
		}
			
		System.out.println(Arrays.toString(arr));
		System.out.println((double)sum / i);
	}
}
