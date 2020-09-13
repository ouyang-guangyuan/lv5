package io;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * ������
 * java.io.BufferedOutputStream
 * java.io.BufferedInputStream
 * ��������һ�Ը߼���,���������е���������߶�дЧ��
 * ʹ�������ڽ��ж�д����ʱ�õ��ֽڶ�дҲ����߶�д��
 * Ч��.
 * ������֮���Կ�����߶�дЧ��,����Ϊ�������ڲ���
 * һ��������(һ���ֽ�����),��������ʹ�û���������
 * ���ֶ�д(���ֽڻ���д)���ն��ᱻ������ת��Ϊ
 * ���д�����Ч��
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis 
			= new FileInputStream("music.mp3");
		BufferedInputStream bis
			= new BufferedInputStream(fis);		
		FileOutputStream fos
			= new FileOutputStream("music_cp2.mp3");
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);		
		int d = -1;
		while((d = bis.read())!=-1) {
			bos.write(d);
		}		
		System.out.println("�������!");
		bis.close();
		bos.close();
	}
}










