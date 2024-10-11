
public class E19_Quest {

	/*
	 * 알파뱃 A부터 Z까지 출력
	 * 단, 대문자와 소문자를 아래 형식으로 출력
	 * A - a
	 * B - b
	 * ....
	 * Z - z
	 * char 형 변수
	 * A와 a의 문자코드값을 이용
	 */
	public static void main(String[] args) {
		for(char i = 'A', j = 'a'; i <= 'Z'; i++, j++ )
			System.out.println(i +" - " + j);
		
		System.out.println("-----------");
		
		for(char ch = 'A'; ch <= 'Z'; ch++)
			System.out.println(ch +" - " + (char)(ch+32));
	}
}
