package e08_is_a;

public class InstanceOfMain {
	
	public static void run(Animal a) {
		//받아온 인스턴스가 Person이면 study 메서드 시행
		if(a instanceof Person) {
			Person p = (Person)a;
			p.study();
		}
		//받아온 인스턴스가 Dog면 run 메서드 실행
		if(a instanceof Dog) {
			Dog d = (Dog)a;
			d.run();
		}
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		Animal a = p;//작은 개념이 큰 개념이 되는 경우, 자동으로 형변환됨
		a.eat();
		Dog d = new Dog(); 
		a = d;
		a.eat();
		//큰 개념이 작은 개념으로 형변환 할 경우에는 강제로 형변환 시켜야됨
		Dog g = (Dog)a;
		//부모 클래스로 형변환한 인스턴스가 다시 자식 클래스로 형변환 할 때
		//해당 인스턴스가 원래 자식 클래스 타입인지 확인을 해야된다.
		System.out.println(a instanceof Dog);
		System.out.println(a instanceof Person);
		a = p;
		System.out.println(a instanceof Dog);
		System.out.println(a instanceof Person);
		run(d);
		run(p);
	}

}
