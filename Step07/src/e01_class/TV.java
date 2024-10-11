package e01_class;
/*
 * 데이터
 * 음량 - int 범위 : 0 ~ 50
 * 채널 - int 범위 : 1 ~ 766
 * 전원 - boolean : true - on, false - off
 * 음소거 - boolean : true - on, false - off
 * 
 * 기능
 * 전원 음소거 on/off
 * 음량 up/down
 * 채널 up/down
 */

public class TV {
	boolean power;
	boolean mute;
	int channel;
	int volume;
	final int MAX_CHANNEL = 766;
	final int MIN_CHANNEL = 1;
	final int MAX_VOLUME = 50;
	final int MIN_VOLUME = 0;
	
	public TV(boolean power, boolean mute, int channel, int volume) {
		super();
		this.power = power;
		this.mute = mute;
		this.channel = channel;
		this.volume = volume;
	}
	
	void powerOnOff() {
		//메서드를 실행 할때마다 전원이 on/off 되야함
		//값이 true - on, false - off
		power = !power;
		if(power)
			System.out.println(power ? "전원 On" : "전원 Off");
	}
	void muteOnOff() {
		if(!power) return;
		mute = !mute;
		System.out.println(mute ? "음소거" : volume);
	}
	
	//채널 up
	void chUp() {
		if(!power) return;
		channel = channel % MAX_CHANNEL + 1;
		System.out.println("현재 채널 : " + channel);
	}
	
	void chDown() {
		if(!power) return;
		channel = channel == MIN_CHANNEL ? MAX_CHANNEL : channel - 1;
		System.out.println("현재 채널 : " + channel);
	}
	
	void volUp() {
		if(!power) return;
		if(mute) muteOnOff();
		if(volume < MAX_VOLUME)
			volume++;
		System.out.println(volume);
	}
	void volDown() {
		if(!power) return;
		if(mute) muteOnOff();
		if(volume > MIN_VOLUME)
			volume--;
		System.out.println(volume);
	}
}
