package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 从文件中读取字节
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
		 * 从文件中读取1个字节,并以int形式
		 * 返回.若返回值为-1则表示文件末尾
		 * 
		 * 00000000 00000000 00000000 11111111
		 */
		int d = raf.read();
		System.out.println(d);
		
		d = raf.read();
		System.out.println(d);
		
		System.out.println("读取完毕!");
		raf.close();
	}
}












