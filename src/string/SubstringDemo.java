package string;
/**
 * String substring(int start,int end)
 * ��ȡ��ǰ�ַ�����ָ����Χ�ڵ��ַ���.
 * 
 * ע:java API��,ͨ��ʹ���������ֱ�ʾ��Χʱ,
 * ���Ǻ�ͷ����β��.
 * @author ta
 *
 */
public class SubstringDemo {
	public static void main(String[] args) {
		//             01234567890
		String line = "www.tedu.cn";
		
		String sub = line.substring(4,8);
		System.out.println(sub);
		
		//��ָ��λ�ÿ�ʼ��ȡ���ַ���ĩβ
		sub = line.substring(4);
		System.out.println(sub);
	}
}







