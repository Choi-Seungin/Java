package e07_has_a;
/*
 * 	총
 * 		필드
 * 			총알 - 12발
 * 		메서드
 * 			총쏘는 기능 - 1발씩 발사, 총알이 없으면 자동으로 재장전
 * 			재장전
 */
public class Gun {
	protected int bullet;
	
	public Gun() {
		bullet = 12;
	}

	public void shot() {
		if(bullet == 0) reload();
		else bullet--;
		System.out.println("BBang!!!");
	}
	
	public void reload() {
		bullet = 12;
		System.out.println("reload!!!");
	}

}
