package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ͨ�����ÿ�ζ�д��������,����ʵ�ʶ�д�Ĵ���
 * ������߶�дЧ��.
 * 
 * ���ֽڶ�д�������д,Ч�ʲ�
 * ���д��һ��һ���ֽڵĶ�д,Ч�ʸ�
 * @author ta
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src
			= new RandomAccessFile("movie.mp4","r");
		RandomAccessFile desc
			= new RandomAccessFile("movie_cp.mp4","rw");
	
		/*
		 * int read(byte[] data)
		 * һ���Դ��ļ��ж�ȡ���������ܳ��ȵ�
		 * �ֽ���,������ȡ�������ݴ��뵽������
		 * ��,����ֵΪʵ�ʶ�ȡ�����ֽ���.
		 * ������ֵΪ-1,���ʾ�ļ�ĩβ(����û��
		 * ��ȡ���κ�����)
		 * 
		 * 
		 * void write(byte[] data)
		 * һ���Խ������ֽ������������ֽ�д���ļ�
		 * 
		 * void write(byte[] data,int s,int len)
		 * �������ֽ�������±�s����ʼ������len��
		 * �ֽ�һ����д���ļ�
		 */
		//10K
		byte[] data = new byte[1024*10];
		int len = -1;//ÿ��ʵ�ʶ�ȡ�����ֽ���
		
		long start = System.currentTimeMillis();
		while((len = src.read(data))!=-1) {
			desc.write(data,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("�������!��ʱ"+(end-start)+"ms");
		src.close();
		desc.close();
	}
}






