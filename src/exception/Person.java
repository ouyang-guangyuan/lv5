package exception;
/**
 * ʹ�õ�ǰ������쳣���׳�
 * @author ta
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegalAgeException{
		if(age<0||age>100) {
			/*
			 * ��һ��������ʹ��throw�׳�һ���쳣
			 * ʱ��Ҫ�ڵ�ǰ������ʹ��throws����
			 * ���쳣���׳���֪������ȥ������쳣
			 * ע:
			 * ֻ���׳�RuntimeException����������
			 * �쳣ʱ���Բ�������
			 */
			throw new IllegalAgeException("���䲻�Ϸ�");
		}
		this.age = age;
	}
	
	
}
