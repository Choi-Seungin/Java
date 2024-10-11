
public class E31_Quest {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int n = 1, row = 0, col = 0, d = 0;
		while(n <= 25) {
			arr[row][col] = n++;
			
			int nextRow = row,nextCol = col;
			
			switch(d) {
			case 0 :
				nextCol++;
				break;
			case 1 :
				nextRow++;
				break;
			case 2 :
				nextCol--;
				break;
			case 3 :
				nextRow--;
				break;
			}
			if(nextRow < 0 || nextRow >= arr.length || nextCol < 0 || nextCol >= arr.length 
					|| arr[nextRow][nextCol] != 0) {
				d = (d + 1) % 4;
				switch(d) {
				case 0 :
					nextCol = col+1;
					nextRow = row;
					break;
				case 1 :
					nextCol = col;
					nextRow = row+1;
					break;
				case 2 :
					nextCol = col-1;
					nextRow = row;
					break;
				case 3 :
					nextCol = col;
					nextRow = row-1;
					break;
				}
			}
			col = nextCol;
			row = nextRow;
			
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
				
			System.out.println();
		}
		
	}

}
