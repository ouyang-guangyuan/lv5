package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ʹ��RAF���ļ���д���ַ��� 
 * @author ta
 *
 */
public class WriteStringDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile("raf.txt","rw");
		String line = "ҹ������������";
		/*
		 * String�ṩ��ת��Ϊ�ֽڵķ���:
		 * byte[] getBytes()
		 * ����ǰ�ַ�������ϵͳĬ���ַ���ת��Ϊ
		 * һ���ֽ�
		 * 
		 * byte[] getBytes(String csn)
		 * ���ص�getBytes����Ҫ�����Ǵ���һ��
		 * �ַ���������ʾ�ַ���������,������
		 * �����ִ�Сд,�����ǽ���ǰ�ַ�������
		 * �������ַ���ת��Ϊһ���ֽ�,�Ƽ���
		 * ���ַ�ʽ,��Ҫ����ϵͳĬ���ַ�������.
		 * 
		 */
		byte[] data = line.getBytes("UTF-8");
		
		raf.write(data);
		
		raf.write(",�ܷ�����,".getBytes("UTF-8"));
		
		System.out.println("д�����!");
		raf.close();
	}
}





