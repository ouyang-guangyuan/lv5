package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * RAF��ר��������д�ļ����ݵ�API,�����ָ��
 * ���ļ�����λ�ý��ж�д.
 * @author ta
 *
 */
public class RafDemo1 {
	public static void main(String[] args) throws IOException {
		/*
		 * �Ե�ǰĿ¼�µ�raf.dat�ļ���д����
		 */
		RandomAccessFile raf
			= new RandomAccessFile(
					"./raf.dat","rw");
		/*
		 * void write(int d)
		 * ���ļ���д��1���ֽ�,д����Ǹ�����intֵ
		 * ����Ӧ2���Ƶ�"�Ͱ�λ"
		 *                            vvvvvvvv
		 * 00000000 00000000 00000000 00000001
		 */
		raf.write(1);
		
		System.out.println("д�����!");		
		raf.close();
		
	}
}







