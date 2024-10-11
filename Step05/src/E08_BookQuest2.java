
public class E08_BookQuest2 {

	public static void main(String[] args) {
		
		for(int dan = 2; dan < 10; dan+=2 ) {
				System.out.println("---" + dan + "단" + "---");
				for(int i = 1; i < 10; i++) {
					System.out.printf("%d * %d = %d \n", dan, i, dan*i);
				}
			}
		System.out.println();
		
		for(int dan = 2; dan < 10; dan++ ) {
			if(dan % 2 == 1)
				continue;
			for(int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d \n", dan, i, dan*i);
			}
			System.out.println();
		}
	}
}
