package e04_example;

public class PermanentWorker extends Employee{

	public PermanentWorker(int salary, String name) {
		super(salary, name);
	}
	@Override
	public int getPay() {
		return salary/12;
	}
	
}
