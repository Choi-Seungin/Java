import java.util.Arrays;
import java.util.Scanner;

public class E24_Quest1 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		int start = 0, end = arr.length-1;
		while(start<=end) {
			System.out.print("숫자 입력 : ");
			int n = sc.nextInt();
			if(n % 2 == 1)
				arr[start++] = n;
			else
				arr[end--] = n;
			System.out.println(Arrays.toString(arr));
		}
		
		
	}

}
