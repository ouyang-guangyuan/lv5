package exception;
/**
 * java�쳣��������е�try-catch
 * �﷨:
 * try{
 * 	�������Ƭ��
 * }catch(XXXException e){
 * 	��try�г���XXXException��Ľ������
 * }
 * ��
 * try{
 * 
 * }finally{
 * 
 * }
 * 
 * @author ta
 *
 */
public class TryCatchDemo {
	public static void main(String[] args) {
		System.out.println("����ʼ��...");
		try {
//			String str = null;
//			String str = "";
			String str = "a";
			/*
			 * ��JVMִ�г����Ƿ���ĳ������ʱ�ͻ�
			 * ʵ������Ӧ���쳣ʵ����������ִ�й�
			 * �����ú�,Ȼ�󽫸��쳣�׳�.
			 * ��ʱ��û���쳣�������,���쳣�ᱻ
			 * �����׳�����ǰ����֮��(������׳�
			 * ��main������).�������׸������,��
			 * ��ֱ���ж�.
			 */
			System.out.println(str.length());
			
			System.out.println(str.charAt(0));
			
			System.out.println(Integer.parseInt(str));
			/*
			 * ��try�����г������µĴ��붼
			 * ���ᱻִ��.
			 */
			System.out.println("!!!!!!");
			
		}catch(NullPointerException e) {
			System.out.println("�����˿�ָ��!");
		/*
		 * catch�ǿ��Զ�������,���try�г���
		 * �Ĳ�ͬ�쳣�в�ͬ����ʽʱ���Էֱ�
		 * ��������
		 */
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("�������±�Խ��!");
		/*
		 * ���������һ��catch������Exception,
		 * ��������Ϊһ��δ������쳣���³���
		 * �ж�.
		 */
		}catch(Exception e) {
			System.out.println("�������ǳ��˸���!");
		}
		
		System.out.println("���������!");
	}
}







