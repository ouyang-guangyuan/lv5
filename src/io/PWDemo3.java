package io;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * 实现简易记事本工具
 * 程序启动后,要求输入文件名,然后对文件写内容.
 * 将后续在控制台输入的每行字符串都按行写入到
 * 该文件中,当单独输入了exit时,程序退出. 
 * 要求:自行使用流连接创建PW
 * @author ta
 */
public class PWDemo3 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入文件名:");
		String fileName = scanner.nextLine();		
		FileOutputStream fos
			= new FileOutputStream(fileName);
		OutputStreamWriter osw
			= new OutputStreamWriter(fos,"UTF-8");
		BufferedWriter bw
			= new BufferedWriter(osw);
		/*
		 * 创建PrintWriter时使用的构造方法如
		 * 过第一个参数是一个流,那么就支持第
		 * 二个参数,这个参数是一个boolean值,
		 * 该值为true时就打开了自动行刷新功能
		 * 此时每当调用println方法写出一行字符
		 * 串都会自动flush.
		 */
		PrintWriter pw
			= new PrintWriter(bw,true);
		System.out.println("请开始输入内容:");
		while(true) {
			String line = scanner.nextLine();
			if("exit".equals(line)) {
				break;
			}
			pw.println(line);
		}		
		System.out.println("再见!");
		pw.close() ;		
	}
}







