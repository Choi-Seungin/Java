package e07_quest;

import java.util.ArrayList;

public class IotApp {
	private ArrayList<Power> list;

	public IotApp() {
		list = new ArrayList<Power>();
		list.add(new TV());
		list.add(new Aircon());
		list.add(new Light());
		list.add(new Boiler());
	}
	
	//전체 전원 On
	public void powerAllOnDevice() {
		for(Power p : list) {
			p.powerOn();
		}
		
//		for(int i=0;i<list.size();i++) {
//			list.get(i).powerOn();
//		}
	}
	
	//전체 전원 Off
	public void powerAllOffDevice() {
		for(Power p : list) {
			p.powerOff();
		}
	}
	
	//새기기 추가 - 인자값으로 Power를 상속받은 인스턴스들이 들어옴
	public void addDevice(Power device) {
		list.add(device);		
	}
	
}