package exception;
/**
 * �Զ����쳣
 * �Զ����쳣ͨ����������ҵ���߼�����,����
 * �쳣java��û���ṩ��.
 * 
 * �Զ����쳣����:
 * 1:������,����Ӧ����������֪��
 * 2:��Ҫ�̳���Exception
 * 3:�ṩ���й��췽��
 * 
 * @author ta
 *
 */
public class IllegalAgeException extends Exception{
	private static final long serialVersionUID = 1L;

	public IllegalAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	
}







