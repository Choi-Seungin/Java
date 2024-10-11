import java.util.Scanner;

public class E14_Quest {

	public static void main(String[] args) {
		//q2 사용자로부터 점수를 하나 입력 받은 후
		//입력 받은 점수의 등급을 출력
		//90~100 : A, 80~89 : B, 70~79 : C, 60~69 : D, 0~59 : F
		//if, switch 둘다 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		String grade = "F";
		//if 
		if(score >= 90)
			grade = "A";
		else if(score >= 80)
			grade = "B";
		else if(score >= 70)
			grade = "C";
		else if(score >= 60)
			grade = "D";
		
		System.out.println(grade);
		
		//switch
		switch(score/10) {
		case 10:
		case  9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	}
}
