package thread;
/**
 * �߳��ṩ��һ����̬����:
 * static void sleep(long ms)
 * �÷�����������������������̴߳�������״̬
 * ָ���ĺ��룬��ʱ���̻߳��Զ��ص�RUNNABLE
 * ״̬�ٴβ������С�
 * @author ta
 *
 */
public class SleepDemo {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("���������");
	}
}






