package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ���ļ��ж�ȡ�ֽ�
 * @author ta
 *
 */
public class RafDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile(
					"raf.dat","r");
		/*
		 * int read()
		 * ���ļ��ж�ȡ1���ֽ�,����int��ʽ
		 * ����.������ֵΪ-1���ʾ�ļ�ĩβ
		 * 
		 * 00000000 00000000 00000000 11111111
		 */
		int d = raf.read();
		System.out.println(d);
		
		d = raf.read();
		System.out.println(d);
		
		System.out.println("��ȡ���!");
		raf.close();
	}
}












