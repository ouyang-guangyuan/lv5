package string;
/**
 * int indexOf(String str)
 * ���Ҹ����ַ����ڵ�ǰ�ַ����е�λ��,����ǰ
 * �ַ������������������򷵻�ֵΪ-1.
 * @author ta
 *
 */
public class IndexOfDemo {
	public static void main(String[] args) {
		//            0123456789012345
		String str = "thinking in java";
		
		int index = str.indexOf("in");
		System.out.println(index);//2
		
		/*
		 * ���صķ����������Ǵ�ָ��λ�ÿ�ʼ
		 * ���ҵ�һ�γ���ָ���ַ���λ��
		 */
		index = str.indexOf("in", 3);
		System.out.println(index);//5
		
		//�������һ�γ���ָ���ַ�����λ��
		index = str.lastIndexOf("in");
		System.out.println(index);//9
		
		
	}
}






