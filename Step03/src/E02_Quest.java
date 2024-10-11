import java.util.Scanner;

public class E02_Quest {

	public static void main(String[] args) {
		/*숫자 하나를 입력 받아서
		 *해당 숫자가 짝수인지, 홀수 인지, 0인지 구분해서 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		int num = sc.nextInt();
		
		System.out.print("입력한 숫자는 ");
		if(num % 2 == 0 && num != 0) {
			System.out.println("짝수 입니다.");
		}
		if(num % 2 == 1) { 
			System.out.println("홀수 입니다.");		
		}
		if(num == 0) { 
			System.out.println("0 입니다.");		
		}
	}

}
