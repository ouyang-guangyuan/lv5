package string;
/**
 * String֧��������ʽ������:
 * String replaceAll(String regex,String str)
 * ����ǰ�ַ���������������ʽ�Ĳ����滻Ϊ
 * ����������
 * @author ta
 *
 */
public class ReplaceAllDemo {
	public static void main(String[] args) {
		String line = "abc123def456ghi789jkl";
		/*
		 * ���ַ����е����ֲ����滻Ϊ"#NUMBER#"
		 */
		line = line.replaceAll("[0-9]+", "#NUMBER#");
		System.out.println(line);
		
	}
}
