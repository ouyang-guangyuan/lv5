package thread;
/**
 * 第二种创建线程的方式
 * 实现Runnable接口并重写run方法来单独定义
 * 线程的任务。
 * @author ta
 *
 */
public class ThreadDemo2 {
	public static void main(String[] args) {
		//单独实例化任务
		Runnable r1 = new MyRunnable1();
		Runnable r2 = new MyRunnable2();
		
		//创建线程
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}

class MyRunnable1 implements Runnable{
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("你愁啥?");
		}
	}
}
class MyRunnable2 implements Runnable{
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("瞅你咋地!");
		}
	}
}









