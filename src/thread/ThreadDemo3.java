package thread;
/**
 * ʹ�������ڲ���Ĵ�����ʽ����̵߳����ִ���
 * 
 * @author ta
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		//��һ�ִ�����ʽ
		Thread t1 = new Thread() {
			public void run() {
				for(int i=0;i<1000;i++) {
					System.out.println("����˭��?");
				}
			}
		};
		
		//�ڶ��ִ�����ʽ
		Runnable r2 = new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					System.out.println("���ǲ�ˮ���!");
				}
			}
		};
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
	}
}



