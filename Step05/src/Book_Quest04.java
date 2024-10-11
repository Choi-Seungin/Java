public class Book_Quest04 {

	public static void main(String[] args) {
		
		int h =5; //정삼각형의 층수
		
		for(int i=1; i<=h; i++) {
		//공백
		for(int j=i; j<h; j++) {
			System.out.print(" ");
		}
		//별
		for(int s=1; s<=(2*i-1); s++) {
			System.out.print("*");
		}
		//줄바꿈
		System.out.println();
		}
	}

}