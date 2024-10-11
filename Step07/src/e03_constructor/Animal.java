package e03_constructor;

public class Animal {
	String speies;
	int age;
	
	//필드 초기화 생성자 단축키 : Alt + Shift + s -> o
	Animal(String speies, int age) {
		this.speies = speies;
		this.age = age;
	}

	Animal(int age) {
		this.age = age;
	}

	Animal(String speies) {
		this.speies = speies;
	}

	//기본 생성자 단축키 : Alt + Shift + s -> c
	public Animal() {
		
	}
	
	
	

}
