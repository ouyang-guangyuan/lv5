 	package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * �����ַ���
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * �������ǿ��д�ı�����,��߶�дЧ��.����
 * ���԰��ж�д�ַ���.
 * 
 * java.io.PrintWriter�����Զ���ˢ�µĻ���
 * �ַ������,�ڲ���������BufferedWriter��Ϊ
 * �仺����ٲ���.
 * 
 * 
 * @author ta
 *
 */
public class PWDemo1 {
	public static void main(String[] args) throws IOException {
		/*
		 * ��pw.txt�ļ���д���ַ���
		 * �ù��췽���ڲ����Զ����������Ӳ���,
		 * �ֱ����ӻ����ַ���,ת�������ļ���.
		 */
		PrintWriter pw 
			= new PrintWriter("pw.txt","UTF-8");
		
		pw.println("���ҵ��������,��ֹ��ҹ�ľ�.");
		pw.println("�������������,��ֹ�������.");
		
		System.out.println("д�����!");
		pw.close();
	
	}
}










