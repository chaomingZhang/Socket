package com.zcm.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	public static void main(String[] args) {
		MyClient client=new MyClient();
		client.sendMessage();				
	}	
	public void sendMessage(){
		PrintWriter writer=null;
		Socket socket=null;
		try {
			
			socket=new Socket("127.0.0.1",8899);
			writer=new PrintWriter(socket.getOutputStream(),true);
			
			writer.write("北京");
			writer.write("北京1");
			writer.write("北京2");
			writer.write("北京3");
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			writer.close();
			writer.flush();
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
}
