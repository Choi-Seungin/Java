package e02_priority;

public class ThreadPriority extends Thread {
	
	//스레드 이름 받아서 초기화하는 생성자
	public ThreadPriority(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + " 스레드 종료 - " + getPriority());
	}
}
