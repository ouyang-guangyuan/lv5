package thread;
/**
 * 多线程
 * 多线程改变了代码的执行方式，从原有的所有代码
 * 都串行操作改变为多个代码片段之间并行操作。
 * 因此多线程允许多个代码片段"同时运行"。
 * 
 * 创建线程的方式有两种
 * 1:继承线程并重写run方法，在run方法中定义
 *   线程要执行的任务。
 * 
 * 
 * @author ta
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		/*
		 * 启动线程是调用线程的start方法而不是
		 * 直接调用run方法。
		 * 当线程的start方法调用后，线程纳入到
		 * 线程调度中，当其第一次分配到时间片开
		 * 始运行时，它的run方法会自动被执行。
		 */
		t1.start();
		t2.start();
	}
}
/**
 * 第一种创建线程的方式优点是创建简单方便
 * 但是缺点也比较明显:
 * 1:由于java是单继承的，这导致继承了线程就
 *   无法再继承其他的类，这会导致无法重用其他
 *   超类的方法而产生继承冲突问题。
 * 
 * 2:定义线程的同时重写run方法，这就等于规定了
 *   线程要执行的具体任务，导致线程与其执行的
 *   任务产生必然的耦合关系，不利于线程的重用  
 * 
 *
 */
class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("你愁啥?");
		}
	}
} 
class MyThread2 extends Thread{
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("瞅你咋地!");
		}
	}
} 






