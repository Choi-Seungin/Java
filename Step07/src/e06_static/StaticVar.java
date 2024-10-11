package e06_static;

public class StaticVar {
	/*
	 * static으로 선언된 변수나 메서드는 메타영역에 저장
	 * 메타영역은 정적인 메모리로 프로그램 시작부터 끝날때까지 유지되는 메모리
	 * 프로그램 시작부터 끝날때까지 유지가되니까, 어느곳에서나 접근이 가능
	 */
	public static int n1 = 10;
	public int n2 = 20;
	public static void main(String[] args) {
		//static 키워드가 붙어있으면 미리 메모리가 할당되었기 때문에 접근이 가능함
		System.out.println(n1);
		//n2 는 staticVar 클래스의 필드이기 때문에 아직생성이 안되었다.
		//그래서 접근이 불가능하다. static을 안붙여주면 사용x
		//System.out.println(n2);
		//non= static은 반드시 생성 후에 실행;
		StaticVar var = new StaticVar();
		System.out.println(var.n2);
		//static으로 선언된 변수나 상수, 메서드에 접근하는 방법
		//클래스명.변수명, 클래스명.상수명 클래스명.메서드()
		System.out.println(StaticVar.n1);
		//객체명.변수명, 객체명.상수명, 객체명,메서드();
		System.out.println(var.n1);
		System.out.println(Math.PI);
		
	}

}
