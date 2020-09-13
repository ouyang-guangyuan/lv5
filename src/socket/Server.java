package socket;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 聊天室服务端
 * @author ta
 */
public class Server {
	/*
	 * 运行在服务端的ServerSocket主要有两个作用
	 * 1:向系统申请服务端口,客户端就是通过这个
	 *   端口与服务端程序建立连接的
	 * 2:监听服务端口,一旦一个客户端建立连接就
	 *   会返回一个Socket实例,服务端就可以通过
	 *   这个Socket实例与该客户端交互了.  
	 */
	private ServerSocket server;	
	public Server() {
		try {
			/*
			 * 实例化ServerSocket时要指定申请
			 * 的服务端口,如果该端口被系统的其他
			 * 程序使用时会抛出异常.
			 */
			System.out.println("正在启动服务端...");
			server = new ServerSocket(8088);
			System.out.println("服务端启动完毕!");			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	public void start() {
		try {
			/*
			 * Socket accept()
			 * 该方法是一个阻塞方法,调用后
			 * 就"卡住了",此时开始等待客户端
			 * 的连接,一旦一个客户端建立连接
			 * 此时该方法会立即返回一个Socket
			 * 实例,通过这个Socket就可以与该
			 * 客户端交互了.
			 */
			while(true) {
				System.out.println("等待客户端连接...");
				Socket socket = server.accept();
				System.out.println("一个客户端连接了!");
			
				//启动一个线程处理该客户端交互
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
	 * 该线程负责与指定客户端交互
	 * @author ta
	 */
	private class ClientHandler 
						implements Runnable{
		private Socket socket;
		private String host;//记录客户端的IP地址
		public ClientHandler(Socket socket) {
			this.socket = socket;
			//通过socket获取远端计算机地址信息
			host = socket.getInetAddress()
					.getHostAddress();
		}		
		public void run() {
			try {
				/*
				 * InputStream getInputStream()
				 * Socket的该方法获取的输入流读取的是
				 * 远端计算机发送过来的字节
				 */
				InputStream in 
					= socket.getInputStream();
				InputStreamReader isr
					= new InputStreamReader(in,"UTF-8");
				BufferedReader br
					= new BufferedReader(isr);
				
				String message = null;
				/*
				 * 当客户端断开连接时，服务端这边readLine
				 * 方法有两种情况:
				 * 1:返回值为null，通常linux的客户端断开时
				 *   会出现这种情况
				 * 2:直接抛出SocketException:connection reset 
				 */
				while((message = br.readLine())!=null) {
					System.out.println(host+"说:"+message);
				}
			} catch (Exception e) {				
			}
		}
	}		
}





