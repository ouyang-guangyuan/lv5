package integer;
/**
 * ��װ��
 * ��װ����Ϊ�˽���������Ͳ�����ֱ�Ӳ�������
 * ���󿪷�������.
 * 8���������Ͷ�Ӧ8����ͬ�İ�װ��,����6����ʾ
 * ���ֵİ�װ��̳���java.lang.Number,������
 * ���̳���Object
 * @author ta
 *
 */
public class IntegerDemo1 {
	public static void main(String[] args) {
		int d = 128;
//		Integer i1 = new Integer(d);
//		Integer i2 = new Integer(d);
		/*
		 * java�Ƽ�����ʹ�ð�װ��ľ�̬����:
		 * valueOf������������ת��Ϊ��װ��
		 */
		Integer i1 = Integer.valueOf(d);
		Integer i2 = Integer.valueOf(d);
		
		System.out.println(i1==i2);//false
		System.out.println(i1.equals(i2));//true
		
		
		//��װ��ת��Ϊ��������
		int i = i1.intValue();
		System.out.println(i);
		
		double dou = i1.doubleValue();
		System.out.println(dou);
		
		long lon = i1.longValue();
		System.out.println(lon);
		
		byte b = i1.byteValue();
		System.out.println(b);
	}
}






