
public class E12_Operator {
	/*
	 * 관계(비교) 연산자 --> 명제, 조건식
	 * 결과는 true, false로 나옴
	 * > < >= <= == != 
	 */
	public static void main(String[] args) {
		int n1 = 7, n2 = 1;
		
		System.out.println(n1 > n2);
		System.out.println(n1 < n2);
		System.out.println(n1 >= n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		
		double d1 = 0.1, d2 = 0.2;
		System.out.println(d1 + d2 == 0.3);
		System.out.println(d1 + d2);
		
		boolean flag = n1 == n2;
		System.out.println(flag);
		
		
	}

}
