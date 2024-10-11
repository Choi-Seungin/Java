package e01_object;

public class CloneMain {

	public static void main(String[] args) {
		Point p1 = new Point(10, 7);
		Point p2 = p1.clone();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.equals(p2));
		System.out.println(System.identityHashCode(p1));
		System.out.println(System.identityHashCode(p2));
		
		p1.setX(50);
		System.out.println(p1);
		System.out.println(p2);
	}

}
