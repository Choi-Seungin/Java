package e01_generic;

public class GenericMain {
	
	public static void main(String[] args) {
		//GenericBox<Apple> appleBox = new GenericBox<Apple>();
		GenericBox<Apple> appleBox = new GenericBox<>();
		
		//데이터를 넣고 꺼낼 때 형변환이 필요없는 경우는
		//제네릭에서 생성 시 타입을 지정했기 때문에
		appleBox.setObj(new Apple());
		appleBox.getObj().printApple();
	}
	
	
}
