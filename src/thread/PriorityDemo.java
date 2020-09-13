package thread;
/**
 * �̵߳����ȼ�
 * �߳�����������뵽���̵߳�����ͳһ����
 * ʲôʱ���ȡCPUʱ��Ƭ��ȫȡ�����̵߳��ȣ�
 * �߳��ǲ���������ȡ�ģ�ͨ�������̵߳����ȼ�
 * �������̶ȵĸ������CPUʱ��Ƭ�ļ��ʡ�
 * 
 * �������߳����ȼ�Խ�ߵ��̻߳�ȡCPUʱ��Ƭ��
 * ����Խ�ߡ�
 * 
 * �̵߳����ȼ���10���ȼ���������1-10��ʾ��
 * 1����С��5��Ĭ�ϣ�10�����
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











