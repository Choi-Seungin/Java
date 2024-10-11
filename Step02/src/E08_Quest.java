import java.util.Scanner;

public class E08_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//삼각형 밑변과 높이를 입력 받아서
		//삼각형의 넓이를 출력, 단 출력 결과는 반드시 소수점이 나와야 함
		//넓이 (A) = (밑변 × 높이) ÷ 2
		System.out.print("삼각형의 밑변 입력 : ");
		int w = sc.nextInt();
		System.out.print("삼각형의 높이 입력 : ");
		int h = sc.nextInt();
		double area = w*h/2;
		System.out.println("삼각형의 넓이는 : " + area);
		System.out.println("삼각형의 넓이는 : " + ((double)w*h/2));
		System.out.println("삼각형의 넓이는 : " + (w*h/2.0));
	}

}
