package e05_class_array;

public class StudentMain {

	public static void main(String[] args) {
		Student[] arr = new Student[5];
		
		arr[0] = new Student("김씨", "2000", "컴공", 3.14);
		arr[1] = new Student("박씨", "2001", "게임", 4.1);
		arr[2] = new Student("최씨", "2002", "연극", 2.4);
		arr[3] = new Student("유씨", "2003", "조리", 3.5);
		arr[4] = new Student("장씨", "2004", "경제", 4.5);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	}
}
