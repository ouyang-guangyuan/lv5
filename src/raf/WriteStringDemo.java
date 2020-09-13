package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF向文件中写入字符串 
 * @author ta
 *
 */
public class WriteStringDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile("raf.txt","rw");
		String line = "夜空中最亮的星";
		/*
		 * String提供了转换为字节的方法:
		 * byte[] getBytes()
		 * 将当前字符串按照系统默认字符集转换为
		 * 一组字节
		 * 
		 * byte[] getBytes(String csn)
		 * 重载的getBytes方法要求我们传入一个
		 * 字符串参数表示字符集的名称,该名称
		 * 不区分大小写,作用是将当前字符串按照
		 * 给定的字符集转换为一组字节,推荐用
		 * 这种方式,不要按照系统默认字符集操作.
		 * 
		 */
		byte[] data = line.getBytes("UTF-8");
		
		raf.write(data);
		
		raf.write(",能否听清,".getBytes("UTF-8"));
		
		System.out.println("写出完毕!");
		raf.close();
	}
}





