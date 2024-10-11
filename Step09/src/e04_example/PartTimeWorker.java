package e04_example;

public class PartTimeWorker extends Employee {
	//일한 시간, 시급
	private int workTime;
	private int payPerHour;
	
	public PartTimeWorker(String name, int hour, int rate) {
		super(0, name);
		this.workTime = hour;
		this.payPerHour = rate;
	}
	
	@Override
	public int getPay() {
		return workTime * payPerHour/10000;
	}
	
	

}
