package integer;
/**
 * �������͵İ�װ������������:
 * MAX_VALUE,MIN_VALUE�ֱ��¼�����Ӧ�Ļ���
 * ���͵�ȡֵ��Χ
 * @author ta
 *
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		int imax = Integer.MAX_VALUE;
		System.out.println(imax);
		int imin = Integer.MIN_VALUE;
		System.out.println(imin);
		
		long lmax = Long.MAX_VALUE;
		System.out.println(lmax);
		long lmin = Long.MIN_VALUE;
		System.out.println(lmin);
		
		/*
		 * ��װ���ṩ��һ������,��̬����:parseXXX
		 * �÷������Խ��ַ�������Ϊ��Ӧ�Ļ�������
		 * ����,ǰ���Ǹ��ַ�������ȷ����Ҫת����
		 * �������Ϳ��Ա����ֵ.
		 */
		String str = "123";
		int a = Integer.parseInt(str);
		double dou = Double.parseDouble(str);
		System.out.println(a);//123
		System.out.println(dou);//123.123
	}
}




