package string;
/**
 * String���Ż���ʩ���չ�������,���Ƶ���޸�
 * �ַ���������ڴ濪����,����Ч�ʲ�Ľ��.
 * �Դ�,java�ṩ��һ��ר�������޸��ַ�����API
 * java.lang.StringBuilder
 * ���ڲ�ά��һ���ɱ��char����,���е��޸Ķ���
 * ����������н��е�,��˿���С,���ܺ�.
 * �������ṩ�˱����޸��ַ�����һϵ�з���,��
 * ����:��,ɾ,��,��Ȼ�������.
 * @author ta
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		String str = "�ú�ѧϰjava";
		
		StringBuilder builder 
			= new StringBuilder(str);
		/*
		 * �ú�ѧϰjava
		 * �ú�ѧϰjava,Ϊ���Ҹ��ù���! 		
		 */
		builder.append(",Ϊ���Ҹ��ù���!");
		System.out.println(str);
		//��ȡStringBuilder�ڲ����ַ���
		str = builder.toString();
		System.out.println(str);
		/*
		 * �ú�ѧϰjava,Ϊ���Ҹ��ù���! 	
		 * �ú�ѧϰjava,����Ϊ�˸ı�����!
		 */
		builder.replace(9, 16, "����Ϊ�˸ı�����");
		System.out.println(builder);
		
		/*
		 * �ú�ѧϰjava,����Ϊ�˸ı�����!
		 * ,����Ϊ�˸ı�����!
		 */
		builder.delete(0, 8);
		System.out.println(builder);
		
		/*
		 * ,����Ϊ�˸ı�����!
		 * ����,����Ϊ�˸ı�����!
		 */
		builder.insert(0, "����");
		System.out.println(builder);
	}
}





