package io;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 缓冲字符输入流
 * java.io.BufferedReader
 * 块读文本数据,并且可以按行读取字符串.
 * @author ta
 */
public class BRDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 将当前源代码内容输出到控制台
		 */
		FileInputStream fis
			= new FileInputStream("./src/io/BRDemo.java");		
		InputStreamReader isr
			= new InputStreamReader(fis);		
		BufferedReader br
			= new BufferedReader(isr);
		/*
		 * String readLine()
		 * 连续读取若干字符直到读取到换行符
		 * 为止,将换行符之前的字符组成一个字符
		 * 串返回.如果返回值为null,表示流读取到
		 * 末尾了.
		 */
		String line = null;
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}
}







