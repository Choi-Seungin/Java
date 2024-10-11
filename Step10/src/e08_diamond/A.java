package e08_diamond;

public interface A {
	public void methodA();
	
	default void method1() {
		System.out.println("A");
	}

}
