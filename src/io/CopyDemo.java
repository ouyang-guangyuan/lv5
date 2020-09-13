package io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 使用文件流完成文件的复制工作
 * @author ta
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 1:创建文件输入流读取原文件
		 * 2:创建文件输出流用于写复制文件
		 * 3:循环从原文件读取字节写入到复制文件中
		 * 4:关闭两个流
		 */
		FileInputStream fis 
			= new FileInputStream("movie.mp4");
		FileOutputStream fos
			= new FileOutputStream("movie_cp.mp4");
		
		int len = -1;//记录每次实际读取的字节量
		byte[] data = new byte[1024*10];
		while((len = fis.read(data))!=-1) {
			fos.write(data,0,len);
		}
		
		System.out.println("复制完毕!");
		
		fos.close();
		fis.close();
	}
}






