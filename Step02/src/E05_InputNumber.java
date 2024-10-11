import java.util.Scanner;

public class E05_InputNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		int n1 = sc.nextInt(); //실제 숫자를 입력 받고 난 뒤에 n1에 저장
		System.out.println("n1 : " + n1);
		
		System.out.print("숫자 입력 > ");
		int n2 = sc.nextInt();
		System.out.println("n2 : " + n2);
		
		//실수 하나 입력 받아서 출력
		System.out.print("실수 입력 > ");
		double n3 = sc.nextDouble();
		System.out.println("n3 : " + n3);
		
		System.out.print("실수 입력 > ");
		float n4 = sc.nextFloat();
		System.out.println("n4 : " + n4);
		
		
	}

}
