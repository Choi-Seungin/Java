package e02_file;

import java.io.File;
import java.util.ArrayList;

public class FileTest {
	
	public static void main(String[] args) {
		//파일클래스 생성자에는 파일 전체 경로, 해당 폴더 경로를 문자열로 초기화
		File file = new File("C:\\test\\img.jpg");
		System.out.println(file);
		//현재 파일의 절대 경로(실제 파일 위치 전체 경로) 위치값을 뽑음 -자주씀
		System.out.println(file.getAbsolutePath());
		//현재 파일의 저장된 폴더까지의 경로를 뽑음
		System.out.println(file.getParent());
		//파일 클래스에 저장된 경로가 파일인지? 확인하는 메서드
		System.out.println(file.isFile());
		System.out.println(file.getParentFile().isFile());
		//파일 클래스에 저장된 경로가 폴더(디렉토리)인지? 확인하는 메서드
		System.out.println(file.isDirectory());
		System.out.println(file.getParentFile().isDirectory());
		//파일 크기를 바이트 단위로 리턴하는 메서드
		System.out.println(file.length());
		//현재 파일이 위치한 파티션의 총 용량 크기
		System.out.println(file.getTotalSpace());
		//현재 파일이 위치한 파티션의 사용 가능한 용량 크기
		System.out.println(file.getUsableSpace());
		//해당 경로나 파일이 실제로 존재하는지 체크하는 메서드 -자주씀
		System.out.println(file.exists());
		//파일명
		System.out.println(file.getName());
		//현재 파일의 부모 폴더 경로를 파일 객체로 뽑음
		File parentPath = file.getParentFile().getParentFile();
		System.out.println(parentPath.getAbsolutePath());
		String[] arr = parentPath.list();
		for(String str : arr)
			System.out.println(str);
		
	}
	
}
