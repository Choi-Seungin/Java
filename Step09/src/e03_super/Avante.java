package e03_super;

public class Avante {
	//연료량 - 0 ~ 100
	protected int fuel;
	//현재 속도 - 0 ~ 240
	protected int speed;

	public Avante() {
		fuel = 100;
	}
	
	//액셀 - 속도를 5씩 증가
	public void accerate() {
		if(fuel < 1) {
			System.out.println("현재 연료가 없습니다.");
			return;
		}
		System.out.println("액셀을 밟습니다.");
		speed += 5;
		if(speed > 240) speed = 240;
		fuel -= 1;
		System.out.println("현재 속도 : " + speed + "km/h - 남은 연료 : " + fuel);
	}
	
	//브레이크 - 속도를 10씩 감소
	public void brake() {
		if(speed <= 0 || speed - 10 <= 10) speed = 0;
		else speed -= 10;
		System.out.println("브레이크를 밟았습니다.");
		System.out.println("현재 속도 : " + speed + "km/h - 남은 연료 : " + fuel);
	}
	
	
}
