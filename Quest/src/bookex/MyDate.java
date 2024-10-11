package bookex;

import java.util.Objects;

public class MyDate {
	private int day, month, year;

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}




	public static void main(String[] args) {
		MyDate d1 = new MyDate(9, 18, 2004);
		MyDate d2 = new MyDate(9, 18, 2004);
		
		System.out.println(d1.equals(d2));
	}
	
	

}
