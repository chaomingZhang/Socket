package com.zcm.socket;



import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientFileAccept {
	public static void main(String[] args) {
		Socket client=null;
		DataInputStream dis=null;
		DataOutputStream dos=null;	
		try {
			client=new Socket("127.0.0.1", 8221);
			dis=
					new DataInputStream(new BufferedInputStream(client.getInputStream()));
			
			String filename=dis.readUTF();//���������ļ�
			File file=new File("e:\\"+filename);
			
			dos=
					new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			
			int n=-1;
			byte[] buffer=new byte[1024];
			//����д��仰����Ϊ�������Ѿ��������ļ��ĳ��ȣ�Ҫд ��д Ҫ������д
			long l=dis.readLong();
			while((n=dis.read(buffer))!=-1){
				
				dos.write(buffer, 0, n);
				
			}
			
			System.out.println("success");
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				dis.close();
				dos.flush();
				dos.close();
				client.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
	}
}
