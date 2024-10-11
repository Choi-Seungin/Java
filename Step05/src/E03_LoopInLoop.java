
public class E03_LoopInLoop {

	public static void main(String[] args) {
		
		for(int i = 2; i <= 9; i++ ) {
			System.out.printf("--- %d 단 --- \n", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d \n", i,j,i*j);
			}
		}
		System.out.println("---------");
		//중첩된 반복문 전후로 해야될 작업 명확히 처리해야되는 부분
		int i1 = 2, j1 = 1;
		while(i1 < 10) {
			System.out.printf("--- %d 단 --- \n", i1);
			j1 = 1;
			while(j1 < 10) {
				System.out.printf("%d * %d = %d \n", i1,j1,i1*j1);
				j1++;
			}
			i1++;
		}
	}
}
