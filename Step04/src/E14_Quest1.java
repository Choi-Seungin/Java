import java.util.Scanner;

public class E14_Quest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int n = sc.nextInt(),sum = 0, i = 1;
		
		while(i < n) {
			if(n % i == 0) 
			sum += i;
			i++;
		}
		System.out.println(sum == n ? "입력하신 숫자는 완전수 입니다." : "입력하신 숫자는 완전수가 아닙니다.");
	}
}