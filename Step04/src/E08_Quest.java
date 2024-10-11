import java.util.Scanner;

public class E08_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		//i = 입력받은 수, n = 1~입력한 숫자, f = 팩토리얼 값
		int i = sc.nextInt(), n = 1, f = 1; 
		//1~n까지 범위 설정
		while(n <= i) { 
			// f에 1~i를 모두 곱해서 저장
			f *= n++;
		}
		//결과 출력
		System.out.println(f); 
		
		//변수 2개로 작성 i = 입력받은 수, f1 = 팩토리얼 값
		int f1 = 1;
		//i를 1씩 감소시켜서 반복
		while(i > 0) {
			f1 *= i--;
		}
		//결과 출력
		System.out.println(f1);
	}
}
