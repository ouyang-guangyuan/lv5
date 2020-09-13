package socket;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * �����ҷ����
 * @author ta
 */
public class Server {
	/*
	 * �����ڷ���˵�ServerSocket��Ҫ����������
	 * 1:��ϵͳ�������˿�,�ͻ��˾���ͨ�����
	 *   �˿������˳��������ӵ�
	 * 2:��������˿�,һ��һ���ͻ��˽������Ӿ�
	 *   �᷵��һ��Socketʵ��,����˾Ϳ���ͨ��
	 *   ���Socketʵ����ÿͻ��˽�����.  
	 */
	private ServerSocket server;	
	public Server() {
		try {
			/*
			 * ʵ����ServerSocketʱҪָ������
			 * �ķ���˿�,����ö˿ڱ�ϵͳ������
			 * ����ʹ��ʱ���׳��쳣.
			 */
			System.out.println("�������������...");
			server = new ServerSocket(8088);
			System.out.println("������������!");			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	public void start() {
		try {
			/*
			 * Socket accept()
			 * �÷�����һ����������,���ú�
			 * ��"��ס��",��ʱ��ʼ�ȴ��ͻ���
			 * ������,һ��һ���ͻ��˽�������
			 * ��ʱ�÷�������������һ��Socket
			 * ʵ��,ͨ�����Socket�Ϳ������
			 * �ͻ��˽�����.
			 */
			while(true) {
				System.out.println("�ȴ��ͻ�������...");
				Socket socket = server.accept();
				System.out.println("һ���ͻ���������!");
			
				//����һ���̴߳���ÿͻ��˽���
				ClientHandler handler = new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();							
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}		
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}	
	/**
	 * ���̸߳�����ָ���ͻ��˽���
	 * @author ta
	 */
	private class ClientHandler 
						implements Runnable{
		private Socket socket;
		private String host;//��¼�ͻ��˵�IP��ַ
		public ClientHandler(Socket socket) {
			this.socket = socket;
			//ͨ��socket��ȡԶ�˼������ַ��Ϣ
			host = socket.getInetAddress()
					.getHostAddress();
		}		
		public void run() {
			try {
				/*
				 * InputStream getInputStream()
				 * Socket�ĸ÷�����ȡ����������ȡ����
				 * Զ�˼�������͹������ֽ�
				 */
				InputStream in 
					= socket.getInputStream();
				InputStreamReader isr
					= new InputStreamReader(in,"UTF-8");
				BufferedReader br
					= new BufferedReader(isr);
				
				String message = null;
				/*
				 * ���ͻ��˶Ͽ�����ʱ����������readLine
				 * �������������:
				 * 1:����ֵΪnull��ͨ��linux�Ŀͻ��˶Ͽ�ʱ
				 *   ������������
				 * 2:ֱ���׳�SocketException:connection reset 
				 */
				while((message = br.readLine())!=null) {
					System.out.println(host+"˵:"+message);
				}
			} catch (Exception e) {				
			}
		}
	}		
}





