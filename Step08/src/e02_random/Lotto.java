package e02_random;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	
	//로또번호 한세트 리턴하는 메서드
	public static int[] generatelotto() {
		int[] arr = new int[6];
		Random r = new Random();
		for(int i = 0; i < arr.length; i++) {
			int n = r.nextInt(45)+1;
			if(isDuplicateNumber(arr, n)) {
				i--;
				continue;
			}
			arr[i] = n;
		}
		return arr;
	}
	
	//중복 체크하는 메서드
	public static boolean isDuplicateNumber(int[] arr, int n) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == n) 
				return true;
		}
		return false;
	}
	//로또번호 출력하는 메서드
	public static void printLottoNumber(int[] arr) {
		for(int n : arr) {
			System.out.print(String.format("%2d ", n));
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		for(int c = 0; c < 5; c++) {
		printLottoNumber(generatelotto());
		}
	}
}

