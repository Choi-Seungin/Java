
public class E11_Break {
	/*
	 * 	break
	 * 		break를 직접 감싸고 있는 반복문 및 switch 1개만 종료
	 * 		일반적으로 반복문에서는 if문과 같이 사용(특정 조건을 만족할 때 종료하기 위해)
	 */

	public static void main(String[] args) {
		int i = 1, sum = 0;
		
		while(true) {
			sum +=i;
			i++;
			
			if(sum > 2000)
				break;
		}
		System.out.println(sum);
	}
}
