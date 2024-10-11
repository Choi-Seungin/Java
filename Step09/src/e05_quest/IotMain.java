package e05_quest;

public class IotMain {

	public static void main(String[] args) {
		IotApp app = new IotApp();
		
		app.addDevice(new Boiler());
		app.powerAllOnDevice();
		app.powerAllOffDevice();
		app.addDevice(new TV());
		app.powerAllOnDevice();
	}

}