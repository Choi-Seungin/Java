package e08_is_a;

public class IsAMain {

	public static void main(String[] args) {
		Person p = new Person();
		Dog d = new Dog();
		
		Animal a = p;
		a.eat();
		Person e = (Person)a;
		e.eat();
		System.out.println(System.identityHashCode(p));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(e));
		
		a = d;
		a.eat();
		d.eat();
		Dog g = (Dog) a;
		g.eat();
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(d));
		System.out.println(System.identityHashCode(g));
		
		Animal a1 = d;
		//Animal에 Dog 인스턴스 이기 때문에 Dog는 Person으로 변경 x
		//Dog와 Person은 관계가 없다.
		Person pr = (Person) a1;
		pr.eat();
		
		
	}
	

}
