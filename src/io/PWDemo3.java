package io;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * ʵ�ּ��׼��±�����
 * ����������,Ҫ�������ļ���,Ȼ����ļ�д����.
 * �������ڿ���̨�����ÿ���ַ���������д�뵽
 * ���ļ���,������������exitʱ,�����˳�. 
 * Ҫ��:����ʹ�������Ӵ���PW
 * @author ta
 */
public class PWDemo3 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ļ���:");
		String fileName = scanner.nextLine();		
		FileOutputStream fos
			= new FileOutputStream(fileName);
		OutputStreamWriter osw
			= new OutputStreamWriter(fos,"UTF-8");
		BufferedWriter bw
			= new BufferedWriter(osw);
		/*
		 * ����PrintWriterʱʹ�õĹ��췽����
		 * ����һ��������һ����,��ô��֧�ֵ�
		 * ��������,���������һ��booleanֵ,
		 * ��ֵΪtrueʱ�ʹ����Զ���ˢ�¹���
		 * ��ʱÿ������println����д��һ���ַ�
		 * �������Զ�flush.
		 */
		PrintWriter pw
			= new PrintWriter(bw,true);
		System.out.println("�뿪ʼ��������:");
		while(true) {
			String line = scanner.nextLine();
			if("exit".equals(line)) {
				break;
			}
			pw.println(line);
		}		
		System.out.println("�ټ�!");
		pw.close() ;		
	}
}







