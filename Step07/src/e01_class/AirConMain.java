package e01_class;

public class AirConMain {

	public static void main(String[] args) {
		AirCon air = new AirCon(true, 24, 0, 0);
		air.powerOnOff();
		for(int i = 0; i < 5; i++)
			air.tempUp();
		
		air.changeWind();
		air.changeWind();
		air.changeWind();
		air.changeWind();
		
		air.changeMode();
		air.changeMode();
		air.changeMode();
		air.changeMode();
		air.changeMode();
	}

}
