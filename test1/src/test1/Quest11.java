package test1;
import java.util.Scanner;

public class Quest11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수하나를 입력하세요: ");

        //1. int num = scanner.nextDouble();
        int num = scanner.nextInt();
        //2. 초기화
        int sum = 0;

        for (int i = 1; i < num; i++) {
        	//3. %i로 수정
            if (num % i == 0) {

                sum += i;

            }

        }
        //4. 조건식이 반대 sum == num
        if (sum == num) {

            System.out.println(num + "은(는) 완전수입니다.");

        } else {

            System.out.println(num + "은(는) 완전수가 아닙니다.");

        }

    }

}
