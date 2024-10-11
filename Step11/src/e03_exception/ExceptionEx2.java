package e03_exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			//int[] arr = { 5, 32, 5, 1, 6 };
			int[] arr = null;

			for (int i = 0; i <= arr.length; i++) {
				System.out.println(500 / arr[i]);
			}
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눈 에러");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 벗어남");
		} catch (NullPointerException e) {
			System.out.println("빈 객체를 실행 했습니다.");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} catch (Exception e) {
			//모든 Exception 클래스의 부모 클래스라서
			//모든 종류의 Exception 객체를 받을 수 있음
			System.out.println("생각하지 못한 에러가 발생");
		}
		System.out.println("프로그램 정상 종료");
	}

}
