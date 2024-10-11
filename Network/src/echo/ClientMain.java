package echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
	
	public static void main(String[] args) {
		// 1. 서버 접속
		try (Socket server = new Socket("127.0.0.1", 1111); Scanner sc = new Scanner(System.in)) {
			// 2. 입출력 스트림 초기화
			PrintWriter pw = new PrintWriter(server.getOutputStream(), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			// 3. 입출력 처리
			while (true) {
				System.out.print("메세지를 입력하세요 : ");
				pw.println(sc.nextLine());
				String msg = br.readLine();
				System.out.println("서버에서 전송 받은 메시지 : " + msg);
				if (msg == null) {
					System.out.println("서버 접속이 종료되었습니다.");
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
