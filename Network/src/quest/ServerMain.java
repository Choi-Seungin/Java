package quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	/*
	 * 서버 프로그램
	 * 포트번호 3333 서버 오픈
	 * 클라이언트 접속을 받은 후
	 * 클라이언트로 부터 숫자를 하나 받음
	 * 받은 숫자의 제곱을 클라이언트에게 전송
	 * 
	 * 주고 받는 데이터는 문자열로 보내고 받고
	 */
	public static void main(String[] args) {
		System.out.println("서버 프로그램을 실행합니다...");
		//1. 서버 오픈
		try (ServerSocket server = new ServerSocket(3333);
				// 2. 클라이언트 접속을 받음
				Socket client = server.accept();) {
			// 3. 입출력 스트림을 초기화
			PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			System.out.println("사용자로부터 데이터를 기다리는 중...");
			// 4. 데이터 입출력 처리
			// 4-1. 사용자로부터 데이터 받음
			String data = br.readLine();
			// 4-2. 받은 데이터를 숫자로 변경
			int n = Integer.parseInt(data);
			System.out.println("사용자가 입력한 숫자 : " + n);
			// 4-3. 계산 처리
			n *= n;
			// 4-4. 사용자에게 데이터를 전송
			pw.println(String.valueOf(n));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
