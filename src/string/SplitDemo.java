package string;

import java.util.Arrays;

/**
 * String֧��������ʽ������:
 * String[] split(String regex)
 * ����ǰ�ַ����а�������������ʽ�Ĳ��ֲ��
 * Ȼ�󽫲�ֺ���ַ�����������ʽ����.
 * @author ta
 *
 */
public class SplitDemo {
	public static void main(String[] args) {
		String line = "abc123def456ghi789jkl";
		//�������ֲ��ֲ���ַ���
//		String[] data = line.split("[0-9]+");
		/*
		 * �����ֹ���������ƥ�䵽���οɲ�ֵ�
		 * ����ʱ,�м���ֳ�һ�����ַ���.
		 * ������������ַ���ĩβ����ƥ����������
		 * ��ֳ��Ŀ��ַ����ᱻ����.
		 */
		String[] data = line.split("[0-9]");
		System.out.println(data.length);
		System.out.println(Arrays.toString(data));
	}
}







