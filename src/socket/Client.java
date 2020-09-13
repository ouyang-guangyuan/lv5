package socket;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * �����ҿͻ���
 * @author ta
 *
 */
public class Client {
	/*
	 * java.net.Socket �׽���
	 * Socket��װ��TCPЭ�鴫�����ݵ�ϸ��,ʹ��
	 * ���ǿ���ͨ���������Ķ�д�����Զ�˼���
	 * �������ݽ���
	 */
	private Socket socket;
	/**
	 * ���췽��,������ʼ���ͻ���
	 */
	public Client() {
		try {
			/*
			 * ʵ����Socket�Ĺ��̾������ӷ���˵�
			 * ����.
			 * ����1:����˵�IP��ַ
			 * ����2:����˳���򿪵Ķ˿�
			 * 
			 * ����ͨ��IP�����ҵ������ϵķ��������
			 * �����,ͨ���˿ڿ����ҵ��ü����������
			 * �ķ����Ӧ�ó���Ӷ���������.
			 */
			System.out.println("�������ӷ����...");
			socket = new Socket("localhost",8088);
			System.out.println("�����ӷ����!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * �ͻ��˿�ʼ�����ķ���
	 */
	public void start() {
		try {
			Scanner scanner = new Scanner(System.in);
			/*
			 * Socket�ṩ�ķ���:
			 * OutputStream getOutputStream()
			 * ͨ���÷�����ȡ�������д�����ֽ�
			 * ��ͨ�����緢�͸�Զ�˼����.
			 */
			OutputStream out 
				= socket.getOutputStream();
			OutputStreamWriter osw
				= new OutputStreamWriter(
						out,"UTF-8");
			BufferedWriter bw
				= new BufferedWriter(osw);
			PrintWriter pw
				= new PrintWriter(bw,true);
			
			while(true) {
				String message = scanner.nextLine();
				pw.println(message);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
	
}











