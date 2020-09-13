package string;
/**
 * String֧��������ʽ�ķ���֮һ:
 * boolean matches(String regex)
 * ʹ�ø�����������ʽƥ�䵱ǰ�ַ����Ƿ����
 * ��ʽҪ��,�����򷵻�true.
 * 
 * ע��:������������ʽ���㲻ָ���߽�ƥ���
 * ��:(^...$)Ҳ������ȫƥ����֤��.
 * @author ta
 *
 */
public class MatchesDemo {
	public static void main(String[] args) {
		String email = "fancq@tedu.cn";
		/*
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
		 * 
		 */
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
		boolean match = email.matches(regex);
		if(match) {
			System.out.println("������");
		}else {
			System.out.println("��������");
		}
	}
}








