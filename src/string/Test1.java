package string;
/**
 * ʵ�ַ���,��ɽ�ȡ������ַ�е�����
 * @author ta
 *
 */
public class Test1 {
	public static void main(String[] args) {
		String name1 
			= getHostName("www.tedu.cn");
		String name2 
			= getHostName("http://www.google.cn");
		String name3
			= getHostName("doc.tedu.com.cn");
		System.out.println(name1);//tedu
		System.out.println(name2);//google
		System.out.println(name3);//tedu
	}
	
	public static String getHostName(String line) {
		//��һ��"."֮���һ���ַ���λ��
		int start = line.indexOf(".")+1;
		//�ڶ���"."��λ��
		int end = line.indexOf(".",start);
		return line.substring(start,end);
	}
}


