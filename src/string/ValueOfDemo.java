package string;
/**
 * �ַ����ṩ�����ɵ����ص�valueOf����,����
 * ���Ǿ�̬����.
 * static String valueOf(XXX xxx)
 * �����ǽ�����������ת��Ϊ�ַ���
 * 
 * @author ta
 *
 */
public class ValueOfDemo {
	public static void main(String[] args) {
		int a = 123;
		//��intֵת��ΪString
		String str = String.valueOf(a);	
		System.out.println(str);
		
		double dou = 123.123;
		String str2 = String.valueOf(dou);
		System.out.println(str2);
		
		//�κ��������ַ������ӽ�������ַ���
		str = a+"";
		System.out.println(str);
	}
}






