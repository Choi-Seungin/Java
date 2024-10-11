package e02_collection;

import java.util.TreeSet;

public class SetObjectExample {
	
	public static void main(String[] args) {
		TreeSet<Point> set = new TreeSet<Point>();
		
		//set에 Point 데이터 5건 저장, 그 중에 한건은 동일한 객체 저장
		set.add(new Point(10, 7));
		set.add(new Point(11, 72));
		set.add(new Point(30, 5));
		set.add(new Point(6, 43));
		set.add(new Point(30, 5));
		set.add(new Point(30, 7));
				
		//set에 내용을 출력
		System.out.println(set);
	}
}
