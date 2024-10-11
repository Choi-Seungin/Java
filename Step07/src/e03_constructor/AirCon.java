package e03_constructor;
/*
 * 에어컨
 * 온도 - int, 18~30
 * 바람세기 - int, 0 : 약, 1 : 중, 2 : 강, 3 : 자동
 * 운전모드 - int, 0 : 냉방, 1 : 제습, 2 : 송풍
 * 전원 - boolean, true : on, false : off
 * 
 * 온도 Up / Down, 바람세기, 운전모드, 전원OnOff
 * 초기화
 */

public class AirCon {
	boolean power;
	int temp;
	int wind;
	int mode;
	
	public AirCon() {
		temp = 24;
	}
	
	final int MAX_TEMP = 30;
	final int MIN_TEMP = 18;
	final int WIND_POWER_1 = 0;
	final int WIND_POWER_2 = 1;
	final int WIND_POWER_3 = 2;
	final int WIND_POWER_AUTO = 3;
	final int MODE_COLD = 0;
	final int MODE_DEHUMI = 1;
	final int MODE_NATURAL = 2;
	
	void tempUp() {
		if(!power) return;
		if(temp < MAX_TEMP) temp++;
		System.out.println("현재 온도 : " + temp);
	}
	
	void tempDown() {
		if(!power) return;
		if(temp > MIN_TEMP) temp--;
		System.out.println("현재 온도 : " + temp);
	}
	
	void changeWind() {
		if(!power) return;
		wind = (wind + 1) % 4;
		switch(wind) {
		case WIND_POWER_1:
			System.out.println("바람 세기 : 약");
			break;
		case WIND_POWER_2:
			System.out.println("바람 세기 : 중");
			break;
		case WIND_POWER_3:
			System.out.println("바람 세기 : 강");
			break;
		case WIND_POWER_AUTO:
			System.out.println("바람 세기 : 자동");
			break;
		}
	}
	void changeMode() {
		if(!power) return;
		mode = (mode + 1) % 4;
		switch(mode) {
		case MODE_COLD:
			System.out.println("냉방 모드");
			break;
		case MODE_DEHUMI:
			System.out.println("제습 모드");
			break;
		case MODE_NATURAL:
			System.out.println("송풍 모드");
			break;
		}
	}
	void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("전원 On");
		else
			System.out.println("전원 Off");
	}
	
}
