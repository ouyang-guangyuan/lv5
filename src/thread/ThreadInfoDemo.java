package thread;
/**
 * 获取线程信息的相关方法
 * @author ta
 *
 */
public class ThreadInfoDemo {
	public static void main(String[] args) {
		//获取主线程
		Thread main = Thread.currentThread();
		//获取线程的名字
		String name = main.getName();
		System.out.println("name:"+name);
		//获取唯一标识
		long id = main.getId();
		System.out.println("id:"+id);
		//获取线程的优先级
		int priority = main.getPriority();
		System.out.println("优先级:"+priority);
		
		boolean isAlive =  main.isAlive();
		boolean isDaemon = main.isDaemon();
		boolean inInterrupted = main.isInterrupted();
		System.out.println("isAlive:"+isAlive);
		System.out.println("isDaemon:"+isDaemon);
		System.out.println("inInterrupted:"+inInterrupted);
		
	}
}






