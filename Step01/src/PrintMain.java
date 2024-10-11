
public class PrintMain {

	public static void main(String[] args) {
		System.out.println(10);
		System.out.println(10+5);
		System.out.println(10-5);

		System.out.println("Hello");
		System.out.println("Hello " + "World");
		System.out.println("World " + (10 + 5));
		
		System.out.println("안녕하세요" + 8282 + 1000 + "갑시다." + 1234 + 1000);
		System.out.println("안녕하세요" + (8282 + 1000) + "갑시다." + (1234 + 1000));
		
		System.out.println("---------------------");
		System.out.print("Hello\n");
		System.out.print("World");
		System.out.println("---------------------");
		System.out.printf("안녕하세요 %d %d \n", 8282, 1000);
	}

}
