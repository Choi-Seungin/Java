
public class E04_Quest {

	public static void main(String[] args) {
		//배열 생성
		int[] arr = {2,9,7,8,6,31,543,22,65,44};
		int c = 0;
		//배열에 저장된 값들 중 홀수의 개수를 출력
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 1)
				c++;
		}
		System.out.println("배열에 저장된 홀수의 개수 : " + c);
	}
}
