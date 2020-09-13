package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * RAF是专门用来读写文件数据的API,其基于指针
 * 对文件任意位置进行读写.
 * @author ta
 *
 */
public class RafDemo1 {
	public static void main(String[] args) throws IOException {
		/*
		 * 对当前目录下的raf.dat文件读写数据
		 */
		RandomAccessFile raf
			= new RandomAccessFile(
					"./raf.dat","rw");
		/*
		 * void write(int d)
		 * 向文件中写入1个字节,写入的是给定的int值
		 * 所对应2进制的"低八位"
		 *                            vvvvvvvv
		 * 00000000 00000000 00000000 00000001
		 */
		raf.write(1);
		
		System.out.println("写出完毕!");		
		raf.close();
		
	}
}







