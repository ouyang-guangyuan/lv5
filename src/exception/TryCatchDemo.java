package exception;
/**
 * java异常处理机制中的try-catch
 * 语法:
 * try{
 * 	程序代码片段
 * }catch(XXXException e){
 * 	当try中出现XXXException后的解决代码
 * }
 * 或
 * try{
 * 
 * }finally{
 * 
 * }
 * 
 * @author ta
 *
 */
public class TryCatchDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了...");
		try {
//			String str = null;
//			String str = "";
			String str = "a";
			/*
			 * 当JVM执行程序是发现某个错误时就会
			 * 实例化对应的异常实例并将程序执行过
			 * 程设置好,然后将该异常抛出.
			 * 此时若没有异常处理机制,该异常会被
			 * 继续抛出到当前方法之外(这里就抛出
			 * 到main方法外).若最终抛给虚拟机,则
			 * 会直接中断.
			 */
			System.out.println(str.length());
			
			System.out.println(str.charAt(0));
			
			System.out.println(Integer.parseInt(str));
			/*
			 * 在try语句块中出错以下的代码都
			 * 不会被执行.
			 */
			System.out.println("!!!!!!");
			
		}catch(NullPointerException e) {
			System.out.println("出现了空指针!");
		/*
		 * catch是可以定义多个的,针对try中出现
		 * 的不同异常有不同处理方式时可以分别
		 * 捕获它们
		 */
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("出现了下标越界!");
		/*
		 * 可以在最后一个catch处捕获Exception,
		 * 来避免因为一个未捕获的异常导致程序
		 * 中断.
		 */
		}catch(Exception e) {
			System.out.println("反正就是出了个错!");
		}
		
		System.out.println("程序结束了!");
	}
}







