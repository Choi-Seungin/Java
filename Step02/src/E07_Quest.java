import java.util.Scanner;

public class E07_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//반지름 데이터 한개를 입력 받아서
		//입력 받은 반지름에 해당하는 원넓이를 출력
		System.out.print("반지름 입력 > ");
		int r = sc.nextInt();
		double area = r*r*Math.PI;
		System.err.println(area);
		System.out.println("원의 넓이는 : " + (r*r*Math.PI));
	}

}
