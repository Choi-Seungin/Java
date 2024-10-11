package bookex;

public class Dog {
	
	String name;
	String type;

	public Dog(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return type + " " + name;
	}



	public static void main(String[] args) {
		Dog d1 = new Dog("멍멍이", "진돗개");
		
		System.out.println(d1);

	}

}
