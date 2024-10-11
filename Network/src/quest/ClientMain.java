package quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
	/*
	 * 클라이언트 프로그램 ip는 127.0.0.1 포트번호 3333 서버 접속 사용자로부터 숫자 하나를 받음 받은 숫자를 문자열로 변환해서
	 * 서버로 보냄 서버에서 보낸 결과값을 출력
	 */
	public static void main(String[] args) {
		// 1. 서버 접속
		try (Socket server = new Socket("127.0.0.1", 3333);
				Scanner sc = new Scanner(System.in)) {
			// 2. 입출력 스트림 초기화
			PrintWriter pw = new PrintWriter(server.getOutputStream(), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			// 3. 입출력 처리
			// 3-1. 숫자를 입력 후 문자열로 변경해서 서버로 전송
			System.out.print("숫자를 입력하세요 : ");
			int n = sc.nextInt();
			pw.println(String.valueOf(n));
			// 3-2. 서버가 보낸 데이터를 받아서 출력
			String msg = br.readLine();
			System.out.println("서버에서 보낸 결과값 : " + msg);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
