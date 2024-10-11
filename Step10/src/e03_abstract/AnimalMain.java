package e03_abstract;

public class AnimalMain {

	public static void main(String[] args) {
		//Animal a1 = new Animal();
		Person p = new Person();
		
		p.eat();
		p.run();
		
		//추상 클래스도 데이터 타입, 자식 클래스를 형변환 시켜서 저장
		Animal a = p;
		a.run();
	}

}
