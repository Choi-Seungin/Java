package e03_exception;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			//작업 영역
			//에러가 발생 할 수 있는 영역
			System.out.println(1);
			System.out.println("나누기 결과 : " + 5 / 0);
			System.out.println(2);
		}catch (Exception e) {
			//try영역에서 Exception(런타임 에러)이 발생했을 때 처리하는 영역
			//Exception(런타임 에러)이 발생하지 않으면 실행되지 않는 영역
			System.out.println(3);
		}
		System.out.println(4);
	}

}
