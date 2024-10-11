import java.util.Scanner;

public class E08_Quest {
	/*
	 * 숫자 두개를 입력해서
	 * 두 숫자의 뺄셈 결과를
	 * 무조건 양수로 되게끔 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 : ");
		int n1 = sc.nextInt();
		
		System.out.print("숫자를 입력하시오 : ");
		int n2 = sc.nextInt();
		
		//case 1
		if(n1 > n2)
			System.out.println(n1-n2);
		else
			System.out.println(n2-n1);
		
		//case 2
		int result = n1 - n2;
		
		if(result < 0)
			System.out.println(-result);
		
		//case 3
		System.out.println(n1 - n2 < 0 ? n2 - n1 : n1 - n2);
		
		//case 4 
		if(n1 < n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		System.out.println(n1 - n2);
		
		//case 5
		System.out.println(Math.abs(n1 - n2));
		
	}

}
