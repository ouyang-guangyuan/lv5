package exception;
/**
 * �쳣���׳�
 * throw�ؼ���,���������׳�һ���쳣.
 * ͨ������������ǻ������׳��쳣:
 * 1:��������һ�������﷨Ҫ��,���ǲ�����ҵ��
 *   �߼�Ҫ��ʱ,���ǿ��������׳��쳣��֪����
 *   ����Ӧ��������.
 * 2:����ȷʵ�������쳣,���Ǹ��쳣��Ӧ���ڵ�ǰ
 *   ����Ƭ�α����ʱ���Զ����׳������÷����.  
 * @author ta
 *
 */
public class ThrowDemo {
	public static void main(String[] args) {
		
		Person p = new Person();
		/*
		 * ������һ������throws�����쳣�׳���
		 * ����ʱ,������Ҫ����봦����쳣,��
		 * ����벻ͨ��.
		 * �����쳣�ķ�ʽ������:
		 * 1:ʹ��try-catch���񲢴�����쳣
		 * 2:�ڵ�ǰ�����ϼ���ʹ��throws�����쳣���׳�
		 */
		try {
			p.setAge(10);//�����﷨,���ǲ�����ҵ��Ҫ��
		} catch (IllegalAgeException e) {
			System.out.println("������!");
		}
		System.out.println(p.getAge());
		
		
	}
}







