
public class E05_ThreeOperator {

	public static void main(String[] args) {
		/*
		 * 삼항 연산자
		 * 	조건식이 true/false 일때 실행할 연산을 구분해주는 연산자
		 * 조건식 ? 참일 때 실행할 연산 : 거짓일 때 실행할 연산;
		 */

		int n1 = 20, n2 = 20;
		
		int result =(n1 > n2 ? n1 : n2);
		System.out.println(result);
	}

}
