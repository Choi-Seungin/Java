import java.util.Scanner;

public class E10_BookQuest4_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int n = sc.nextInt();
        
        // 위쪽 삼각형 출력 (포함)
        for (int i = 0; i < n/2+1; i++) {
            // 공백 출력
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래쪽 삼각형 출력 (포함)
        for (int i = n/2+1 - 2; i >= 0; i--) {
            // 공백 출력
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}