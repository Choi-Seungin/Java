package e09_calendar;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		date.setTime(0);
		System.out.println(date);
		
		Date end = new Date(124, 11, 31);
		System.out.println(end);
	}

}
