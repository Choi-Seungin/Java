package e01_object;

public class Person {
	//이름
	private String name;
	//나이
	private int age;
	
	//전체 필드 초기화하는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//객체 내용을 문자열로 만들어서 리턴
	//필드, 메서드에 리턴 값이 있는 경우 --> 외부에다 알려줄 내용만 선택해서 사용
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() + age;
	}
	
	//객체가 동일한지 비교하는 메서드
	@Override
	public boolean equals(Object obj) {
		//Person 객체가 Object로 형변환 되서 받아옴
		//1. 메모리 주소가 같으면 같은 객체
		if(this == obj) return true;
		//2. null인지 체크
		if(obj == null) return false;
		//3. 받아온 obj가 현재 객체랑 비교할 수 있는 타입인지 확인
		// instanceOf, getClass()를 활용함.
		if(obj instanceof Person) {
			//1. obj를 형변환
			Person temp = (Person) obj;
			//2. 내용 비교 결과값 리턴
			return name.equals(temp.name) && age == temp.age;
		}
		//3번이거짓이면 타입이 다르기 때문에 거짓으로 처리
		return false;
	}
	
	
}
