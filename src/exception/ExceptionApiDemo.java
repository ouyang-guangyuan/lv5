package exception;
/**
 * �쳣���õķ���
 * @author ta
 *
 */
public class ExceptionApiDemo {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		
		try {
			String str = "a";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			/*
			 * ����ǰ�Ĵ�����Ϣ���������̨��
			 */
			e.printStackTrace();
			//��ȡ������Ϣ
			String message = e.getMessage();
			System.out.println(message);
		}
		
		System.out.println("���������");
	}
}





