import java.util.Arrays;
import java.util.Scanner;

public class E24_Quest {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		int f = 0;
		int b = arr.length-1;
		for(int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			int n = sc.nextInt();
			if(n % 2 == 0) {
				arr[b--] = n;
				System.out.println(Arrays.toString(arr));
			}else {
				arr[f++] = n;
				System.out.println(Arrays.toString(arr));
			}
		}
	}
}
