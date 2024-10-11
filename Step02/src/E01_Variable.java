
public class E01_Variable {

	public static void main(String[] args) {
		/*	
		 * 데이터 형태
		 * 	정수 : 양수, 음수, 0
		 * 	실수 : 정수에서 소수점 추가
		 * 	문자 : 한 글자
		 * 	논리값 : 참, 거짓
		 * 	문자열 : 문자가 한 개 이상 구성된 형태
		 * 
		 * 변수(Variable) : 데이터를 하나 저장할 공간
		 * 
		 * 변수 선언 방법
		 * 	변수타입 변수명; 		
		 */
		//변수 선언 방법 - 1
		int num; //num이라는 이름으로 정수형 데이터를 하나 저장할 공간을 임대 받았다.
		num = 100; //정수 100을 변수 num에 저장하겠다.
		System.out.println(num); //num이 저장하고 있는 100을 읽어와서 화면에 출력
		num = 200;
		System.out.println(num);
		
		//변수 선언 방법 - 2
		int a = 10; //초기화(initialize) : 변수를 선언한 뒤에 처음 저장하는 행위
		System.out.println(a);
		
		//변수 선언 방법 - 3 : 동일한 타입의 변수를 만드는 경우
		int n1 = 10, n2 = 20;
		System.out.println(n1 + " " + n2);
		
		//정수형 변수 3개 선언
		int num1, num2, num3;
		//위의 변수를 전부 0으로 초기화
		num1 = num2 = num3 = 0;
		System.out.println(num1+" "+num2+" "+num3);
	}

}
