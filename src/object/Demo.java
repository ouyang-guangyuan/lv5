package object;

import java.util.Arrays;

/**
 * ����Object��ط���
 * @author ta
 *
 */
public class Demo {
	public static void main(String[] args) {
		Point p = new Point(1,2);
		/*
		 * Object����������д�ķ���
		 * 1:
		 * String toString()
		 * �÷�������������ǽ�һ������ת��
		 * Ϊһ���ַ���.
		 * Object����ʵ�ֵ�toString��������
		 * ���Ǹö����"���",���ö��������
		 * ��Ϣ(��ַ).
		 * ��ʽΪ:����@��ַ
		 */
		String str = p.toString();
		System.out.println(str);
		/*
		 * System.out.println(Object obj)
		 * �÷������ǽ����������toString��������
		 * ���ַ������������̨
		 */
		System.out.println(p);
		
		
//		Point[] arr = {new Point(2,3),new Point(1,7),new Point(5,6),new Point(9,8)};
//		System.out.println(Arrays.toString(arr));
		
		
		/*
		 * 2:
		 * boolean equals(Object obj)
		 * �÷������ڱȽϵ�ǰ����(this)��
		 * ��������obj�����ݱȽ�,����������
		 * ������ͬ��equals��������ֵӦ��Ϊtrue
		 */
		Point p1 = new Point(1,2);
		
		System.out.println(p==p1);//false
		/*
		 * equals�����ڲ���д�������,Object����
		 * ����ʹ��"=="�Ƚϵ�,��ô��û��������
		 */
		System.out.println(p.equals(p1));//true
	}
}






