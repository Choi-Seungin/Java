import java.util.Scanner;

public class E07_BookQuest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		if(operator == '+') 
			System.out.println(num1 + num2);
		else if(operator == '-')
			System.out.println(num1 - num2);
		else if(operator == '*')
			System.out.println(num1 * num2);
		else if(operator == '/')
			System.out.println(num1 / num2);
		
		switch(operator) {
		case '+' : 
			System.out.println(num1 + num2);
			break;
		case '-' : 
			System.out.println(num1 - num2);
			break;
		case '*' : 
			System.out.println(num1 * num2);
			break;
		case '/' : 
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("잘못된 연산자를 입력하셨습니다.");
		}
	}
}


