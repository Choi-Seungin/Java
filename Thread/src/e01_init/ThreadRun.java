package e01_init;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ThreadRun extends Thread {
	
	@Override
	public void run() {
		//자동으로 스레드가 일하는 부분
		for(int i = 0; i < 100; i++) {
			System.out.println(i + "번째 일 - " + getName() + " " + System.nanoTime());
		}
		System.out.println(getName() + " 종료");
	}	
	
		

}
