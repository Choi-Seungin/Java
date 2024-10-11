package e01_string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		String str1 = "Hello World";
		//저장하고 있는 문자열을 바이트형 배열로 변환
		byte[] arr = str1.getBytes();
		//배열에 저장된 내용을 출력
		System.out.println(Arrays.toString(arr));
		//바이트형 배열을 문자열로 변환
		String str2 = new String(arr);
		System.out.println(str2);
		//해당 인덱스 번호에 위치한 문자 하나 리턴
		System.out.println(str1.charAt(4));
		
		String str3 = "Hello World Hello Java World";
		//문자열 왼쪽부터 검색
		System.out.println(str3.indexOf("World"));
		//문자열 왼쪽부터 검색, 7번째 인덱스부터 검색
		System.out.println(str3.indexOf("World", 7));
		//문자열 왼쪽부터 검색, 24번째 인덱스부터 검색, 검색 결과가 없으면 -1
		System.out.println(str3.indexOf("World", 24));
		//문자열 오른쪽 끝에서부터 검색 - 검색 결과는 인덱스 번호, 결과가 없으면 -1
		System.out.println(str3.lastIndexOf("World"));
		System.out.println(str3.lastIndexOf("World",22));
		//알파벳을 전부 소문자로 변환
		System.out.println(str3.toUpperCase());
		//알파벳을 전부 대문자로 변환
		System.out.println(str3.toLowerCase());
		//글자 개수
		System.out.println(str3.length());
		//문자열 부분 추출 - 10번 인덱스부터 마지막 인덱스까지 문자열을 잘라내서 리턴
		System.out.println(str3.substring(10));
		//문자열 부분 추출 - 10번 인덱스부터 15번 인덱스 전까지 문자열을 잘라내서 리턴
		System.out.println(str3.substring(10,15));
		//문자열 바꾸기
		System.out.println(str3.replace("World", "Hell"));
		
		String str4 = "          Hello World          ";
		//문자열 개수랑 문자열 출력
		System.out.println(str4.length());
		System.out.println(str4);
		//문자열 양쪽에 있는 필요없는 공백을 제거
		System.out.println(str4.trim());
		System.out.println(str4.trim().length());
		
		String str5 = "java,html,css,javascript,jsp,spring";
		//문자열을 구분자 기준으로 잘라서 배열로 만들어줌
		String[] result = str5.split(",");
		System.out.println(Arrays.toString(result));
		//문자열로 된 배열을 하나의 문자열로 만들어 줌
		//문자열과 문자열 사이에 구분자 넣어줌 -> "/"
		String str6 = String.join(" / ", result);
		System.out.println(str6);
		
		//문자열 포맷 - %s, %d, %f, %x, %X, %b, %c,%g
		//%10d --- 10출력 공간을 확보 양수는 오른쪽, 음수는 왼쪽 정렬
		//%.2f --- 소수점 둘째자리 표시, 셋째 자리에서 반올림
		System.out.println(String.format("이름 : %s, 나이 : %d", "김철수", 20));
		System.out.println(String.format("%d %x %o", 10, 10, 10));
		System.out.println(String.format("%d %X %o", 10, 10, 10));
		System.out.println(String.format("%05d", 10));
		System.out.println(String.format("%b %c", true, '가'));
		System.out.println(String.format("%f %g", 3.1415, 3.1415));
	}
}
