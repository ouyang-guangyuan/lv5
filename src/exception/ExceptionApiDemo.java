package exception;
/**
 * 异常常用的方法
 * @author ta
 *
 */
public class ExceptionApiDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		
		try {
			String str = "a";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			/*
			 * 将当前的错误信息输出到控制台上
			 */
			e.printStackTrace();
			//获取错误消息
			String message = e.getMessage();
			System.out.println(message);
		}
		
		System.out.println("程序结束了");
	}
}





