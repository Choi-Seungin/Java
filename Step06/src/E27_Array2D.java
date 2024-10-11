
public class E27_Array2D {

	public static void main(String[] args) {
		int[][] arr1 = new int[][] {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
		};
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		for(int[] arr : arr1) {
			for(int n : arr) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
	}

}
