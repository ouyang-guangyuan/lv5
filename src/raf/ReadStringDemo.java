package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ı�����
 * @author ta
 *
 */
public class ReadStringDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile("raf.txt","r");
		
		byte[] data = new byte[(int)raf.length()];
		raf.read(data);
		
		String str = new String(data,"UTF-8");
		System.out.println(str);
		
		raf.close();
	}
}




