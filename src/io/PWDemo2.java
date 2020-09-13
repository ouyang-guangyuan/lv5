package io;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
/**
 * 自行完成流连接使用PW写出文本数据
 * @author ta
 */
public class PWDemo2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("pw2.txt");
		OutputStreamWriter osw
			= new OutputStreamWriter(fos,"UTF-8");
		BufferedWriter bw
			= new BufferedWriter(osw);
		PrintWriter pw
			= new PrintWriter(bw);		
		pw.println("");
		System.out.println("写出完毕!");
		pw.close();		
	}
}




