package e03_constructor;

public class CompanyMain {

	public static void main(String[] args) {
		Company c1 = new Company("철강소", "02-111-1111", 300, "https://aaa.gg");
		Company c2 = new Company("목공소", "02-222-2222");

		System.out.println(c1);
		System.out.println(c2);
		
		
		
	}

}
