package io;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * �����ַ�������
 * java.io.BufferedReader
 * ����ı�����,���ҿ��԰��ж�ȡ�ַ���.
 * @author ta
 */
public class BRDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * ����ǰԴ�����������������̨
		 */
		FileInputStream fis
			= new FileInputStream("./src/io/BRDemo.java");		
		InputStreamReader isr
			= new InputStreamReader(fis);		
		BufferedReader br
			= new BufferedReader(isr);
		/*
		 * String readLine()
		 * ������ȡ�����ַ�ֱ����ȡ�����з�
		 * Ϊֹ,�����з�֮ǰ���ַ����һ���ַ�
		 * ������.�������ֵΪnull,��ʾ����ȡ��
		 * ĩβ��.
		 */
		String line = null;
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}
}







