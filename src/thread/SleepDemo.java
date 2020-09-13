package thread;
/**
 * 线程提供了一个静态方法:
 * static void sleep(long ms)
 * 该方法可以让运行这个方法的线程处于阻塞状态
 * 指定的毫秒，超时后线程会自动回到RUNNABLE
 * 状态再次并发运行。
 * @author ta
 *
 */
public class SleepDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("程序结束了");
	}
}






