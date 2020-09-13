package thread;
/**
 * 线程的优先级
 * 线程启动后就纳入到了线程调度中统一管理，
 * 什么时候获取CPU时间片完全取决于线程调度，
 * 线程是不能主动索取的，通过调整线程的优先级
 * 可以最大程度的干涉分配CPU时间片的几率。
 * 
 * 理论上线程优先级越高的线程获取CPU时间片的
 * 几率越高。
 * 
 * 线程的优先级有10个等级，用整数1-10表示，
 * 1是最小，5是默认，10是最高
 * @author ta
 *
 */
public class PriorityDemo {
	public static void main(String[] args) {
		Thread min = new Thread() {
			public void run() {
				for(int i=0;i<10000;i++) {
					System.out.println("min");
				}
			}
		};
		Thread norm = new Thread() {
			public void run() {
				for(int i=0;i<10000;i++) {
					System.out.println("nor");
				}
			}
		};
		Thread max = new Thread() {
			public void run() {
				for(int i=0;i<10000;i++) {
					System.out.println("max");
				}
			}
		};	
		min.setPriority(Thread.MIN_PRIORITY);
		max.setPriority(Thread.MAX_PRIORITY);
		
		min.start();
		norm.start();
		max.start();
	}
}











