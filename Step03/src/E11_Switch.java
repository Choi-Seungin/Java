
public class E11_Switch {
	/*
	 * switch는 case 옆에 있는 값과 일치하면
	 * 일치하는 순간부터 switch 내부의 코드를 전부 순서대로 실행한다.
	 * switch가 끝나거나, break를 만날때까지
	 * break는 switch를 강제로 종료
	 * switch는 정수, 문자, 문자열만 가능
	 * default : 위에 case에 맞는 값이 없을 때 실행되는 영역
	 * (if문의 else와 동일)
	 */

	public static void main(String[] args) {
		int no = 4;
		
		switch(no) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("????");
		}
		
	}

}
