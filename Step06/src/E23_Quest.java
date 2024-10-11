import java.util.Arrays;

public class E23_Quest {

	public static void main(String[] args) {
		int[] arr = new int[20];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*20)+1;
			for(int j = 0; j < i ; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
