package e05_quest;

public class Boiler implements Power{
	boolean power;
	@Override
	public void powerOn() {
		power = true;
		System.out.println("보일러 전원 On");
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("보일러 전원 Off");
	}

	@Override
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("보일러 전원 On");
		else
			System.out.println("보일러 전원 Off");
	}

}