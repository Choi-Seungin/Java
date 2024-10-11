package e05_quest;
/*
 * 전원 관리하는 클래스
 * 		전원 값 
 * 		전원을 켜고끄고하는 메서드
 * 		전원을 켜는 메서드, 전원을 끄는 메서드
 */
public interface Power {

	public void powerOn();
	
	public void powerOff();
	
	public void powerOnOff();
}