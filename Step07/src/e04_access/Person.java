package e04_access;
/*	접근 제어자
 * 		변수와 메서드를 접근할 수 있는 범위를 설정하는 옵션
 * 		private : 해당 클래스 내에서만 접근이 가능(외부에서 접근x)
 * 		protected : 해당 클래스를 상속 받은 자식(자손들까지 가능)클래스들 까지 접근이 가능
 *		default : 접근제어자를 사용 안했을 때 자동으로 붙음, 같은 패키지 내에 있는 클래스들 까지 접근 가능
 *  	public : 누구든지 접근이 가능 
 */		

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//나이 저장하는 메서드
	public void setAge(int age) {
		this.age = age;
	}
	//나이 반환하는 메서드
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	
	
}
