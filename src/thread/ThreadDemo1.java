package thread;
/**
 * ���߳�
 * ���̸߳ı��˴����ִ�з�ʽ����ԭ�е����д���
 * �����в����ı�Ϊ�������Ƭ��֮�䲢�в�����
 * ��˶��߳�����������Ƭ��"ͬʱ����"��
 * 
 * �����̵߳ķ�ʽ������
 * 1:�̳��̲߳���дrun��������run�����ж���
 *   �߳�Ҫִ�е�����
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
		 * �����߳��ǵ����̵߳�start����������
		 * ֱ�ӵ���run������
		 * ���̵߳�start�������ú��߳����뵽
		 * �̵߳����У������һ�η��䵽ʱ��Ƭ��
		 * ʼ����ʱ������run�������Զ���ִ�С�
		 */
		t1.start();
		t2.start();
	}
}
/**
 * ��һ�ִ����̵߳ķ�ʽ�ŵ��Ǵ����򵥷���
 * ����ȱ��Ҳ�Ƚ�����:
 * 1:����java�ǵ��̳еģ��⵼�¼̳����߳̾�
 *   �޷��ټ̳��������࣬��ᵼ���޷���������
 *   ����ķ����������̳г�ͻ���⡣
 * 
 * 2:�����̵߳�ͬʱ��дrun��������͵��ڹ涨��
 *   �߳�Ҫִ�еľ������񣬵����߳�����ִ�е�
 *   ���������Ȼ����Ϲ�ϵ���������̵߳�����  
 * 
 *
 */
class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("���ɶ?");
		}
	}
} 
class MyThread2 extends Thread{
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("����զ��!");
		}
	}
} 






