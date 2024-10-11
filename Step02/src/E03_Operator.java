
public class E03_Operator {
	/*
	 * 사칙연산
	 * + - * / % 
	 */

	public static void main(String[] args) {
		//정수형 변수 2개 선언해서, 원하는 값으로 초기화
		int n1 = 10, n2 = 5;
		
		//연산 결과 저장할 정수형 변수 선언 및 초기화
		int result = 0;
		
		result = n1 + n2;
		System.out.println(result);
		
		result = n1 - n2;
		System.out.println(result);
		
		result = n1 * n2;
		System.out.println(result);
		
		result = n1 / n2;
		System.out.println(result);
		
		result = n1 % n2;
		System.out.println(result);
		
		result = (n1 + 2) * n2 / 5;
		System.out.println(result);
	}

}
