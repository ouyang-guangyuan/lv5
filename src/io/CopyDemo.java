package io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * ʹ���ļ�������ļ��ĸ��ƹ���
 * @author ta
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 1:�����ļ���������ȡԭ�ļ�
		 * 2:�����ļ����������д�����ļ�
		 * 3:ѭ����ԭ�ļ���ȡ�ֽ�д�뵽�����ļ���
		 * 4:�ر�������
		 */
		FileInputStream fis 
			= new FileInputStream("movie.mp4");
		FileOutputStream fos
			= new FileOutputStream("movie_cp.mp4");
		
		int len = -1;//��¼ÿ��ʵ�ʶ�ȡ���ֽ���
		byte[] data = new byte[1024*10];
		while((len = fis.read(data))!=-1) {
			fos.write(data,0,len);
		}
		
		System.out.println("�������!");
		
		fos.close();
		fis.close();
	}
}






