package e01_string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str = "   Hello   ";
		System.out.println(System.identityHashCode(str));
		str += 100;
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		str = str.replace("l", "a");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		System.out.println();
		//-----------------------------------------------
		
		StringBuilder builder = new StringBuilder("Hello");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		builder.append("AAAA");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		builder.replace(0, 4, "BBBB");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		builder.delete(0, 4);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
		buffer.append("TEST");
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
	}
	

}
