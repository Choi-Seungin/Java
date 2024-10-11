
public class E05_Quest {

	public static void main(String[] args) {
		
		int n = 0;
		
		while(n++ < 100) 
			if(n % 4 == 0 || n % 7 == 0)
				System.out.printf("%d ",n);
	}
}
