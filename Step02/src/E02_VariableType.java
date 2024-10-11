
public class E02_VariableType {

	public static void main(String[] args) {
		/*
		 *	변수 타입 (고정형Primitive) 
		 *		정수형 : byte(1), short(2), int(4), long(8)
		 *		실수형 : float(4), double(8) 
		 * 		문자형 : char(2)
		 * 		논리형 : boolean(1)
		 * 
		 * 	변수명 짓는 규칙
		 * 		1. 알파뱃(대소문자 구분), 숫자, 특수문자 -> _$
		 * 		2. 키워드와 동일하면 안됨
		 * 		3. 첫글자로 숫자가 올 수 없다
		 * 		4. 중복된 변수명을 쓸 수 없다
		 * 	변수명 네이밍 규칙
		 * 		Camel Case(카멜) : 변수명, 메서드명
		 * 			첫글자는 소문자로 시작 합성어 두번째 단어부터 첫글자는 대문자
		 * 		Snake Case(스네이크) : 상수명
		 * 			단어 사이를 _로 구분 이름이 전부 소문자이거나 대문자일때
		 * 		Pascal Case(파스칼) : 클래스명, 인터페이스명
		 * 			첫글자 대문자 합성어일때 두번째 단어부터 첫글자는 대문자
		 * 
		 */
		
		int i = 2147483647;//리터럴
		System.out.println(i);
		
		long l = 9223372036854775807L;
		System.out.println(l);
		
		short s = 32767;
		System.out.println(s);
		
		byte b = 127;
		System.out.println(b);
		
		b += 1;
		System.out.println(b);
		
		float f = 3.1415f;
		System.out.println(f);
		
		double d = 3.1415;
		System.out.println(d);
		
		char c1 = 'A'; //65
		System.out.println(c1);
		
		char c2 = 65;
		System.out.println(c2);
		
		int i1 = c1;
		System.out.println(i1);
		
		char c3 = '家';
		int i2 = c3;
		System.out.println(i2);
		
		boolean flag = true;
		System.out.println(flag);
		flag = false;
		System.out.println(flag);
		
		//문자열 (참조형 Reference)
		String str = "안녕하세요";
		System.out.println(str);
		str = "Hello World";
		System.out.println(str);
		
	}

}
