package e04_list;

import java.util.ArrayList;

public class StringListEx {

	public static void main(String[] args) {
		//문자열 저장하는 ArrayList 생성
		ArrayList<String> list = new ArrayList<String>();
		
		//문자열 데이터 5건 저장
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		
		System.out.println(list);
		
		//데이터 삭제
		String result = list.remove(2);
		System.out.println(result);
		System.out.println(list);
		System.out.println(list.remove("ddd"));
		System.out.println(list.remove("ddd"));
		System.out.println(list);
		
		//전체 조회 반복문
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(String str : list) {
			System.out.println(str);
		}
	}

}
