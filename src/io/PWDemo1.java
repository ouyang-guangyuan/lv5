 	package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 缓冲字符流
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * 缓冲流是块读写文本数据,提高读写效率.并且
 * 可以按行读写字符串.
 * 
 * java.io.PrintWriter具有自动行刷新的缓冲
 * 字符输出流,内部总是连接BufferedWriter作为
 * 其缓冲加速操作.
 * 
 * 
 * @author ta
 *
 */
public class PWDemo1 {
	public static void main(String[] args) throws IOException {
		/*
		 * 向pw.txt文件中写入字符串
		 * 该构造方法内部会自动进行流连接操作,
		 * 分别连接缓冲字符流,转换流和文件流.
		 */
		PrintWriter pw 
			= new PrintWriter("pw.txt","UTF-8");
		
		pw.println("让我掉下眼泪的,不止昨夜的酒.");
		pw.println("让我依依不舍的,不止你的温柔.");
		
		System.out.println("写出完毕!");
		pw.close();
	
	}
}










