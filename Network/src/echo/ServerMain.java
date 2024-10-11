package echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		System.out.println("서버 프로그램을 실행합니다...");
		// 1. 서버 오픈
		try (ServerSocket server = new ServerSocket(1111);
				// 2. 클라이언트 접속을 받음
				Socket client = server.accept();) {
			System.out.println(client.getInetAddress() + " 클라이언트 접속");
			// 3. 입출력 스트림을 초기화
			PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			System.out.println("사용자로부터 데이터를 기다리는 중...");
			// 4. 입출력 처리
			while (true) {
				String msg = br.readLine();
				System.out.println("사용자가 입력한 메시지 : " + msg);
				if (msg.equals("exit")) {
					System.out.println("서버 접속이 종료되었습니다.");
					break;
				} else {
				pw.println(msg);
				System.out.println("내가 보낸 메시지 : " + msg);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
