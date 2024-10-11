package e03_exception;

import java.util.Scanner;

public class ExceptionEx7 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			try {
			System.out.print("숫자 입력 : ");
			int n1 = sc.nextInt();
			if(n1 < 1) 
				throw new UserException("숫자는 양수를 입력해야됩니다.");
			System.out.print("숫자 입력 : ");
			int n2 = sc.nextInt();
			if(n2 < 1)
				throw new UserException("숫자는 양수를 입력해야됩니다.");
			System.out.println(n1 * n2);
			}catch (UserException e) {
				System.out.println(e.getMessage());
			}
	}
}