
public class E06_else_if {
	/*
	 * else if
	 * 	if문으로 구성된 조건문에서 두번째 조건문부터 담당하는 문법
	 * 
	 *	if(조건식) { 
	 *	실행할 코드
	 *	} else if(조건식2) {
	 *	실행할 코드
	 *	} else {
	 *	실행할 코드
	 *	}
	 */

	public static void main(String[] args) {
		//성인 20세 이상, 고등학생 17~19, 중학생 14~16, 초등학생 8~13, 미취학아동 1~7
		int age = 20;
		
		if(age >= 20) {
			System.out.println("성인");
		} else if(age >= 17) {
			System.out.println("고등학생");
		} else if(age >= 14) {
			System.out.println("중학생");
		} else if(age >= 8) {
			System.out.println("초등학생");
		} else {
			System.out.println("미취학 아동");
		}
		
		if(age <= 7) {
			System.out.println("미취학 아동");
		} else if(age <= 13) {
			System.out.println("초등학생");
		} else if(age <= 16) {
			System.out.println("중학생");
		} else if(age <= 19) {
			System.out.println("고등학생");
		} else {
			System.out.println("성인");
		}
		
	}

}
