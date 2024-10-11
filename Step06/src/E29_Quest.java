import java.util.Arrays;

public class E29_Quest {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int n = 1, sw = 1, col = 0;
		for(int i = 0; i < arr.length; i++) {
			//각 행에 숫자 채우기
			while(col < arr[i].length && col > -1) {
				arr[i][col] = n++;
				col += sw;
			}
			sw = -sw;
			col += sw;
		}
		for(int i = 0; i < arr.length; i++) {
			for(int v : arr[i]) {
				System.out.printf("%-4d",v);
			}
			System.out.println();
		}
	}
}
