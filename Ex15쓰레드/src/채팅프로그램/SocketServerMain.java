package 채팅프로그램;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerMain {

	public static void main(String[] args) {

		int socketPort = 1234; // 서버 채팅 포트 설정

		try { // 채팅 서버 열기
			ServerSocket serverSocket = new ServerSocket(socketPort);

			// 서버가 종료될때까지 클라이언트가 접속할 경우 해당 정보를 socketserver의 list에 저장
			while (true) {
				// 접속 시도하는 클라이언트 받기
				Socket socketUser = serverSocket.accept();
				SocketServer socketServer = new SocketServer(socketUser);
				socketServer.start(); // 멀티쓰레드 동작

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
