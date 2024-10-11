import java.util.Arrays;

public class E18_ArrayDuplicationValue {

	public static void main(String[] args) {
		int[] arr = new int[2];
		
		//랜덤으로 배열에 숫자를 저장
		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = (int)(Math.random() * 10) + 1;
			for(int j = 0 ; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
