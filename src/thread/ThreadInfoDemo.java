package thread;
/**
 * ��ȡ�߳���Ϣ����ط���
 * @author ta
 *
 */
public class ThreadInfoDemo {
	public static void main(String[] args) {
		//��ȡ���߳�
		Thread main = Thread.currentThread();
		//��ȡ�̵߳�����
		String name = main.getName();
		System.out.println("name:"+name);
		//��ȡΨһ��ʶ
		long id = main.getId();
		System.out.println("id:"+id);
		//��ȡ�̵߳����ȼ�
		int priority = main.getPriority();
		System.out.println("���ȼ�:"+priority);
		
		boolean isAlive =  main.isAlive();
		boolean isDaemon = main.isDaemon();
		boolean inInterrupted = main.isInterrupted();
		System.out.println("isAlive:"+isAlive);
		System.out.println("isDaemon:"+isDaemon);
		System.out.println("inInterrupted:"+inInterrupted);
		
	}
}






