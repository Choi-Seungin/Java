package test1;
public class Quest22 {

    public static void main(String[] args) {

//정수형 배열 길이가 10인 배열을 생성하고 숫자 1~50중 랜덤하게 채움
    	//1. 길이가 9 new int[10]
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
        	//2. 범위가 틀림 (Math.random() * 50) + 1;
            arr[i] = (int)(Math.random() * 50) + 1;

        }
//홀수의 개수 출력

        int oddCount = 0;
        //3. i 의 범위가 틀림 i < arr.lenght;
        for (int i = 0; i < arr.length; i++) {
        	//4. 2로 나누면 0이 아니어야함 arr[i] % 2 != 0
            if (arr[i] % 2 != 0) {

                oddCount++;

            }

        }

        System.out.println("홀수의 개수: " + oddCount);

    }

}