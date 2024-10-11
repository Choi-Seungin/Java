
public class E09_Quest {

	public static void main(String[] args) {
		String str = "Hello World";
		char[] arr = str.toCharArray();
		
		//arr의 내용을 전부 대문자로 변환
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 'a' && arr[i] <= 'z')
				arr[i] -= 32;
		}
		//arr을 String으로 생성 후 출력
		str = new String(arr);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
	}
}
