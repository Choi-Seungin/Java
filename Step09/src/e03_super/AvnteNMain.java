package e03_super;

public class AvnteNMain {

	public static void main(String[] args) {
		AvanteN avanteN = new AvanteN();
		
		for(int i = 0; i < 20; i++) {
			avanteN.accerate();
		}
		avanteN.changeMod();
		for(int i = 0; i < 20; i++) {
			avanteN.accerate();
		}
		for(int i = 0; i < 23; i++) {
			avanteN.brake();
		}
	}
}
