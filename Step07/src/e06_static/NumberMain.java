package e06_static;

public class NumberMain {

	public static void main(String[] args) {
		//싱글톤 패턴이 적용되면 생성자를 
		//private으로 작성했기 때문에 외부에서 생성 불가능
		//Number n = new Number();
		Number n1 = Number.getInstance();
		Number n2 = Number.getInstance();
		Number n3 = Number.getInstance();
		Number n4 = Number.getInstance();
		
		System.out.println(n1 == n2 && n2 == n3 && n3 == n4);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n1.getNum());
		System.out.println(n2.getNum());
		System.out.println(n3.getNum());
		System.out.println(n4.getNum());
		System.out.println(Number.getInstance().getNum());
	}

}
