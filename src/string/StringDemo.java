package string;
/**
 * String�ǲ������,��:
 * �ַ������󴴽���,��ʾ���ַ����ݲ��ɱ�,��
 * �ı�ض������¶���.
 * @author ta
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		/*
		 * java�����ַ�����һ���Ż�,��:
		 * �ַ���������,�����ڶ��ڴ��п��ٵ�
		 * һ��ռ�,���ڱ�������ʹ����������ʽ
		 * �������ַ�������,���ٴ�ʹ�ø�������
		 * �����µ��ַ���ʱ��ֱ�����ö�������
		 * �����µ�����ʡ�ڴ濪��.
		 */
		String s1 = "123abc";
		//s2������s1�������ַ�������
		String s2 = "123abc";
		String s3 = "123abc";
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//true
		
		//�޸����ݻᴴ���¶���
		s1 = s1 + "!";//s1����ָ��ԭ����
		System.out.println("s1:"+s1);//123abc!
		System.out.println("s2:"+s2);//123abc
		System.out.println(s1==s2);//false
		System.out.println(s2==s3);//true
		
		/*
		 * new�ؼ��ֺ�ǿ��,һ���ᴴ���¶���
		 */
		String s4 = new String("123abc");
		System.out.println("s4:"+s4);
		/*
		 * s2��s4��������ͬ���ַ�������,��Ȼ
		 * ���ݶ���"123abc",����������������
		 * �ĵ�ַ��ͬ.
		 */
		System.out.println(s4==s2);//false
		/*
		 * ͨ�����ǱȽ��ַ������ǱȽ��ַ�����
		 * ����,��˱Ƚ��ַ���ʱ���ǲ���ʹ��
		 * "==",����ʹ���ַ����ķ���equals.
		 * equals�����������Ƚ������ַ�������
		 * ����ʾ�������Ƿ���ͬ��.
		 */
		boolean tf = s2.equals(s4);
		System.out.println(tf);//true
		/*
		 * �����õ��˱�������һ������:
		 * �������ڱ���Դ����ʱ,������һ������
		 * ���ʽ�����ڱ����ڼ�ȷ�����ʱ�ͻ�
		 * ֱ�ӽ��м���,����������뵽class�ļ�
		 * ��,����JVMÿ�����г���ʱ�������ټ���.
		 * ����: int a = 1+1;
		 * �����������class��Ϊ:int a = 2;
		 * ������ַ���Ҳ�����,�ᱻ��Ϊ:
		 * String s5 = "123abc";
		 */
		String s5 = "123"+"abc";
		System.out.println("s5:"+s5);
		System.out.println(s2==s5);//true
		
		String s = "123";
		String s6 = s + "abc";
		System.out.println("s6:"+s6);
		System.out.println(s2==s6);//false
	}
}








