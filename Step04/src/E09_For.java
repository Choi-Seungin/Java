
public class E09_For {
	/*
	 * 		for(초기화; 조건식; 증감식) {
	 * 			실행할 코드
	 		}
	 */			

	public static void main(String[] args) {
		int i = 0;
		for(i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
		System.out.println(i);
		//--------------------------
		/*
		 * 지역변수 특정 영역에서만 사용
		 */
		for(int j = 0; j < 5; j++) {
			System.out.println("안녕하세요");
		}
		//j는 for문에서 사용하기 위해 선언을 했기 때문에 for문이 끝나면 사라짐
		// --> 지역변수(local variable)
		System.out.println();
	}

}
