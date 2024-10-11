package e05_interface;

public class InterBClass implements InterA, InterB {
	
	//동일 추상 메서드가 여러개 있어도 한번만 재정의 하면 됨
	@Override
	public void interA() {
		System.out.println("interA Class B");
	}

	@Override
	public void interB() {
		System.out.println("interB Class B");
	}

}
