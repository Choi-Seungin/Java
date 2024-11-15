package e09_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateFormatTest {

	public static void main(String[] args) {
		// 날짜 생성
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 8);
		// 날짜 서식 문자를 이용해서 원하는 형태로 날짜를 문자열로 만들어주는 클래스
		SimpleDateFormat sdf = new SimpleDateFormat();
		// 연도 4자리
		sdf.applyPattern("yyyy");
		System.out.println(sdf.format(cal.getTime()));
		// 연도 2자리
		sdf.applyPattern("yy");
		System.out.println(sdf.format(cal.getTime()));
		// 월 1자리
		sdf.applyPattern("M");
		System.out.println(sdf.format(cal.getTime()));
		// 월 2자리
		sdf.applyPattern("MM");
		System.out.println(sdf.format(cal.getTime()));
		// 로컬 형식 월 약자
		sdf.applyPattern("MMM");
		System.out.println(sdf.format(cal.getTime()));
		// 로컬 형식 월 풀네임
		sdf.applyPattern("MMMM");
		System.out.println(sdf.format(cal.getTime()));
		// 일 1자리
		sdf.applyPattern("d");
		System.out.println(sdf.format(cal.getTime()));
		// 일 2자리
		sdf.applyPattern("dd");
		System.out.println(sdf.format(cal.getTime()));
		// 요일
		sdf.applyPattern("E");
		System.out.println(sdf.format(cal.getTime()));
		// 로컬형식 요일 약자
		sdf.applyPattern("EEE");
		System.out.println(sdf.format(cal.getTime()));
		// 로컬형식 요일 풀네임
		sdf.applyPattern("EEEE");
		System.out.println(sdf.format(cal.getTime()));
		// 시간 24시 기준 한자리
		cal.set(Calendar.HOUR, 7);
		sdf.applyPattern("H");
		System.out.println(sdf.format(cal.getTime()));
		// 시간 24시 기준 두자리
		sdf.applyPattern("HH");
		System.out.println(sdf.format(cal.getTime()));
		// AM PM - 로컬 형식
		cal.set(Calendar.HOUR, 15);
		sdf.applyPattern("a");
		System.out.println(sdf.format(cal.getTime()));
		// 시간 1자리 - 12시간 기준
		sdf.applyPattern("h");
		System.out.println(sdf.format(cal.getTime()));
		// 시간 2자리 - 12시간 기준
		sdf.applyPattern("hh");
		System.out.println(sdf.format(cal.getTime()));
		// 분 1자리
		sdf.applyPattern("m");
		System.out.println(sdf.format(cal.getTime()));
		// 분 2자리
		sdf.applyPattern("mm");
		System.out.println(sdf.format(cal.getTime()));
		// 초 1자리
		sdf.applyPattern("s");
		System.out.println(sdf.format(cal.getTime()));
		// 초 2자리
		sdf.applyPattern("ss");
		System.out.println(sdf.format(cal.getTime()));

		// yyyy-MM-dd HH:mm:ss
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(cal.getTime()));
		sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		System.out.println(sdf.format(cal.getTime()));

		sdf = new SimpleDateFormat("MMM MMMM E EEE EEEE", Locale.ENGLISH);
		System.out.println(sdf.format(cal.getTime()));
	}

}
