package e03_file_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextWriteMain {

	public static void main(String[] args) {
		// 1. 노드 스트림, 프로세스 스트림 생성 및 초기화
		try (FileWriter fw = new FileWriter("c:\\test\\write.txt", true); 
				PrintWriter pw = new PrintWriter(fw);) {

			// 2. 텍스트 출력
			pw.println("안녕하세요");
			pw.println("몬헌하고싶다");
			pw.println("와일즈");
			pw.println("2월 출시");
			pw.println("12341234");
			pw.println("Hello Wo");
			pw.println("abcabc");
			pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
