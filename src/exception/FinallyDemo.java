package exception;
/**
 * finally块
 * finally块是异常处理机制中的最后一部分,它
 * 可以直接跟在try语句块之后或者最后一个catch
 * 块之后.
 * finally可以保证只要程序执行到try当中,无论
 * 是否出现异常,finally中的代码都必定执行.
 * 
 * 通常我们可以将释放资源这样的必须操作的代码
 * 放在这里.
 * @author ta
 *
 */
public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了...");
		try {
			String str = "";
			System.out.println(str.length());
			return;
		} catch (Exception e) {
			System.out.println("出错了!");
		} finally {
			System.out.println("finally代码执行了!");
		}
		System.out.println("程序结束了");
	}
}








