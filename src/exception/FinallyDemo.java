package exception;
/**
 * finally��
 * finally�����쳣��������е����һ����,��
 * ����ֱ�Ӹ���try����֮��������һ��catch
 * ��֮��.
 * finally���Ա�ֻ֤Ҫ����ִ�е�try����,����
 * �Ƿ�����쳣,finally�еĴ��붼�ض�ִ��.
 * 
 * ͨ�����ǿ��Խ��ͷ���Դ�����ı�������Ĵ���
 * ��������.
 * @author ta
 *
 */
public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("����ʼ��...");
		try {
			String str = "";
			System.out.println(str.length());
			return;
		} catch (Exception e) {
			System.out.println("������!");
		} finally {
			System.out.println("finally����ִ����!");
		}
		System.out.println("���������");
	}
}








