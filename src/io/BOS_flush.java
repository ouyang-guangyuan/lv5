package io;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * ����������Ļ���������
 * @author ta
 */
public class BOS_flush {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("bos.txt");		
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);		
		bos.write("Ħ��Ħ��~��ħ��Ĳ���~".getBytes("UTF-8"));
		/*
		 * void flush()
		 * flush������OutputStream�ж���ķ���,
		 * ���е�����������и÷���,����ֻ�л���
		 * ���ĸ÷�����ʵ������.�����������и÷���
		 * ��Ŀ�������������д��ݻ��������������
		 * 
		 * flush�������ǽ����������Ѿ����������
		 * һ����д��.
		 * Ƶ���ĵ���flush���������д���Ĵ����Ӷ�
		 * ����д��Ч��,�����ܱ�֤����д���ļ�ʱ��.
		 */
//		bos.flush();		
		System.out.println("д�����!");		
		bos.close();
	}
}






