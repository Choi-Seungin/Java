
public class E31_Quest1 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int n = 1, row = 0, col = -1, sw = 1, k = 5;
		while(true) {
		for(int i = 0; i < k; i++) {
			col += sw;
			arr[row][col] = n++;
		}
		k--;
		if(k == 0) break;
		for(int i = 0; i < k; i++) {
			row += sw;
			arr[row][col] = n++;
		}
		sw = -sw;
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
				
			System.out.println();
		}
	}
}

