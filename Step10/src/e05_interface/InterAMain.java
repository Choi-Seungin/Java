package e05_interface;

public class InterAMain {
	public static void run(InterA in) {
		in.interA();
	}
	public static void main(String[] args) {
		InterAClass aClass = new InterAClass();
		InterBClass bClass = new InterBClass();
		
		aClass.interA();
		bClass.interA();
		run(aClass);
		run(bClass);
	}

}
