package e07_has_a;

public class ArmyMain {

	public static void main(String[] args) {
		Gun gun = new Gun();
		Army a1 = new Army(gun);
		
		for(int i = 0; i < 20; i++) {
			a1.shot();
		}
		System.out.println("---------------------");
		a1.changeGun(new K2());
		for(int i = 0; i < 20; i++) {
			a1.shot();
		}
	}

}
