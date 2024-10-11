package e01_class;

public class TVMain {

	public static void main(String[] args) {
		TV tv = new TV(true, true, 1, 5);
		tv.powerOnOff();
		tv.powerOnOff();
		tv.powerOnOff();
		for(int i = 0; i < 766; i++) {
			tv.chUp();
		}
		for(int i = 0; i < 20; i++) {
			tv.chDown();
		}
		tv.muteOnOff();
		tv.muteOnOff();
		tv.muteOnOff();
		
		for(int i = 0; i < 50; i++) {
			tv.volUp();
		}
		for(int i = 0; i < 50; i++) {
			tv.volDown();
		}
	}

}
