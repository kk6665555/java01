package tw.org.iii;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class java55 {

	public static void main(String[] args) {
		//TCP
	
		try {
			Socket a = new Socket(InetAddress.getByName("127.0.0.1"),1234);
			OutputStream out =a.getOutputStream();
			out.write("1234567890".getBytes());
			out.flush();
			a.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
	}

}
