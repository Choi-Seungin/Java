package e06_has_a;
/*
 * 총
 * 		필드
 * 			총알 - 12발
 * 		메서드
 * 			총쏘는 기능 - 1발씩 발사, 총알이 없으면 자동으로 재장전
 * 			재장전
 */
public class Gun {
	private int bullet;
	private final int MAX_BULLET = 12;
	
	public Gun() {
		bullet = 12;
	}

	public void shoot() {
		if(bullet == 0) reload();
		else bullet--;
		System.out.println("BBang!!!");
	}
	
	public void reload() {
		bullet = MAX_BULLET;
		System.out.println("reload!!!");
	}

}
