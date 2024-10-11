import java.util.Scanner;

public class E04_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("성인");
		} else {
			System.out.println("미성년자");
		}
		
		System.out.println("============");
		
		System.out.print("나이 입력 : ");
		int age1 = sc.nextInt();
		
		String msg = age1 >= 20 ? "성인" : "미성년자";
		System.out.println(msg);
		
		System.out.println(age1 >= 20 ? "성인" : "미성년자");
	}

}
