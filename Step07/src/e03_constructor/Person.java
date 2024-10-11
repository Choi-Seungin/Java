package e03_constructor;
//이름, 나이 저장하는 클래스
//이름, 나이 출력하는 기능
//출력 형태 : 이름 / 나이
public class Person {
	String name;
	int age;
	
	/*
	 * 	생성자(Constructor)
	 * 		생성자는 객체를 하나 생성할 때 제일 먼저 실행되는 메서드
	 * 		만약에 생성자를 직접 작성하지 않으면,
	 * 		자바 컴파일러가 자동으로 아무런 일도 안하는 기본 생성자를 추가
	 * 		Person() {}
	 * 		1. 리턴타입 없음
	 * 		2. 메서드 이름이 클래스 이름과 같다.
	 */
	Person(){
		System.out.println("Person 기본 생성자");
	}
	
	Person(String n){
		System.out.println("Person(String) 생성자");
		name = n;
	}
	
	Person(String n, int a){
		System.out.println("Person(String, int) 생성자");
		name = n;
		age = a;
	}
	
	void printPersonInfo(){
		System.out.printf("%s / %d \n", name, age);
	}
}
