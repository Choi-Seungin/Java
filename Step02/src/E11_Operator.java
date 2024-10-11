
public class E11_Operator {

	/*
	 * 증감 연산자 : 변수의 값을 1씩 증가, 감소하는 연산자
	 * 	= 이 없어도 값을 변경시켜서 저장하는 연산자
	 * 변수++ 변수-- ++변수 --변수
	 * ++ : 변수의 값을 1 증가
	 * -- : 변수의 값을 1 감소
	 */
	public static void main(String[] args) {
		int n = 10;
		n++;
		System.out.println(n);
		++n;
		System.out.println(n);
		n--;
		System.out.println(n);
		--n;
		System.out.println(n);
		
		System.out.println("==============");
		
		int a = 10;
		System.out.println(a);//10
		System.out.println(a++);//10 선 실행 후 증가 후위형
		System.out.println(a);//11

		int b = 10;
		System.out.println(b);//10
		System.out.println(++b);//11 선 증가 후 실행 전위형
		System.out.println(b);//11
		
		int n1 = 5, n2 = 3;
		int result = n1++ +5 * ++n2 + n1; //5 + 5 * 4 + 6 = 31
		System.out.println(result); 
	}

}
