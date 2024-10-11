
public class E09_BookQuest3 {

	public static void main(String[] args) {
		
		for(int dan = 2; dan <= 9; dan++ ) {
			System.out.println("---" + dan + "단" + "---");
			for(int i = 1; i <= dan; i++) {
				System.out.printf("%d * %d = %d \n", dan, i, dan*i);
			}
			System.out.println();
		}
		for(int dan = 2; dan < 10; dan++ ) {
			System.out.println("---" + dan + "단" + "---");
			for(int i = 1; i < 10; i++) {
				if(i > dan)
					break;
				System.out.printf("%d * %d = %d \n", dan, i, dan*i);
			}
			System.out.println();
		}
	}
}
