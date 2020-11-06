package socket;
import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;


public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// tạo 2 biến String để nhận và gửi dữ liệu từ/cho client
				String data_from_client;
				String data_to_client;
				
				// tạo socket server, chờ tại cổng "6543"
				ServerSocket welcomeSocket = new ServerSocket(6543);
				
				while(true) {
					// chờ yêu cầu từ client
					Socket connectionSocket = welcomeSocket.accept();
					
					// tạo input stream, nối với socket
					BufferedReader infromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
					
					// tạo output stream, nối với socket
					DataOutputStream outtoClient = new DataOutputStream(connectionSocket.getOutputStream());
					
					// đọc thông tin từ socket
					data_from_client = infromClient.readLine();
					data_to_client = data_from_client + " (Server accepted!)" + " \n";
					// ghi dữ liệu ra socket
					outtoClient.writeBytes(data_to_client);
					return;
				}
	

	}

}
/*
 * package socket;

import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;

public class Server {
	public static void main(String argv[]) throws Exception{
		// tạo 2 biến String để nhận và gửi dữ liệu từ/cho client
		String data_from_client;
		String data_to_client;
		
		// tạo socket server, chờ tại cổng "6543"
		ServerSocket welcomeSocket = new ServerSocket(6543);
		
		while(true) {
			// chờ yêu cầu từ client
			Socket connectionSocket = welcomeSocket.accept();
			
			// tạo input stream, nối với socket
			BufferedReader infromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			
			// tạo output stream, nối với socket
			DataOutputStream outtoClient = new DataOutputStream(connectionSocket.getOutputStream());
			
			// đọc thông tin từ socket
			data_from_client = infromClient.readLine();
			data_to_client = data_from_client + " (Server accepted!)" + " \n";
			// ghi dữ liệu ra socket
			outtoClient.writeBytes(data_to_client);
			return;
		}
		
		
	}

}
 */
