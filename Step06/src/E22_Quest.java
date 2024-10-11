import java.lang.reflect.Array;
import java.util.Arrays;

public class E22_Quest {

	public static void main(String[] args) {
		String str = "Hello World";
		char[] arr = str.toCharArray();
		char[] arr1 = new char[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			arr1[i] = arr[arr.length - 1 - i];
		}
		String str1 = new String(arr1);
		System.out.println(str1);
	}
}
