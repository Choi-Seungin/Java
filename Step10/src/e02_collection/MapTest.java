package e02_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	/*
	 * 				
	 * 
	 */
	public static void main(String[] args) {
		HashMap<String, Point> map = new HashMap<String, Point>();
		//데이터 추가
		map.put("A", new Point(10, 7));
		map.put("B", new Point(21, 14));
		map.put("Enemy", new Point(121, 78));
		map.put("player", new Point(5, 10));
		map.put("B", new Point(33, 24));
		
		System.out.println(map);
		
		//데이터 꺼내기 - 키값 이용함
		System.out.println(map.get("player"));
		System.out.println(map.get("B"));
		
		//전체 데이터를 꺼내기
		Set<String> key = map.keySet();
		for(String k : key) {
			System.out.println(k + " " + map.get(k));
		}
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String k = it.next();
			System.out.println(k + " " + map.get(k));
		}
		//키값에 해당하는 데이터가 없으면 null이 나옴
		System.out.println(map.get("C"));
		
		//데이터 삭제 - 키값으로 삭제
		map.remove("B");
		System.out.println(map);
		//맵에 저장된 데이터 개수
		System.out.println(map.size());
		//맵에 해당 키값이 있는지
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsKey("B"));
		//맵에 해당 데이터가 있는지
		System.out.println(map.containsValue(new Point(10, 4)));
		//맵에 내용 비우기
		map.clear();
		System.out.println(map);
		//맵에 내용이 비었는지
		System.out.println(map.isEmpty());
		
	}

}
