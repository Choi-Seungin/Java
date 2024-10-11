package e02_generic_extends;
//제네릭으로 타입 지정을 할 때, Mouse로 상속 받은 클래스만 지정
public class MouseHUB<T extends Mouse> {
	private T mouse;

	MouseHUB(T mouse) {
		this.mouse = mouse;
	}
	
	public void click(int n) {
		mouse.click(n);
	}
	
	public void wheel() {
		mouse.wheel();
	}
	
	

}
