package e07_lamda;

public class LamdaEx1 {
	/*
	 * 	람다(Lamda)
	 * 		함수명 프로그래밍 스타일을 지원하는 방법 JDK8버전 부터 도입된 기능
	 * 		익명 함수의 한 형태로 메서드를 간단하게 표현할 수 있다.
	 * 		
	 * 		(매개변수) -> 실행할 코드 한줄;
	 * 
	 * 		(매개변수) -> {
	 * 			실행할 코드1;
	 * 			실행할 코드1;
	 * 			실행할 코드1;
	 * 			...
	 * 		}
	 */
	public static void main(String[] args) {
		//Calcurator 익명클래스로 만들어서 덧셈하는 기능을 작성
		Calcurator sum = new Calcurator() {
			
			@Override
			public int calc(int x, int y) {
				return x + y;
			}
		};
		System.out.println(sum.calc(10, 20));
		
		Calcurator calc1 = (a, b) -> a + b;
		System.out.println(calc1.calc(10,30));
		
		Calcurator calc2 = (a, b) -> a - b;
		System.out.println(calc2.calc(10, 20));
		
		//두 숫자중에 큰 숫자 리턴
		Calcurator calc3 = (x, y) -> x > y ? x : y;
		System.out.println(calc3.calc(10, 20));
		
		Calcurator total = (x, y) -> {
			//x부터 y까지 합 리턴
			int s = 0;
			if(x > y) {
				int temp = x;
				x = y;
				y = temp;
			}
			for(int i = x; i <= y; i++) s += i;
			return s;
		};
		System.out.println(total.calc(1, 100));
	}

}
