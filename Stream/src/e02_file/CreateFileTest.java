package e02_file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileTest {
	
	public static void main(String[] args) {
		//파일이 저장될 기본 경로를 먼저 설정
		File root = new File("C:\\test\\temp");
		
		//파일명 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명 입력하세요 : ");
		String fileName = sc.nextLine();
		
		File newFile = new File(root.getAbsolutePath() + "\\" + fileName);
		try {
		//1. 해당 폴더까지 경로가 있는지 체크
		if(!root.exists()) {
			root.mkdirs();//경로에 해당하는 모든 폴더를 생성, 있으면 생성하지 않음
			System.out.println("해당 경로 생성 완료");
		}
			//2. 파일 생성이나 업로드
			boolean result = newFile.createNewFile();
			if(result)
				System.out.println("파일 업로드 완료");
			else
				System.out.println("파일 업로드 실패");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
