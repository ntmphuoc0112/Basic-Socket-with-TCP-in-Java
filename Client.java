/*
package socket;
import java.io.*;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String data_from_server;
		String data_to_server;
		
		// tạo inputstream (từ bàn phím)
		System.out.println("Input from client: ");
		BufferedReader infromUser = new BufferedReader(new InputStreamReader(System.in));
		
		// lấy chuỗi ký tự nhập từ bàn phím 
		data_to_server = infromUser.readLine();
		
		// tạo socket cho client kết nối đến server qua IP address và port number
		Socket clientSocket = new Socket("127.0.0.1", 6543);

		// tạo output stream kết nối socket
		DataOutputStream outtoServer = new DataOutputStream(clientSocket.getOutputStream());
		// tạo input stream nối với socket
		BufferedReader intoServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		// gửi chuỗi ký tự tới server thông qua outputStream đã nối với socket
		outtoServer.writeBytes(data_to_server + "\n");
		
		// đọc thông tin từ server thông qua inputStream đã nối với socket
		data_from_server = infromUser.readLine();
		
		// in kết quả ra màn hình
		System.out.println("FROM SERVER: " +data_from_server);
		
		// đóng liên kết socket
		clientSocket.close();
	}

}*/

package socket;
import java.io.*;
import java.net.Socket;
public class Client {
    public static void main(String argv[]) throws Exception
    {
        String sentence_to_server;
        String sentence_from_server;
    
        //Tạo Inputstream(từ bàn phím)
        System.out.print("Input from client: ");
        BufferedReader inFromUser =
            new BufferedReader(new InputStreamReader(System.in));
        //Lấy chuỗi ký tự nhập từ bàn phím
        sentence_to_server = inFromUser.readLine();
//    
        //Tạo socket cho client kết nối đến server qua ID address và port number
        Socket clientSocket = new Socket("192.168.203.1", 6543);
    
        //Tạo OutputStream nối với Socket
        DataOutputStream outToServer =
            new DataOutputStream(clientSocket.getOutputStream());
    
        //Tạo inputStream nối với Socket
        BufferedReader inFromServer =
            new BufferedReader(new
            InputStreamReader(clientSocket.getInputStream()));
//     
        //Gửi chuỗi ký tự tới Server thông qua outputStream đã nối với Socket (ở trên)
        outToServer.writeBytes(sentence_to_server + '\n');
    
        //Đọc tin từ Server thông qua InputSteam đã nối với socket
        sentence_from_server = inFromServer.readLine();
    
        //print kết qua ra màn hình
        System.out.println("FROM SERVER: " + sentence_from_server);
    
        //Đóng liên kết socket
        clientSocket.close();    
    } 
}
