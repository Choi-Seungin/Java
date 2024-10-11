import java.lang.reflect.Array;
import java.util.Arrays;

public class E22_Quest1 {

	public static void main(String[] args) {
		String str = "Hello World";
		char[] arr = str.toCharArray();
		
		for(int i = 0; i < arr.length/2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(arr));
		String str1 = new String(arr);
		System.out.println(arr);
	}
}