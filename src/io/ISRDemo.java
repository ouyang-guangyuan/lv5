package io;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * ʹ��ת������ȡ�ı�����
 * @author ta
 */
public class ISRDemo {
	public static void main(String[] args) throws IOException {
//		RandomAccessFile raf
//			= new RandomAccessFile("osw.txt","r");
//		byte[] data = new byte[(int)raf.length()];
//		raf.read(data);
//		String str = new String(data,"UTF-8");
//		System.out.println(str);
//		raf.close();
		
		
//		FileInputStream fis
//			= new FileInputStream("osw.txt");
//		byte[] data = new byte[1000];
//		int len = fis.read(data);
//		String str = new String(data,0,len,"UTF-8");
//		System.out.println(str);
//		fis.close();
		
		
		FileInputStream fis
			= new FileInputStream("osw.txt");
		InputStreamReader isr
			= new InputStreamReader(fis,"UTF-8");
//		char[] data = new char[100];
//		int len = isr.read(data);
//		String str = new String(data,0,len);
//		System.out.println(str);		
		int d = -1;
		while((d = isr.read())!=-1) {//����һ�ζ�һ���ַ�
			System.out.print((char)d);
		}		
		isr.close();
	}
}





