package e09_calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		//연도
		System.out.println(calendar.get(calendar.YEAR));
		//월
		System.out.println(calendar.get(calendar.MONTH));
		//일
		System.out.println(calendar.get(calendar.DAY_OF_MONTH));
		//요일
		System.out.println(calendar.get(calendar.DAY_OF_WEEK));
		//12시간 기준 시간
		System.out.println(calendar.get(calendar.HOUR));
		//오전 0, 오후 1
		System.out.println(calendar.get(calendar.AM_PM));
		//24시간 기준 시간
		System.out.println(calendar.get(calendar.HOUR_OF_DAY));
		//분
		System.out.println(calendar.get(calendar.MINUTE));
		//시간
		System.out.println(calendar.get(calendar.SECOND));
		//밀리초
		System.out.println(calendar.get(calendar.MILLISECOND));
		
		calendar.set(Calendar.YEAR, 2025);
		System.out.println(calendar.getTime());
		calendar.set(Calendar.DAY_OF_MONTH, 0);
		System.out.println(calendar.getTime());
		
		calendar.setTimeInMillis(0);
		System.out.println(calendar.getTime());
	}

}
