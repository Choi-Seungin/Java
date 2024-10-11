package e02_overriding;

public class DogMain {
	
	public static void dogEat(Dog dog) {
		dog.eat();
		//dog.run(); husky에만 있는 기능 호출 x
	}
	
	public static void main(String[] args) {
		Retriever retriever = new Retriever();
		retriever.eat();
		Bulldog bulldog = new Bulldog();
		bulldog.eat();
		Husky husky = new Husky();
		husky.eat();
		System.out.println("-------------------");
		dogEat(retriever);
		dogEat(bulldog);
		dogEat(husky);
	}

}
