import java.util.Arrays;
import java.util.Scanner;

public class E25_Quest {

	public static void main(String[] args) {
		//정수형 배열 길이 10
		//스캐너 생성
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		int idx = 0;
		//반복문 - 무한루프
		while(true) {
			System.out.println("1 - 숫자 추가");
			System.out.println("2 - 숫자 삭제");
			System.out.println("3 - 전체 숫자 출력 ");
			System.out.println("0 - 프로그램 종료");
			System.out.print("원하시는 번호를 입력 하세요 : ");
			int no = sc.nextInt();
			
			if(no == 0) {break;}
			
			else if(no == 1) {
				//숫자 입력 받아서 배열에 추가 단, 배열에 저장할 공간이 없으면 배열길이를 +5 늘린 후에 저장
				if(idx == arr.length) {
					int[] temp = new int[arr.length+5];
					System.arraycopy(arr, 0, temp, 0, arr.length);
					arr = temp;
				}
				System.out.print("추가할 숫자 입력 : ");
				arr[idx++] = sc.nextInt();
				
			}else if(no == 3) {
				System.out.println("전체 숫자 출력 : ");
				for(int i = 0; i < idx; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			}else if(no == 2) {
				System.out.println("숫자 삭제를 시작합니다.");
				System.out.print("삭제할 숫자 입력 : ");
				int n = sc.nextInt();
				boolean flag = false;
				for(int i = 0; i < idx; i++) {
					if(arr[i] == n) {
						flag = true;
						for(int j = i; j < idx-1; j++) {
							arr[j] = arr[j+1];
						}
						idx--;
						break;
					}
				}
				System.out.println(flag == true? "숫자 삭제 완료" : "삭제할 숫자가 없습니다.");
					
			}
		}
	}
}
